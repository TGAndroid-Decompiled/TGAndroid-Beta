package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import com.google.zxing.BinaryBitmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Paint.Input$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.Path;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesStorage;

public final class ProfileActivity$$ExternalSyntheticLambda116 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;
    public final boolean f$4;

    public ProfileActivity$$ExternalSyntheticLambda116(Object obj, Object obj2, Object obj3, boolean z, boolean z2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = z;
        this.f$4 = z2;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        int i = 3;
        int i2 = 14;
        boolean z = this.f$4;
        boolean z2 = this.f$3;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        int i3 = 0;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ProfileActivity) obj3).lambda$onMemberClick$60((TLRPC.User) obj2, (String) obj, z2, z);
                break;
            case 1:
                ((Painting) obj3).paintStrokeInternal((Path) obj2, z2, z);
                Input$$ExternalSyntheticLambda5 input$$ExternalSyntheticLambda5 = (Input$$ExternalSyntheticLambda5) obj;
                if (input$$ExternalSyntheticLambda5 != null) {
                    input$$ExternalSyntheticLambda5.run();
                }
                break;
            case 2:
                RenderView renderView = RenderView.this;
                Painting painting = renderView.painting;
                Size size = renderView.painting.size;
                BinaryBitmap paintingData = painting.getPaintingData(new RectF(0.0f, 0.0f, size.width, size.height), false, z2, z);
                if (paintingData != null) {
                    ((Bitmap[]) obj2)[0] = (Bitmap) paintingData.binarizer;
                }
                ((CountDownLatch) obj).countDown();
                break;
            case 3:
                final SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) obj3;
                selectAnimatedEmojiDialog.getClass();
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(selectAnimatedEmojiDialog.currentAccount).getReactionsMap();
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final String str = (String) obj;
                boolean zFullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList3 = new ArrayList();
                HashMap map = new HashMap();
                ArrayList arrayList4 = new ArrayList();
                OAuthSheet$$ExternalSyntheticLambda5 oAuthSheet$$ExternalSyntheticLambda5 = new OAuthSheet$$ExternalSyntheticLambda5(selectAnimatedEmojiDialog, str, this.f$3, arrayList, reactionsMap, arrayList2, linkedHashSet, linkedHashSet2, arrayList4, arrayList3, this.f$4);
                int i4 = selectAnimatedEmojiDialog.type;
                if (i4 == 13) {
                    final int i5 = 0;
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i5) {
                                case 0:
                                    MediaDataController.getInstance(selectAnimatedEmojiDialog.currentAccount).getEmojiSuggestions(SelectAnimatedEmojiDialog.lastSearchKeyboardLanguage, str, false, new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(16, linkedHashSet2, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(selectAnimatedEmojiDialog.currentAccount).getAnimatedEmojiByKeywords(str, new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda33(linkedHashSet2, runnable, 0));
                                    break;
                            }
                        }
                    }, oAuthSheet$$ExternalSyntheticLambda5);
                } else if (i4 == 14) {
                    if (zFullyConsistsOfEmojis) {
                        final int i6 = 0;
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                switch (i6) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(selectAnimatedEmojiDialog.currentAccount).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i7 = 0; i7 < availableEffects.effects.size(); i7++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i7);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList).add(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = selectAnimatedEmojiDialog;
                                        MediaDataController.getInstance(selectAnimatedEmojiDialog2.currentAccount).getEmojiSuggestions(SelectAnimatedEmojiDialog.lastSearchKeyboardLanguage, str, false, new ArticleViewer$$ExternalSyntheticLambda54(selectAnimatedEmojiDialog2, arrayList2, arrayList, (Runnable) obj4, 14), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    } else {
                        final int i7 = 1;
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                switch (i7) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(selectAnimatedEmojiDialog.currentAccount).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i8 = 0; i8 < availableEffects.effects.size(); i8++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i8);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList).add(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = selectAnimatedEmojiDialog;
                                        MediaDataController.getInstance(selectAnimatedEmojiDialog2.currentAccount).getEmojiSuggestions(SelectAnimatedEmojiDialog.lastSearchKeyboardLanguage, str, false, new ArticleViewer$$ExternalSyntheticLambda54(selectAnimatedEmojiDialog2, arrayList2, arrayList, (Runnable) obj4, 14), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, oAuthSheet$$ExternalSyntheticLambda5);
                } else {
                    final int i8 = 1;
                    Utilities.doCallbacks(new PhotoViewer$$ExternalSyntheticLambda91(zFullyConsistsOfEmojis, str, linkedHashSet, i), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i8) {
                                case 0:
                                    MediaDataController.getInstance(selectAnimatedEmojiDialog.currentAccount).getEmojiSuggestions(SelectAnimatedEmojiDialog.lastSearchKeyboardLanguage, str, false, new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(16, linkedHashSet, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(selectAnimatedEmojiDialog.currentAccount).getAnimatedEmojiByKeywords(str, new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda33(linkedHashSet, runnable, 0));
                                    break;
                            }
                        }
                    }, new GiftSheet$$ExternalSyntheticLambda23(selectAnimatedEmojiDialog, (String[]) obj2, str, linkedHashSet, 12), new ProfileActivity$$ExternalSyntheticLambda114(selectAnimatedEmojiDialog, zFullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList), new GiftSheet$$ExternalSyntheticLambda23(selectAnimatedEmojiDialog, str, arrayList3, map, 13), new ArticleViewer$$ExternalSyntheticLambda33(selectAnimatedEmojiDialog, str, arrayList4, i2), oAuthSheet$$ExternalSyntheticLambda5);
                }
                break;
            case 4:
                ((PeerStoriesView.AnonymousClass38) obj3).onReactionClickedInternal((View) obj2, (ReactionsLayoutInBubble.VisibleReaction) obj, this.f$3, this.f$4, false);
                break;
            case 5:
                StoriesController storiesController = (StoriesController) obj3;
                if (z2) {
                    storiesController.loadingFromServerHidden = false;
                } else {
                    storiesController.loadingFromServer = false;
                }
                StringBuilder sb = new StringBuilder("StoriesController loaded stories from server state=");
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                sb.append(tL_stories_getAllStories.state);
                sb.append(" more=");
                sb.append(tL_stories_getAllStories.next);
                sb.append("  ");
                TLObject tLObject = (TLObject) obj;
                sb.append(tLObject);
                FileLog.d(sb.toString());
                boolean z3 = tLObject instanceof TL_stories.TL_stories_allStories;
                int i9 = storiesController.currentAccount;
                SharedPreferences sharedPreferences = storiesController.mainSettings;
                if (z3) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i9).putUsersAndChats(tL_stories_allStories.users, null, true, true);
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
                    storiesController.processAllStoriesResponse(tL_stories_allStories, z2, false, z);
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
                        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    }
                }
                break;
            default:
                StoriesStorage storiesStorage = (StoriesStorage) obj3;
                MessagesStorage messagesStorage = storiesStorage.storage;
                SQLiteDatabase database = messagesStorage.getDatabase();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList5 = (ArrayList) obj2;
                    if (i10 >= arrayList5.size()) {
                        if (!z2) {
                            try {
                                SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                                ArrayList arrayList6 = new ArrayList();
                                while (sQLiteCursorQueryFinalized.next()) {
                                    long jLongValue = sQLiteCursorQueryFinalized.longValue(i3);
                                    int i11 = storiesStorage.currentAccount;
                                    if (jLongValue > 0) {
                                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(jLongValue));
                                        if (user == null) {
                                            user = MessagesStorage.getInstance(i11).getUser(jLongValue);
                                        }
                                        if (user == null || (user.stories_hidden == z && !arrayList6.contains(Long.valueOf(jLongValue)))) {
                                            arrayList6.add(Long.valueOf(jLongValue));
                                        }
                                    } else {
                                        long j = -jLongValue;
                                        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(j));
                                        if (chat == null) {
                                            chat = MessagesStorage.getInstance(i11).getChat(j);
                                        }
                                        if (chat == null || (chat.stories_hidden == z && !arrayList6.contains(Long.valueOf(jLongValue)))) {
                                            arrayList6.add(Long.valueOf(jLongValue));
                                        }
                                    }
                                    i3 = 0;
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList6));
                                }
                                Locale locale = Locale.US;
                                database.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList6) + ")").stepThis().dispose();
                            } catch (Throwable th) {
                                messagesStorage.checkSQLException(th);
                            }
                        }
                        for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList5.get(i12);
                            storiesStorage.putStoriesInternal(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                        }
                        AndroidUtilities.runOnUIThread((VoIPFragment$$ExternalSyntheticLambda31) obj);
                    } else {
                        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList5.get(i10);
                        long peerDialogId = DialogObject.getPeerDialogId(peerStories2.peer);
                        try {
                            ArrayList<TL_stories.StoryItem> arrayList7 = peerStories2.stories;
                            for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                                if (arrayList7.get(i13) instanceof TL_stories.TL_storyItemSkipped) {
                                    TL_stories.StoryItem storyInternal = storiesStorage.getStoryInternal(arrayList7.get(i13).id, peerDialogId);
                                    try {
                                        if (storyInternal instanceof TL_stories.TL_storyItem) {
                                            arrayList7.set(i13, storyInternal);
                                        } else {
                                            continue;
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        FileLog.e(e);
                                        i10++;
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        i10++;
                    }
                    break;
                }
                break;
        }
    }

    public ProfileActivity$$ExternalSyntheticLambda116(Object obj, Object obj2, boolean z, boolean z2, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$2 = runnable;
    }

    public ProfileActivity$$ExternalSyntheticLambda116(RenderView.CanvasInternal canvasInternal, boolean z, boolean z2, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.$r8$classId = 2;
        this.f$0 = canvasInternal;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$1 = bitmapArr;
        this.f$2 = countDownLatch;
    }

    public ProfileActivity$$ExternalSyntheticLambda116(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, String str, boolean z, boolean z2, String[] strArr) {
        this.$r8$classId = 3;
        this.f$0 = selectAnimatedEmojiDialog;
        this.f$2 = str;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$1 = strArr;
    }

    public ProfileActivity$$ExternalSyntheticLambda116(StoriesController storiesController, boolean z, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z2) {
        this.$r8$classId = 5;
        this.f$0 = storiesController;
        this.f$3 = z;
        this.f$1 = tL_stories_getAllStories;
        this.f$2 = tLObject;
        this.f$4 = z2;
    }
}
