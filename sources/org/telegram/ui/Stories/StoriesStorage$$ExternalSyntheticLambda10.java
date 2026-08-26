package org.telegram.ui.Stories;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Paint.Input$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.Path;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;

public final class StoriesStorage$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final boolean f$3;
    public final Object f$4;

    public StoriesStorage$$ExternalSyntheticLambda10(Object obj, Object obj2, boolean z, boolean z2, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StoriesStorage storiesStorage = (StoriesStorage) this.f$0;
                MessagesStorage messagesStorage = storiesStorage.storage;
                SQLiteDatabase database = messagesStorage.getDatabase();
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) this.f$1;
                    if (i >= arrayList.size()) {
                        if (!this.f$2) {
                            try {
                                SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                                ArrayList arrayList2 = new ArrayList();
                                while (sQLiteCursorQueryFinalized.next()) {
                                    long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                                    boolean z = this.f$3;
                                    int i2 = storiesStorage.currentAccount;
                                    if (jLongValue > 0) {
                                        TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(jLongValue));
                                        if (user == null) {
                                            user = MessagesStorage.getInstance(i2).getUser(jLongValue);
                                        }
                                        if (user == null || (user.stories_hidden == z && !arrayList2.contains(Long.valueOf(jLongValue)))) {
                                            arrayList2.add(Long.valueOf(jLongValue));
                                        }
                                    } else {
                                        long j = -jLongValue;
                                        TLRPC.Chat chat = MessagesController.getInstance(i2).getChat(Long.valueOf(j));
                                        if (chat == null) {
                                            chat = MessagesStorage.getInstance(i2).getChat(j);
                                        }
                                        if (chat == null || (chat.stories_hidden == z && !arrayList2.contains(Long.valueOf(jLongValue)))) {
                                            arrayList2.add(Long.valueOf(jLongValue));
                                        }
                                    }
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList2));
                                }
                                Locale locale = Locale.US;
                                database.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList2) + ")").stepThis().dispose();
                            } catch (Throwable th) {
                                messagesStorage.checkSQLException(th);
                            }
                        }
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i3);
                            storiesStorage.putStoriesInternal(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                        }
                        AndroidUtilities.runOnUIThread((GiftSheet$$ExternalSyntheticLambda2) this.f$4);
                    } else {
                        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i);
                        long peerDialogId = DialogObject.getPeerDialogId(peerStories2.peer);
                        try {
                            ArrayList<TL_stories.StoryItem> arrayList3 = peerStories2.stories;
                            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                                if (arrayList3.get(i4) instanceof TL_stories.TL_storyItemSkipped) {
                                    TL_stories.StoryItem storyInternal = storiesStorage.getStoryInternal(arrayList3.get(i4).id, peerDialogId);
                                    if (storyInternal instanceof TL_stories.TL_storyItem) {
                                        arrayList3.set(i4, storyInternal);
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        i++;
                    }
                    break;
                }
                break;
            case 1:
                ((Painting) this.f$0).paintStrokeInternal((Path) this.f$1, this.f$2, this.f$3);
                Input$$ExternalSyntheticLambda5 input$$ExternalSyntheticLambda5 = (Input$$ExternalSyntheticLambda5) this.f$4;
                if (input$$ExternalSyntheticLambda5 != null) {
                    input$$ExternalSyntheticLambda5.run();
                }
                break;
            case 2:
                RenderView renderView = RenderView.this;
                Painting painting = renderView.painting;
                Size size = renderView.painting.size;
                Stripe paintingData = painting.getPaintingData(new RectF(0.0f, 0.0f, size.width, size.height), false, this.f$2, this.f$3);
                if (paintingData != null) {
                    ((Bitmap[]) this.f$1)[0] = (Bitmap) paintingData.tokenCreator;
                }
                ((CountDownLatch) this.f$4).countDown();
                break;
            default:
                StoriesController storiesController = (StoriesController) this.f$0;
                boolean z2 = this.f$2;
                if (z2) {
                    storiesController.loadingFromServerHidden = false;
                } else {
                    storiesController.loadingFromServer = false;
                }
                StringBuilder sb = new StringBuilder("StoriesController loaded stories from server state=");
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) this.f$1;
                sb.append(tL_stories_getAllStories.state);
                sb.append(" more=");
                sb.append(tL_stories_getAllStories.next);
                sb.append("  ");
                TLObject tLObject = (TLObject) this.f$4;
                sb.append(tLObject);
                FileLog.d(sb.toString());
                boolean z3 = tLObject instanceof TL_stories.TL_stories_allStories;
                int i5 = storiesController.currentAccount;
                SharedPreferences sharedPreferences = storiesController.mainSettings;
                if (z3) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i5).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (z2) {
                        storiesController.totalStoriesCountHidden = tL_stories_allStories.count;
                        storiesController.hasMoreHidden = tL_stories_allStories.has_more;
                        storiesController.stateHidden = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", storiesController.stateHidden).putBoolean("last_stories_has_more_hidden", storiesController.hasMoreHidden).putInt("total_stores_hidden", storiesController.totalStoriesCountHidden).apply();
                    } else {
                        storiesController.totalStoriesCount = tL_stories_allStories.count;
                        storiesController.hasMore = tL_stories_allStories.has_more;
                        storiesController.state = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", storiesController.state).putBoolean("last_stories_has_more", storiesController.hasMore).putInt("total_stores", storiesController.totalStoriesCount).apply();
                    }
                    storiesController.processAllStoriesResponse(tL_stories_allStories, z2, false, this.f$3);
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (z2) {
                        storiesController.hasMoreHidden = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        storiesController.stateHidden = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", storiesController.stateHidden).apply();
                    } else {
                        storiesController.hasMore = sharedPreferences.getBoolean("last_stories_has_more", false);
                        storiesController.state = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", storiesController.state).apply();
                    }
                    if (z2 ? storiesController.hasMoreHidden : storiesController.hasMore) {
                        NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    }
                }
                break;
        }
    }

    public StoriesStorage$$ExternalSyntheticLambda10(RenderView.CanvasInternal canvasInternal, boolean z, boolean z2, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.$r8$classId = 2;
        this.f$0 = canvasInternal;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$1 = bitmapArr;
        this.f$4 = countDownLatch;
    }

    public StoriesStorage$$ExternalSyntheticLambda10(StoriesController storiesController, boolean z, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z2) {
        this.$r8$classId = 3;
        this.f$0 = storiesController;
        this.f$2 = z;
        this.f$1 = tL_stories_getAllStories;
        this.f$4 = tLObject;
        this.f$3 = z2;
    }
}
