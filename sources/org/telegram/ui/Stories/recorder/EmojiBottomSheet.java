package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_contacts_resolveUsername;
import org.telegram.tgnet.TLRPC$TL_contacts_resolvedPeer;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetShortName;
import org.telegram.tgnet.TLRPC$TL_messages_getInlineBotResults;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_stickerPack;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebDocument;
import org.telegram.tgnet.TLRPC$messages_BotResults;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CloseProgressDrawable2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DrawingInBackgroundThreadDrawable;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchStateDrawable;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.StickerCategoriesListView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stories.StoryReactionWidgetBackground;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.WrappedResourceProvider;
public class EmojiBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public static int savedPosition = 1;
    private int categoryIndex;
    private Utilities.Callback2<Bitmap, Float> drawBlurBitmap;
    private float maxPadding;
    private Utilities.Callback3<Object, TLRPC$Document, Boolean> onDocumentSelected;
    private Utilities.Callback<Integer> onWidgetSelected;
    private String query;
    private final TabsView tabsView;
    private float top;
    private final ViewPagerFixed viewPager;
    private boolean wasKeyboardVisible;
    public final TLRPC$Document widgets;

    public static void lambda$openPremium$0(DialogInterface dialogInterface) {
    }

    public boolean canClickWidget(Integer num) {
        return true;
    }

    public boolean canShowWidget(Integer num) {
        throw null;
    }

    protected boolean checkAudioPermission(Runnable runnable) {
        return true;
    }

    public static void access$4700(EmojiBottomSheet emojiBottomSheet, int i) {
        emojiBottomSheet.lambda$onWidgetClick$1(i);
    }

    static float access$6016(EmojiBottomSheet emojiBottomSheet, float f) {
        float f2 = emojiBottomSheet.top + f;
        emojiBottomSheet.top = f2;
        return f2;
    }

    public abstract class IPage extends FrameLayout {
        public int currentType;

        public void bind(int i) {
        }

        public float top() {
            return 0.0f;
        }

        public void updateTops() {
        }

        public IPage(EmojiBottomSheet emojiBottomSheet, Context context) {
            super(context);
        }
    }

    public class GifPage extends IPage {
        public GifAdapter adapter;
        private ArrayList<TLRPC$BotInlineResult> gifs;
        public ExtendedGridLayoutManager layoutManager;
        public RecyclerListView listView;
        private ContentPreviewViewer.ContentPreviewViewerDelegate previewDelegate;
        public SearchField searchField;

        public GifPage(Context context) {
            super(EmojiBottomSheet.this, context);
            this.previewDelegate = new ContentPreviewViewer.ContentPreviewViewerDelegate(this) {
                @Override
                public boolean can() {
                    return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$can(this);
                }

                @Override
                public boolean canSchedule() {
                    return false;
                }

                @Override
                public Boolean canSetAsStatus(TLRPC$Document tLRPC$Document) {
                    return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSetAsStatus(this, tLRPC$Document);
                }

                @Override
                public void copyEmoji(TLRPC$Document tLRPC$Document) {
                    ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$copyEmoji(this, tLRPC$Document);
                }

                @Override
                public long getDialogId() {
                    return 0L;
                }

                @Override
                public String getQuery(boolean z) {
                    return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z);
                }

                @Override
                public void gifAddedOrDeleted() {
                    ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
                }

                @Override
                public boolean isInScheduleMode() {
                    return false;
                }

                @Override
                public boolean isPhotoEditor() {
                    return true;
                }

                @Override
                public boolean needCopy(TLRPC$Document tLRPC$Document) {
                    return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needCopy(this, tLRPC$Document);
                }

                @Override
                public boolean needMenu() {
                    return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needMenu(this);
                }

                @Override
                public boolean needOpen() {
                    return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needOpen(this);
                }

                @Override
                public boolean needRemove() {
                    return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemove(this);
                }

                @Override
                public boolean needRemoveFromRecent(TLRPC$Document tLRPC$Document) {
                    return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemoveFromRecent(this, tLRPC$Document);
                }

                @Override
                public boolean needSend(int i) {
                    return false;
                }

                @Override
                public void openSet(TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z) {
                }

                @Override
                public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                    ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$remove(this, importingSticker);
                }

                @Override
                public void removeFromRecent(TLRPC$Document tLRPC$Document) {
                    ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$removeFromRecent(this, tLRPC$Document);
                }

                @Override
                public void resetTouch() {
                    ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$resetTouch(this);
                }

                @Override
                public void sendEmoji(TLRPC$Document tLRPC$Document) {
                    ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendEmoji(this, tLRPC$Document);
                }

                @Override
                public void sendGif(Object obj, Object obj2, boolean z, int i) {
                    ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj, obj2, z, i);
                }

                @Override
                public void sendSticker(TLRPC$Document tLRPC$Document, String str, Object obj, boolean z, int i) {
                    ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, tLRPC$Document, str, obj, z, i);
                }

                @Override
                public void setAsEmojiStatus(TLRPC$Document tLRPC$Document, Integer num) {
                    ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setAsEmojiStatus(this, tLRPC$Document, num);
                }
            };
            this.gifs = new ArrayList<>();
            new HashMap();
            RecyclerListView recyclerListView = new RecyclerListView(context, EmojiBottomSheet.this) {
                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                    GifPage gifPage = GifPage.this;
                    return super.onInterceptTouchEvent(motionEvent) || contentPreviewViewer.onInterceptTouchEvent(motionEvent, gifPage.listView, 0, gifPage.previewDelegate, this.resourcesProvider);
                }
            };
            this.listView = recyclerListView;
            GifAdapter gifAdapter = new GifAdapter();
            this.adapter = gifAdapter;
            recyclerListView.setAdapter(gifAdapter);
            RecyclerListView recyclerListView2 = this.listView;
            GifLayoutManager gifLayoutManager = new GifLayoutManager(context);
            this.layoutManager = gifLayoutManager;
            recyclerListView2.setLayoutManager(gifLayoutManager);
            this.listView.addItemDecoration(new RecyclerView.ItemDecoration(EmojiBottomSheet.this) {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    rect.right = GifPage.this.layoutManager.isLastInRow(recyclerView.getChildAdapterPosition(view) + (-1)) ? 0 : AndroidUtilities.dp(4.0f);
                    rect.bottom = AndroidUtilities.dp(4.0f);
                }
            });
            this.listView.setClipToPadding(true);
            this.listView.setVerticalScrollBarEnabled(false);
            final RecyclerListView.OnItemClickListener onItemClickListener = new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i) {
                    EmojiBottomSheet.GifPage.this.lambda$new$0(view, i);
                }
            };
            this.listView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$new$1;
                    lambda$new$1 = EmojiBottomSheet.GifPage.this.lambda$new$1(onItemClickListener, view, motionEvent);
                    return lambda$new$1;
                }
            });
            this.listView.setOnItemClickListener(onItemClickListener);
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener(EmojiBottomSheet.this) {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    SearchField searchField;
                    ((BottomSheet) EmojiBottomSheet.this).containerView.invalidate();
                    if (((BottomSheet) EmojiBottomSheet.this).keyboardVisible) {
                        GifPage gifPage = GifPage.this;
                        if (gifPage.listView.scrollingByUser && (searchField = gifPage.searchField) != null && searchField.editText != null) {
                            EmojiBottomSheet.this.closeKeyboard();
                        }
                    }
                    if (GifPage.this.layoutManager.findLastCompletelyVisibleItemPosition() + 3 >= GifPage.this.adapter.getItemCount() - 1) {
                        GifPage.this.adapter.request();
                    }
                }
            });
            addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
            SearchField searchField = new SearchField(context, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider);
            this.searchField = searchField;
            searchField.setOnSearchQuery(new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    EmojiBottomSheet.GifPage.this.lambda$new$2((String) obj, (Integer) obj2);
                }
            });
            addView(this.searchField, LayoutHelper.createFrame(-1, -2, 48));
        }

        public void lambda$new$0(View view, int i) {
            TLRPC$BotInlineResult tLRPC$BotInlineResult;
            TLRPC$Document tLRPC$Document;
            int i2 = i - 1;
            if (i2 < 0 || i2 >= this.gifs.size() || (tLRPC$BotInlineResult = this.gifs.get(i2)) == null || (tLRPC$Document = tLRPC$BotInlineResult.document) == null) {
                return;
            }
            if (EmojiBottomSheet.this.onDocumentSelected != null) {
                EmojiBottomSheet.this.onDocumentSelected.run(tLRPC$BotInlineResult, tLRPC$Document, Boolean.TRUE);
            }
            EmojiBottomSheet.this.dismiss();
        }

        public boolean lambda$new$1(RecyclerListView.OnItemClickListener onItemClickListener, View view, MotionEvent motionEvent) {
            return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.listView, 0, onItemClickListener, this.previewDelegate, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider);
        }

        public void lambda$new$2(String str, Integer num) {
            EmojiBottomSheet.this.query = str;
            EmojiBottomSheet.this.categoryIndex = num.intValue();
            this.adapter.updateItems(str);
        }

        @Override
        public float top() {
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return Math.max(0, childAt.getBottom());
                }
            }
            return 0.0f;
        }

        @Override
        public void updateTops() {
            this.searchField.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, top()));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setPadding(((BottomSheet) EmojiBottomSheet.this).backgroundPaddingLeft, 0, ((BottomSheet) EmojiBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.navigationBarHeight);
            super.onMeasure(i, i2);
        }

        @Override
        public void bind(int i) {
            this.adapter.updateItems(null);
        }

        public class GifAdapter extends RecyclerListView.SelectionAdapter {
            private TLRPC$User bot;
            private int currentReqId;
            private String offset;
            private String query;
            private boolean requestedBot;
            private boolean requesting;
            private Runnable searchRunnable;

            @Override
            public int getItemViewType(int i) {
                return i == 0 ? 0 : 1;
            }

            private GifAdapter() {
                this.searchRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        EmojiBottomSheet.GifPage.GifAdapter.this.request();
                    }
                };
                this.currentReqId = -1;
                this.requesting = false;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                ContextLinkCell contextLinkCell;
                if (i == 0) {
                    contextLinkCell = new View(GifPage.this.getContext());
                } else {
                    ContextLinkCell contextLinkCell2 = new ContextLinkCell(GifPage.this.getContext());
                    contextLinkCell2.getPhotoImage().setLayerNum(7);
                    contextLinkCell2.allowButtonBounce(true);
                    contextLinkCell2.setIsKeyboard(true);
                    contextLinkCell2.setCanPreviewGif(true);
                    contextLinkCell = contextLinkCell2;
                }
                return new RecyclerListView.Holder(contextLinkCell);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int itemViewType = viewHolder.getItemViewType();
                if (itemViewType == 0) {
                    viewHolder.itemView.setTag(34);
                    viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, (int) EmojiBottomSheet.this.maxPadding));
                } else if (itemViewType == 1) {
                    ((ContextLinkCell) viewHolder.itemView).setLink((TLRPC$BotInlineResult) GifPage.this.gifs.get(i - 1), this.bot, true, false, false, true);
                }
            }

            @Override
            public int getItemCount() {
                return GifPage.this.gifs.size() + 1;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 1;
            }

            public void updateItems(String str) {
                if (!TextUtils.equals(this.query, str)) {
                    if (this.currentReqId != -1) {
                        ConnectionsManager.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).cancelRequest(this.currentReqId, true);
                        this.currentReqId = -1;
                    }
                    this.requesting = false;
                    this.offset = "";
                }
                this.query = str;
                AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
                if (TextUtils.isEmpty(str)) {
                    GifPage.this.gifs.clear();
                    GifPage.this.searchField.showProgress(false);
                    notifyDataSetChanged();
                    return;
                }
                GifPage.this.searchField.showProgress(true);
                AndroidUtilities.runOnUIThread(this.searchRunnable, 1500L);
            }

            public void request() {
                if (this.requesting) {
                    return;
                }
                this.requesting = true;
                GifPage.this.searchField.showProgress(true);
                if (this.currentReqId >= 0) {
                    ConnectionsManager.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).cancelRequest(this.currentReqId, true);
                    this.currentReqId = -1;
                }
                if (this.bot == null) {
                    TLObject userOrChat = MessagesController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).getUserOrChat(MessagesController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).gifSearchBot);
                    if (userOrChat instanceof TLRPC$User) {
                        this.bot = (TLRPC$User) userOrChat;
                    }
                }
                TLRPC$User tLRPC$User = this.bot;
                if (tLRPC$User == null && !this.requestedBot) {
                    TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername = new TLRPC$TL_contacts_resolveUsername();
                    tLRPC$TL_contacts_resolveUsername.username = MessagesController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).gifSearchBot;
                    this.currentReqId = ConnectionsManager.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).sendRequest(tLRPC$TL_contacts_resolveUsername, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            EmojiBottomSheet.GifPage.GifAdapter.this.lambda$request$1(tLObject, tLRPC$TL_error);
                        }
                    });
                } else if (tLRPC$User == null) {
                } else {
                    final TLRPC$TL_messages_getInlineBotResults tLRPC$TL_messages_getInlineBotResults = new TLRPC$TL_messages_getInlineBotResults();
                    tLRPC$TL_messages_getInlineBotResults.bot = MessagesController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).getInputUser(this.bot);
                    String str = this.query;
                    if (str == null) {
                        str = "";
                    }
                    tLRPC$TL_messages_getInlineBotResults.query = str;
                    final boolean isEmpty = TextUtils.isEmpty(this.offset);
                    String str2 = this.offset;
                    tLRPC$TL_messages_getInlineBotResults.offset = str2 != null ? str2 : "";
                    tLRPC$TL_messages_getInlineBotResults.peer = new TLRPC$TL_inputPeerEmpty();
                    final String str3 = "gif_search_" + tLRPC$TL_messages_getInlineBotResults.query + "_" + tLRPC$TL_messages_getInlineBotResults.offset;
                    MessagesStorage.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).getBotCache(str3, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            EmojiBottomSheet.GifPage.GifAdapter.this.lambda$request$5(isEmpty, tLRPC$TL_messages_getInlineBotResults, str3, tLObject, tLRPC$TL_error);
                        }
                    });
                }
            }

            public void lambda$request$1(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        EmojiBottomSheet.GifPage.GifAdapter.this.lambda$request$0(tLObject);
                    }
                });
            }

            public void lambda$request$0(TLObject tLObject) {
                if (tLObject instanceof TLRPC$TL_contacts_resolvedPeer) {
                    TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
                    MessagesController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).putUsers(tLRPC$TL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).putChats(tLRPC$TL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, tLRPC$TL_contacts_resolvedPeer.chats, true, true);
                }
                this.requestedBot = true;
                request();
            }

            public void lambda$request$5(final boolean z, final TLRPC$TL_messages_getInlineBotResults tLRPC$TL_messages_getInlineBotResults, final String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        EmojiBottomSheet.GifPage.GifAdapter.this.lambda$request$4(tLObject, z, tLRPC$TL_messages_getInlineBotResults, str);
                    }
                });
            }

            public void lambda$request$4(TLObject tLObject, final boolean z, TLRPC$TL_messages_getInlineBotResults tLRPC$TL_messages_getInlineBotResults, final String str) {
                if (this.requesting) {
                    if (!(tLObject instanceof TLRPC$messages_BotResults)) {
                        this.currentReqId = ConnectionsManager.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).sendRequest(tLRPC$TL_messages_getInlineBotResults, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                                EmojiBottomSheet.GifPage.GifAdapter.this.lambda$request$3(str, z, tLObject2, tLRPC$TL_error);
                            }
                        });
                        return;
                    }
                    TLRPC$messages_BotResults tLRPC$messages_BotResults = (TLRPC$messages_BotResults) tLObject;
                    this.offset = tLRPC$messages_BotResults.next_offset;
                    if (z) {
                        GifPage.this.gifs.clear();
                    }
                    int size = GifPage.this.gifs.size();
                    GifPage.this.gifs.addAll(tLRPC$messages_BotResults.results);
                    if (!z) {
                        notifyItemRangeInserted(size, GifPage.this.gifs.size() - size);
                    } else {
                        notifyDataSetChanged();
                    }
                    GifPage.this.searchField.showProgress(false);
                    this.requesting = false;
                }
            }

            public void lambda$request$3(final String str, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        EmojiBottomSheet.GifPage.GifAdapter.this.lambda$request$2(tLObject, str, z);
                    }
                });
            }

            public void lambda$request$2(TLObject tLObject, String str, boolean z) {
                if (this.requesting) {
                    if (tLObject instanceof TLRPC$messages_BotResults) {
                        TLRPC$messages_BotResults tLRPC$messages_BotResults = (TLRPC$messages_BotResults) tLObject;
                        MessagesStorage.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).saveBotCache(str, tLRPC$messages_BotResults);
                        this.offset = tLRPC$messages_BotResults.next_offset;
                        if (z) {
                            GifPage.this.gifs.clear();
                        }
                        int size = GifPage.this.gifs.size();
                        GifPage.this.gifs.addAll(tLRPC$messages_BotResults.results);
                        if (!z) {
                            notifyItemRangeInserted(size, GifPage.this.gifs.size() - size);
                        } else {
                            notifyDataSetChanged();
                        }
                    }
                    GifPage.this.searchField.showProgress(false);
                    this.requesting = false;
                }
            }
        }

        private class GifLayoutManager extends ExtendedGridLayoutManager {
            private final Size size;

            public GifLayoutManager(Context context) {
                super(context, 100, true);
                this.size = new Size();
                setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(GifPage.this) {
                    @Override
                    public int getSpanSize(int i) {
                        if (i == 0) {
                            return GifLayoutManager.this.getSpanCount();
                        }
                        return GifLayoutManager.this.getSpanSizeForItem(i - 1);
                    }
                });
            }

            @Override
            public int getFlowItemCount() {
                return getItemCount() - 1;
            }

            @Override
            protected Size getSizeForItem(int i) {
                List<TLRPC$DocumentAttribute> list;
                TLRPC$Document tLRPC$Document = null;
                List<TLRPC$DocumentAttribute> list2 = null;
                if (i < 0 || i >= GifPage.this.gifs.size()) {
                    list = null;
                } else {
                    TLRPC$BotInlineResult tLRPC$BotInlineResult = (TLRPC$BotInlineResult) GifPage.this.gifs.get(i);
                    TLRPC$Document tLRPC$Document2 = tLRPC$BotInlineResult.document;
                    if (tLRPC$Document2 != null) {
                        list2 = tLRPC$Document2.attributes;
                    } else {
                        TLRPC$WebDocument tLRPC$WebDocument = tLRPC$BotInlineResult.content;
                        if (tLRPC$WebDocument != null) {
                            list2 = tLRPC$WebDocument.attributes;
                        } else {
                            TLRPC$WebDocument tLRPC$WebDocument2 = tLRPC$BotInlineResult.thumb;
                            if (tLRPC$WebDocument2 != null) {
                                list2 = tLRPC$WebDocument2.attributes;
                            }
                        }
                    }
                    list = list2;
                    tLRPC$Document = tLRPC$Document2;
                }
                return getSizeForItem(tLRPC$Document, list);
            }

            public Size getSizeForItem(TLRPC$Document tLRPC$Document, List<TLRPC$DocumentAttribute> list) {
                TLRPC$PhotoSize closestPhotoSizeWithSize;
                int i;
                int i2;
                Size size = this.size;
                size.height = 100.0f;
                size.width = 100.0f;
                if (tLRPC$Document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90)) != null && (i = closestPhotoSizeWithSize.w) != 0 && (i2 = closestPhotoSizeWithSize.h) != 0) {
                    Size size2 = this.size;
                    size2.width = i;
                    size2.height = i2;
                }
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        TLRPC$DocumentAttribute tLRPC$DocumentAttribute = list.get(i3);
                        if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo)) {
                            Size size3 = this.size;
                            size3.width = tLRPC$DocumentAttribute.w;
                            size3.height = tLRPC$DocumentAttribute.h;
                            break;
                        }
                    }
                }
                return this.size;
            }
        }
    }

    public class Page extends IPage {
        public Adapter adapter;
        public GridLayoutManager layoutManager;
        public EmojiListView listView;
        private float lockTop;
        private boolean resetOnce;
        public SearchField searchField;
        public int spanCount;
        public EmojiTabsStrip tabsStrip;

        public Page(Context context) {
            super(EmojiBottomSheet.this, context);
            this.spanCount = 8;
            this.lockTop = -1.0f;
            this.resetOnce = false;
            EmojiListView emojiListView = new EmojiListView(context);
            this.listView = emojiListView;
            Adapter adapter = new Adapter();
            this.adapter = adapter;
            emojiListView.setAdapter(adapter);
            EmojiListView emojiListView2 = this.listView;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, this.spanCount);
            this.layoutManager = gridLayoutManager;
            emojiListView2.setLayoutManager(gridLayoutManager);
            this.listView.setClipToPadding(true);
            this.listView.setVerticalScrollBarEnabled(false);
            this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(EmojiBottomSheet.this) {
                @Override
                public int getSpanSize(int i) {
                    if (Page.this.adapter.getItemViewType(i) != 2) {
                        return Page.this.spanCount;
                    }
                    return 1;
                }
            });
            this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i) {
                    EmojiBottomSheet.Page.this.lambda$new$0(view, i);
                }
            });
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener(EmojiBottomSheet.this) {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    int i3;
                    SearchField searchField;
                    ((BottomSheet) EmojiBottomSheet.this).containerView.invalidate();
                    int i4 = -1;
                    if (Page.this.lockTop < 0.0f) {
                        i3 = Page.this.layoutManager.findFirstCompletelyVisibleItemPosition();
                    } else {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= Page.this.listView.getChildCount()) {
                                i3 = -1;
                                break;
                            }
                            View childAt = Page.this.listView.getChildAt(i5);
                            if (childAt.getY() + childAt.getHeight() > Page.this.lockTop + Page.this.listView.getPaddingTop()) {
                                i3 = Page.this.listView.getChildAdapterPosition(childAt);
                                break;
                            }
                            i5++;
                        }
                        if (i3 == -1) {
                            return;
                        }
                    }
                    int size = Page.this.adapter.positionToSection.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int keyAt = Page.this.adapter.positionToSection.keyAt(size);
                        int valueAt = Page.this.adapter.positionToSection.valueAt(size);
                        if (i3 >= keyAt) {
                            i4 = valueAt;
                            break;
                        }
                        size--;
                    }
                    if (i4 >= 0) {
                        Page.this.tabsStrip.select(i4, true);
                    }
                    if (((BottomSheet) EmojiBottomSheet.this).keyboardVisible) {
                        Page page = Page.this;
                        if (!page.listView.scrollingByUser || (searchField = page.searchField) == null || searchField.editText == null) {
                            return;
                        }
                        EmojiBottomSheet.this.closeKeyboard();
                    }
                }

                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (i == 0 && Page.this.lockTop >= 0.0f && Page.this.atTop()) {
                        Page.this.lockTop = -1.0f;
                    }
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setAddDelay(0L);
            defaultItemAnimator.setAddDuration(220L);
            defaultItemAnimator.setMoveDuration(220L);
            defaultItemAnimator.setChangeDuration(160L);
            defaultItemAnimator.setMoveInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.listView.setItemAnimator(defaultItemAnimator);
            addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
            SearchField searchField = new SearchField(context, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider);
            this.searchField = searchField;
            searchField.setOnSearchQuery(new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    EmojiBottomSheet.Page.this.lambda$new$1((String) obj, (Integer) obj2);
                }
            });
            addView(this.searchField, LayoutHelper.createFrame(-1, -2, 48));
            EmojiTabsStrip emojiTabsStrip = new EmojiTabsStrip(context, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider, false, false, true, 0, null, EmojiBottomSheet.this) {
                @Override
                protected boolean onTabClick(int i) {
                    int i2 = 0;
                    if (this.scrollingAnimation) {
                        return false;
                    }
                    SearchField searchField2 = Page.this.searchField;
                    if (searchField2 != null && searchField2.categoriesListView != null) {
                        if (Page.this.searchField.categoriesListView.getSelectedCategory() != null) {
                            Page.this.listView.scrollToPosition(0, 0);
                            Page.this.searchField.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                        }
                        Page.this.searchField.categoriesListView.scrollToStart();
                        Page.this.searchField.clear();
                    }
                    Adapter adapter2 = Page.this.adapter;
                    if (adapter2 != null) {
                        adapter2.updateItems(null);
                    }
                    int i3 = -1;
                    while (true) {
                        if (i2 >= Page.this.adapter.positionToSection.size()) {
                            break;
                        }
                        int keyAt = Page.this.adapter.positionToSection.keyAt(i2);
                        if (Page.this.adapter.positionToSection.valueAt(i2) == i) {
                            i3 = keyAt;
                            break;
                        }
                        i2++;
                    }
                    if (i3 >= 0) {
                        Page page = Page.this;
                        page.listView.scrollToPosition(i3, ((int) page.lockTop()) - AndroidUtilities.dp(102.0f));
                        return true;
                    }
                    return true;
                }
            };
            this.tabsStrip = emojiTabsStrip;
            addView(emojiTabsStrip, LayoutHelper.createFrame(-1, 36.0f));
        }

        public void lambda$new$0(View view, int i) {
            AnimatedEmojiDrawable animatedEmojiDrawable;
            if (i >= 0 && this.layoutManager.getItemViewType(view) != 4) {
                TLRPC$Document tLRPC$Document = i >= this.adapter.documents.size() ? null : (TLRPC$Document) this.adapter.documents.get(i);
                long longValue = i >= this.adapter.documentIds.size() ? 0L : ((Long) this.adapter.documentIds.get(i)).longValue();
                if (tLRPC$Document == null && (view instanceof EmojiListView.EmojiImageView) && (animatedEmojiDrawable = ((EmojiListView.EmojiImageView) view).drawable) != null) {
                    tLRPC$Document = animatedEmojiDrawable.getDocument();
                }
                if (tLRPC$Document == null && longValue != 0) {
                    tLRPC$Document = AnimatedEmojiDrawable.findDocument(((BottomSheet) EmojiBottomSheet.this).currentAccount, longValue);
                }
                if (tLRPC$Document == null) {
                    return;
                }
                if (EmojiBottomSheet.this.onDocumentSelected != null) {
                    EmojiBottomSheet.this.onDocumentSelected.run(null, tLRPC$Document, Boolean.FALSE);
                }
                EmojiBottomSheet.this.dismiss();
            }
        }

        public void lambda$new$1(String str, Integer num) {
            EmojiBottomSheet.this.query = str;
            EmojiBottomSheet.this.categoryIndex = num.intValue();
            this.adapter.updateItems(str);
        }

        @Override
        public float top() {
            float f = this.lockTop;
            if (f >= 0.0f) {
                return f;
            }
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return Math.max(0, childAt.getBottom() - AndroidUtilities.dp(102.0f));
                }
            }
            return 0.0f;
        }

        public float lockTop() {
            int paddingTop;
            float f = this.lockTop;
            if (f >= 0.0f) {
                paddingTop = this.listView.getPaddingTop();
            } else {
                f = top();
                this.lockTop = f;
                paddingTop = this.listView.getPaddingTop();
            }
            return f + paddingTop;
        }

        @Override
        public void updateTops() {
            float max = Math.max(0.0f, top());
            this.tabsStrip.setTranslationY(AndroidUtilities.dp(16.0f) + max);
            this.searchField.setTranslationY(AndroidUtilities.dp(52.0f) + max);
            EmojiListView emojiListView = this.listView;
            emojiListView.setBounds(max + emojiListView.getPaddingTop(), this.listView.getHeight() - this.listView.getPaddingBottom());
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setPadding(((BottomSheet) EmojiBottomSheet.this).backgroundPaddingLeft, 0, ((BottomSheet) EmojiBottomSheet.this).backgroundPaddingLeft, 0);
            this.tabsStrip.setTranslationY(AndroidUtilities.dp(16.0f));
            this.searchField.setTranslationY(AndroidUtilities.dp(52.0f));
            this.listView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(40.0f));
            super.onMeasure(i, i2);
        }

        @Override
        public void bind(int i) {
            this.currentType = i;
            GridLayoutManager gridLayoutManager = this.layoutManager;
            int i2 = i == 0 ? 8 : 5;
            this.spanCount = i2;
            gridLayoutManager.setSpanCount(i2);
            if (!this.resetOnce) {
                this.adapter.updateItems(null);
            }
            if (EmojiBottomSheet.this.categoryIndex < 0) {
                if (!TextUtils.isEmpty(EmojiBottomSheet.this.query)) {
                    this.searchField.editText.setText(EmojiBottomSheet.this.query);
                    this.searchField.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                    this.searchField.categoriesListView.scrollToStart();
                    AndroidUtilities.cancelRunOnUIThread(this.adapter.searchRunnable);
                    AndroidUtilities.runOnUIThread(this.adapter.searchRunnable);
                } else {
                    this.searchField.clear();
                }
            } else {
                SearchField searchField = this.searchField;
                searchField.ignoreTextChange = true;
                searchField.editText.setText("");
                SearchField searchField2 = this.searchField;
                searchField2.ignoreTextChange = false;
                searchField2.categoriesListView.selectCategory(EmojiBottomSheet.this.categoryIndex);
                this.searchField.categoriesListView.scrollToSelected();
                if (this.searchField.categoriesListView.getSelectedCategory() != null) {
                    this.adapter.query = this.searchField.categoriesListView.getSelectedCategory().emojis;
                    AndroidUtilities.cancelRunOnUIThread(this.adapter.searchRunnable);
                    AndroidUtilities.runOnUIThread(this.adapter.searchRunnable);
                }
            }
            MediaDataController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).checkStickers(i != 0 ? 0 : 5);
        }

        public boolean atTop() {
            return !this.listView.canScrollVertically(-1);
        }

        public class Adapter extends RecyclerView.Adapter {
            private String activeQuery;
            private TLRPC$TL_messages_stickerSet faveSet;
            private boolean includeNotFound;
            private int lastAllSetsCount;
            private String[] lastLang;
            private String query;
            private TLRPC$TL_messages_stickerSet recentSet;
            private int searchId;
            private final TLRPC$TL_inputStickerSetShortName staticEmojiInput;
            private final HashMap<String, ArrayList<Long>> allEmojis = new HashMap<>();
            private final HashMap<Long, ArrayList<TLRPC$TL_stickerPack>> packsBySet = new HashMap<>();
            private final ArrayList<TLRPC$TL_messages_stickerSet> allStickerSets = new ArrayList<>();
            private final ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = new ArrayList<>();
            private final ArrayList<EmojiView.EmojiPack> packs = new ArrayList<>();
            private final ArrayList<TLRPC$Document> documents = new ArrayList<>();
            private final ArrayList<Long> documentIds = new ArrayList<>();
            private int itemsCount = 0;
            private final SparseIntArray positionToSection = new SparseIntArray();
            private HashSet<Long> searchDocumentIds = new HashSet<>();
            private final Runnable searchRunnable = new Runnable() {
                @Override
                public final void run() {
                    EmojiBottomSheet.Page.Adapter.this.lambda$new$1();
                }
            };

            public Adapter() {
                TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetShortName();
                this.staticEmojiInput = tLRPC$TL_inputStickerSetShortName;
                tLRPC$TL_inputStickerSetShortName.short_name = "StaticEmoji";
            }

            public void update() {
                if (this.query == null) {
                    updateItems(null);
                }
            }

            public void updateItems(java.lang.String r17) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.EmojiBottomSheet.Page.Adapter.updateItems(java.lang.String):void");
            }

            public void lambda$new$1() {
                final String str = this.query;
                final MediaDataController mediaDataController = MediaDataController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount);
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = this.lastLang;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    MediaDataController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                this.lastLang = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, this.query, false, new MediaDataController.KeywordResultCallback() {
                    @Override
                    public final void run(ArrayList arrayList, String str2) {
                        EmojiBottomSheet.Page.Adapter.this.lambda$new$0(str, mediaDataController, arrayList, str2);
                    }
                }, null, false, false, false, true, 50);
            }

            public void lambda$new$0(String str, MediaDataController mediaDataController, ArrayList arrayList, String str2) {
                ArrayList<Long> arrayList2;
                if (TextUtils.equals(str, this.query)) {
                    ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(this.query);
                    for (int i = 0; i < parseEmojis.size(); i++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = parseEmojis.get(i).code.toString();
                            arrayList.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    this.itemsCount = 0;
                    this.documents.clear();
                    this.documentIds.clear();
                    this.positionToSection.clear();
                    this.stickerSets.clear();
                    this.itemsCount++;
                    this.documents.add(null);
                    this.documentIds.add(0L);
                    if (Page.this.currentType == 0) {
                        this.searchDocumentIds.clear();
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList.get(i2);
                            String str3 = keywordResult2.emoji;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList2 = this.allEmojis.get(keywordResult2.emoji)) != null) {
                                this.searchDocumentIds.addAll(arrayList2);
                            }
                        }
                        this.documentIds.addAll(this.searchDocumentIds);
                        for (int i3 = 0; i3 < this.searchDocumentIds.size(); i3++) {
                            this.documents.add(null);
                        }
                        this.itemsCount += this.searchDocumentIds.size();
                    } else {
                        HashMap<String, ArrayList<TLRPC$Document>> allStickers = mediaDataController.getAllStickers();
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            ArrayList<TLRPC$Document> arrayList3 = allStickers.get(((MediaDataController.KeywordResult) arrayList.get(i4)).emoji);
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                    TLRPC$Document tLRPC$Document = arrayList3.get(i5);
                                    if (tLRPC$Document != null && !this.documents.contains(tLRPC$Document)) {
                                        this.documents.add(tLRPC$Document);
                                        this.itemsCount++;
                                    }
                                }
                            }
                        }
                    }
                    String translitSafe = AndroidUtilities.translitSafe((this.query + "").toLowerCase());
                    for (int i6 = 0; i6 < this.allStickerSets.size(); i6++) {
                        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.allStickerSets.get(i6);
                        if (tLRPC$TL_messages_stickerSet != null && tLRPC$TL_messages_stickerSet.set != null) {
                            String translitSafe2 = AndroidUtilities.translitSafe((tLRPC$TL_messages_stickerSet.set.title + "").toLowerCase());
                            if (!translitSafe2.startsWith(translitSafe)) {
                                if (!translitSafe2.contains(" " + translitSafe)) {
                                }
                            }
                            int size = this.stickerSets.size();
                            this.stickerSets.add(tLRPC$TL_messages_stickerSet);
                            this.positionToSection.put(this.itemsCount, size);
                            this.documents.add(null);
                            this.itemsCount++;
                            this.documents.addAll(tLRPC$TL_messages_stickerSet.documents);
                            this.itemsCount += tLRPC$TL_messages_stickerSet.documents.size();
                        }
                    }
                    boolean z = this.documentIds.size() <= 1 && this.documents.size() <= 1;
                    this.includeNotFound = z;
                    if (z) {
                        this.itemsCount++;
                    }
                    if (!z) {
                        this.searchId++;
                    }
                    this.activeQuery = this.query;
                    notifyDataSetChanged();
                    Page.this.listView.scrollToPosition(0, 0);
                    Page.this.searchField.showProgress(false);
                    Page.this.tabsStrip.showSelected(false);
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View noEmojiView;
                StoryWidgetsCell storyWidgetsCell;
                if (i == 0) {
                    storyWidgetsCell = new View(Page.this.getContext());
                } else {
                    if (i == 1) {
                        noEmojiView = new StickerSetNameCell(Page.this.getContext(), true, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider);
                    } else if (i == 3) {
                        noEmojiView = new NoEmojiView(Page.this.getContext(), Page.this.currentType == 0);
                    } else if (i == 4) {
                        Page page = Page.this;
                        StoryWidgetsCell storyWidgetsCell2 = new StoryWidgetsCell(page.getContext());
                        final EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                        storyWidgetsCell2.setOnButtonClickListener(new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                EmojiBottomSheet.access$4700(EmojiBottomSheet.this, ((Integer) obj).intValue());
                            }
                        });
                        storyWidgetsCell = storyWidgetsCell2;
                    } else {
                        storyWidgetsCell = new EmojiListView.EmojiImageView(Page.this.getContext(), Page.this.listView);
                    }
                    storyWidgetsCell = noEmojiView;
                }
                return new RecyclerListView.Holder(storyWidgetsCell);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                TLRPC$StickerSet tLRPC$StickerSet;
                int itemViewType = viewHolder.getItemViewType();
                if (itemViewType == 0) {
                    viewHolder.itemView.setTag(34);
                    viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, (int) EmojiBottomSheet.this.maxPadding));
                } else if (itemViewType == 1) {
                    int i2 = this.positionToSection.get(i);
                    if (i2 < 0 || i2 >= this.stickerSets.size()) {
                        return;
                    }
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSets.get(i2);
                    String str = (tLRPC$TL_messages_stickerSet == null || (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set) == null) ? "" : tLRPC$StickerSet.title;
                    StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
                    if (this.activeQuery == null) {
                        stickerSetNameCell.setText(str, 0);
                        return;
                    }
                    int indexOf = str.toLowerCase().indexOf(this.activeQuery.toLowerCase());
                    if (indexOf < 0) {
                        stickerSetNameCell.setText(str, 0);
                    } else {
                        stickerSetNameCell.setText(str, 0, indexOf, this.activeQuery.length());
                    }
                } else if (itemViewType != 2) {
                    if (itemViewType == 3) {
                        ((NoEmojiView) viewHolder.itemView).update(this.searchId);
                    }
                } else {
                    TLRPC$Document tLRPC$Document = i >= this.documents.size() ? null : this.documents.get(i);
                    long longValue = i >= this.documentIds.size() ? 0L : this.documentIds.get(i).longValue();
                    if (tLRPC$Document == null && longValue == 0) {
                        return;
                    }
                    EmojiListView.EmojiImageView emojiImageView = (EmojiListView.EmojiImageView) viewHolder.itemView;
                    if (Page.this.currentType != 0) {
                        emojiImageView.setEmoji(null);
                        emojiImageView.setSticker(tLRPC$Document);
                    } else if (tLRPC$Document != null) {
                        emojiImageView.setSticker(null);
                        emojiImageView.setEmoji(tLRPC$Document);
                    } else {
                        emojiImageView.setSticker(null);
                        emojiImageView.setEmojiId(longValue);
                    }
                }
            }

            @Override
            public int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                if (this.includeNotFound && i == this.itemsCount - 1) {
                    return 3;
                }
                if (this.positionToSection.get(i, -1) >= 0) {
                    return 1;
                }
                return (i < 0 || i >= this.documents.size() || this.documents.get(i) != EmojiBottomSheet.this.widgets) ? 2 : 4;
            }

            @Override
            public int getItemCount() {
                return this.itemsCount;
            }
        }
    }

    public void showPremiumBulletin(String str, int i) {
        this.container.performHapticFeedback(3);
        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(ContextCompat.getDrawable(getContext(), R.drawable.msg_premium_normal), LocaleController.getString("IncreaseLimit", R.string.IncreaseLimit), premiumText(LocaleController.getString(str, i))).show(true);
    }

    private CharSequence premiumText(String str) {
        return AndroidUtilities.replaceSingleTag(str, Theme.key_chat_messageLinkIn, 0, new Runnable() {
            @Override
            public final void run() {
                EmojiBottomSheet.this.openPremium();
            }
        }, this.resourcesProvider);
    }

    public void openPremium() {
        Bulletin.hideVisible();
        PremiumFeatureBottomSheet premiumFeatureBottomSheet = new PremiumFeatureBottomSheet(new BaseFragment() {
            @Override
            public boolean isLightStatusBar() {
                return false;
            }

            {
                this.currentAccount = ((BottomSheet) EmojiBottomSheet.this).currentAccount;
            }

            @Override
            public Dialog showDialog(Dialog dialog) {
                dialog.show();
                return dialog;
            }

            @Override
            public Activity getParentActivity() {
                return LaunchActivity.instance;
            }

            @Override
            public Theme.ResourcesProvider getResourceProvider() {
                return new WrappedResourceProvider(this, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider) {
                    @Override
                    public void appendColors() {
                        this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                        this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                    }
                };
            }
        }, 14, false);
        premiumFeatureBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                EmojiBottomSheet.lambda$openPremium$0(dialogInterface);
            }
        });
        premiumFeatureBottomSheet.show();
    }

    public boolean hasWidgets() {
        return canShowWidget(0) || canShowWidget(1) || canShowWidget(2) || canShowWidget(3);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        View[] viewPages;
        if (i == NotificationCenter.stickersDidLoad || i == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.viewPager.getViewPages()) {
                if (view instanceof Page) {
                    Page page = (Page) view;
                    if (i == NotificationCenter.groupStickersDidLoad || ((page.currentType == 0 && ((Integer) objArr[0]).intValue() == 5) || (page.currentType == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        page.adapter.update();
                    }
                }
            }
        }
    }

    public void lambda$onWidgetClick$1(final int i) {
        if (canClickWidget(Integer.valueOf(i))) {
            if (i != 1 || checkAudioPermission(new Runnable() {
                @Override
                public final void run() {
                    EmojiBottomSheet.this.lambda$onWidgetClick$1(i);
                }
            })) {
                this.onWidgetSelected.run(Integer.valueOf(i));
                dismiss();
            }
        }
    }

    public EmojiBottomSheet(final Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context, true, resourcesProvider);
        this.query = null;
        this.categoryIndex = -1;
        this.widgets = new TLRPC$Document(this) {
        };
        this.maxPadding = -1.0f;
        this.useSmoothKeyboard = true;
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new ContainerView(context);
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            protected void onTabAnimationUpdate(boolean z2) {
                EmojiBottomSheet.this.tabsView.setType(EmojiBottomSheet.this.viewPager.getPositionAnimated());
                ((BottomSheet) EmojiBottomSheet.this).containerView.invalidate();
                invalidate();
                EmojiBottomSheet.savedPosition = EmojiBottomSheet.this.viewPager.getCurrentPosition();
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.currentPosition = savedPosition;
        viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public int getItemCount() {
                return 3;
            }

            @Override
            public int getItemViewType(int i) {
                return (i == 0 || i == 1) ? 0 : 1;
            }

            @Override
            public View createView(int i) {
                if (i == 1) {
                    return new GifPage(context);
                }
                return new Page(context);
            }

            @Override
            public void bindView(View view, int i, int i2) {
                ((IPage) view).bind(i);
            }
        });
        this.containerView.addView(viewPagerFixed, LayoutHelper.createFrame(-1, -1, 87));
        new KeyboardNotifier(this.containerView, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                EmojiBottomSheet.this.lambda$new$2((Integer) obj);
            }
        });
        TabsView tabsView = new TabsView(context);
        this.tabsView = tabsView;
        tabsView.setOnTypeSelected(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                EmojiBottomSheet.this.lambda$new$3((Integer) obj);
            }
        });
        tabsView.setType(viewPagerFixed.currentPosition);
        this.containerView.addView(tabsView, LayoutHelper.createFrame(-1, -2, 87));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(5);
        MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
    }

    public void lambda$new$2(Integer num) {
        boolean z = this.wasKeyboardVisible;
        boolean z2 = this.keyboardVisible;
        if (z != z2) {
            this.wasKeyboardVisible = z2;
            this.container.clearAnimation();
            float f = 0.0f;
            if (this.keyboardVisible) {
                int i = AndroidUtilities.displaySize.y;
                int i2 = this.keyboardHeight;
                f = Math.min(0.0f, Math.max(((i - i2) * 0.3f) - this.top, (-i2) / 3.0f));
            }
            this.container.animate().translationY(f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
        }
    }

    public void lambda$new$3(Integer num) {
        if (this.viewPager.isManualScrolling() || this.viewPager.getCurrentPosition() == num.intValue()) {
            return;
        }
        this.viewPager.scrollToPosition(num.intValue());
        this.tabsView.setType(num.intValue());
    }

    public void closeKeyboard() {
        View[] viewPages;
        SearchField searchField;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
        for (View view : this.viewPager.getViewPages()) {
            if (view instanceof Page) {
                SearchField searchField2 = ((Page) view).searchField;
                if (searchField2 != null) {
                    AndroidUtilities.hideKeyboard(searchField2.editText);
                }
            } else if ((view instanceof GifPage) && (searchField = ((GifPage) view).searchField) != null) {
                AndroidUtilities.hideKeyboard(searchField.editText);
            }
        }
    }

    @Override
    public void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        closeKeyboard();
        super.dismiss();
    }

    public void setBlurDelegate(Utilities.Callback2<Bitmap, Float> callback2) {
        this.drawBlurBitmap = callback2;
    }

    private class ContainerView extends FrameLayout {
        private final Paint backgroundBlurPaint;
        private final Paint backgroundPaint;
        private Bitmap blurBitmap;
        private Matrix blurBitmapMatrix;
        private BitmapShader blurBitmapShader;
        private final Paint handlePaint;
        private final RectF handleRect;
        private final AnimatedFloat isActionBarT;

        public ContainerView(Context context) {
            super(context);
            this.backgroundPaint = new Paint(1);
            this.backgroundBlurPaint = new Paint(3);
            this.handlePaint = new Paint(1);
            this.isActionBarT = new AnimatedFloat(this, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.handleRect = new RectF();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            setupBlurBitmap();
        }

        private void setupBlurBitmap() {
            if (this.blurBitmap != null || EmojiBottomSheet.this.drawBlurBitmap == null || SharedConfig.getDevicePerformanceClass() <= 0 || LiteMode.isPowerSaverApplied()) {
                return;
            }
            Point point = AndroidUtilities.displaySize;
            Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
            EmojiBottomSheet.this.drawBlurBitmap.run(createBitmap, Float.valueOf(16.0f));
            Utilities.stackBlurBitmap(createBitmap, 8);
            this.blurBitmap = createBitmap;
            Paint paint = this.backgroundBlurPaint;
            Bitmap bitmap = this.blurBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.blurBitmapShader = bitmapShader;
            paint.setShader(bitmapShader);
            if (this.blurBitmapMatrix == null) {
                this.blurBitmapMatrix = new Matrix();
            }
            this.blurBitmapMatrix.postScale(16.0f, 16.0f);
            this.blurBitmapShader.setLocalMatrix(this.blurBitmapMatrix);
            invalidate();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bitmap bitmap = this.blurBitmap;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.backgroundBlurPaint.setShader(null);
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            EmojiBottomSheet.this.maxPadding = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
            EmojiBottomSheet.this.viewPager.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
            EmojiBottomSheet.this.viewPager.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            EmojiBottomSheet.this.tabsView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
            setMeasuredDimension(size, size2);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            this.backgroundPaint.setColor(Theme.getColor(Theme.key_dialogBackground, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider));
            this.backgroundPaint.setAlpha((int) ((this.blurBitmap == null ? 0.95f : 0.85f) * 255.0f));
            View[] viewPages = EmojiBottomSheet.this.viewPager.getViewPages();
            EmojiBottomSheet.this.top = 0.0f;
            for (View view : viewPages) {
                if (view instanceof IPage) {
                    IPage iPage = (IPage) view;
                    EmojiBottomSheet.access$6016(EmojiBottomSheet.this, iPage.top() * Utilities.clamp(1.0f - Math.abs(iPage.getTranslationX() / iPage.getMeasuredWidth()), 1.0f, 0.0f));
                    if (iPage.getVisibility() == 0) {
                        iPage.updateTops();
                    }
                }
            }
            float f = this.isActionBarT.set(EmojiBottomSheet.this.top <= 0.0f ? 1.0f : 0.0f);
            float paddingTop = (EmojiBottomSheet.this.top + EmojiBottomSheet.this.viewPager.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), EmojiBottomSheet.this.viewPager.getPaddingTop(), f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((BottomSheet) EmojiBottomSheet.this).backgroundPaddingLeft, paddingTop, getWidth() - ((BottomSheet) EmojiBottomSheet.this).backgroundPaddingLeft, getHeight() + AndroidUtilities.dp(8.0f));
            if (this.blurBitmap != null) {
                this.blurBitmapMatrix.reset();
                this.blurBitmapMatrix.postScale(16.0f, 16.0f);
                this.blurBitmapMatrix.postTranslate(0.0f, -getY());
                this.blurBitmapShader.setLocalMatrix(this.blurBitmapMatrix);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.backgroundBlurPaint);
            }
            float f2 = 1.0f - f;
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f2, AndroidUtilities.dp(14.0f) * f2, this.backgroundPaint);
            this.handleRect.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (getWidth() + AndroidUtilities.dp(36.0f)) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
            this.handlePaint.setColor(1367573379);
            this.handlePaint.setAlpha((int) (f2 * 81.0f));
            canvas.drawRoundRect(this.handleRect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.handlePaint);
            canvas.save();
            canvas.clipRect(rectF);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < EmojiBottomSheet.this.top) {
                EmojiBottomSheet.this.dismiss();
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public int getContainerViewHeight() {
        if (this.containerView.getMeasuredHeight() <= 0) {
            return AndroidUtilities.displaySize.y;
        }
        return (int) (this.containerView.getMeasuredHeight() - this.viewPager.getY());
    }

    public EmojiBottomSheet whenDocumentSelected(Utilities.Callback3<Object, TLRPC$Document, Boolean> callback3) {
        this.onDocumentSelected = callback3;
        return this;
    }

    public EmojiBottomSheet whenWidgetSelected(Utilities.Callback<Integer> callback) {
        this.onWidgetSelected = callback;
        return this;
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return this.viewPager.getTranslationY() >= ((float) ((int) this.maxPadding));
    }

    public static class EmojiListView extends RecyclerListView {
        private float bottomBound;
        private final ArrayList<DrawingInBackgroundLine> lineDrawables;
        private final ArrayList<DrawingInBackgroundLine> lineDrawablesTmp;
        private RecyclerAnimationScrollHelper scrollHelper;
        public boolean smoothScrolling;
        private float topBound;
        private final ArrayList<ArrayList<EmojiImageView>> unusedArrays;
        private final ArrayList<DrawingInBackgroundLine> unusedLineDrawables;
        private final SparseArray<ArrayList<EmojiImageView>> viewsGroupedByLines;
        private final ColorFilter whiteFilter;

        public static class EmojiImageView extends View {
            boolean attached;
            public ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
            private final ButtonBounce bounce;
            private final int currentAccount;
            private long documentId;
            public AnimatedEmojiDrawable drawable;
            public ImageReceiver imageReceiver;
            public ImageReceiver imageReceiverToDraw;
            private final EmojiListView listView;
            public boolean notDraw;

            public EmojiImageView(Context context, EmojiListView emojiListView) {
                super(context);
                this.currentAccount = UserConfig.selectedAccount;
                this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
                this.bounce = new ButtonBounce(this);
                setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                this.listView = emojiListView;
            }

            public void setEmoji(TLRPC$Document tLRPC$Document) {
                if (this.documentId == (tLRPC$Document == null ? 0L : tLRPC$Document.id)) {
                    return;
                }
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this);
                }
                if (tLRPC$Document != null) {
                    this.documentId = tLRPC$Document.id;
                    AnimatedEmojiDrawable make = AnimatedEmojiDrawable.make(this.currentAccount, 3, tLRPC$Document);
                    this.drawable = make;
                    if (this.attached) {
                        make.addView(this);
                        return;
                    }
                    return;
                }
                this.documentId = 0L;
                this.drawable = null;
            }

            @Override
            public void invalidate() {
                this.listView.invalidate();
            }

            public void setEmojiId(long j) {
                if (this.documentId == j) {
                    return;
                }
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this);
                }
                if (j != 0) {
                    this.documentId = j;
                    AnimatedEmojiDrawable make = AnimatedEmojiDrawable.make(this.currentAccount, 3, j);
                    this.drawable = make;
                    if (this.attached) {
                        make.addView(this);
                        return;
                    }
                    return;
                }
                this.documentId = 0L;
                this.drawable = null;
            }

            @Override
            public void setPressed(boolean z) {
                super.setPressed(z);
                this.bounce.setPressed(z);
            }

            public float getScale() {
                return this.bounce.getScale(0.15f);
            }

            public void setSticker(TLRPC$Document tLRPC$Document) {
                if (tLRPC$Document != null) {
                    long j = this.documentId;
                    long j2 = tLRPC$Document.id;
                    if (j == j2) {
                        return;
                    }
                    this.documentId = j2;
                    if (this.imageReceiver == null) {
                        ImageReceiver imageReceiver = new ImageReceiver();
                        this.imageReceiver = imageReceiver;
                        imageReceiver.setLayerNum(7);
                        this.imageReceiver.setAspectFit(true);
                        this.imageReceiver.setParentView(this.listView);
                        if (this.attached) {
                            this.imageReceiver.onAttachedToWindow();
                        }
                    }
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                    TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                    String str = "80_80";
                    if ("video/webm".equals(tLRPC$Document.mime_type)) {
                        str = "80_80_g";
                    }
                    String str2 = str;
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(LiteMode.FLAG_CALLS_ANIMATIONS, LiteMode.FLAG_CALLS_ANIMATIONS);
                    }
                    this.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$Document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), "80_80", svgThumb, 0L, null, tLRPC$Document, 0);
                    return;
                }
                ImageReceiver imageReceiver2 = this.imageReceiver;
                if (imageReceiver2 != null) {
                    this.documentId = 0L;
                    imageReceiver2.clearImage();
                }
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.attached = true;
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.addView(this.listView);
                }
                ImageReceiver imageReceiver = this.imageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.onAttachedToWindow();
                }
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.attached = false;
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this.listView);
                }
                ImageReceiver imageReceiver = this.imageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.onDetachedFromWindow();
                }
            }

            @Override
            protected void onMeasure(int i, int i2) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
                super.onMeasure(makeMeasureSpec, makeMeasureSpec);
            }

            public void update(long j) {
                ImageReceiver imageReceiver = this.imageReceiverToDraw;
                if (imageReceiver != null) {
                    if (imageReceiver.getLottieAnimation() != null) {
                        this.imageReceiverToDraw.getLottieAnimation().updateCurrentFrame(j, true);
                    }
                    if (this.imageReceiverToDraw.getAnimation() != null) {
                        this.imageReceiverToDraw.getAnimation().updateCurrentFrame(j, true);
                    }
                }
            }

            @Override
            protected void onDraw(Canvas canvas) {
                ImageReceiver imageReceiver = this.imageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                    this.imageReceiver.draw(canvas);
                    return;
                }
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.setBounds(0, 0, getWidth(), getHeight());
                    this.drawable.draw(canvas);
                }
            }
        }

        public EmojiListView(Context context) {
            super(context);
            this.smoothScrolling = false;
            this.viewsGroupedByLines = new SparseArray<>();
            this.unusedArrays = new ArrayList<>();
            this.unusedLineDrawables = new ArrayList<>();
            this.lineDrawables = new ArrayList<>();
            this.lineDrawablesTmp = new ArrayList<>();
            this.whiteFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }

        @Override
        public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
            super.setLayoutManager(layoutManager);
            this.scrollHelper = null;
            if (layoutManager instanceof LinearLayoutManager) {
                RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this, (LinearLayoutManager) layoutManager);
                this.scrollHelper = recyclerAnimationScrollHelper;
                recyclerAnimationScrollHelper.setAnimationCallback(new RecyclerAnimationScrollHelper.AnimationCallback() {
                    @Override
                    public void onPreAnimation() {
                        EmojiListView.this.smoothScrolling = true;
                    }

                    @Override
                    public void onEndAnimation() {
                        EmojiListView.this.smoothScrolling = false;
                    }
                });
                this.scrollHelper.setScrollListener(new RecyclerAnimationScrollHelper.ScrollListener() {
                    @Override
                    public final void onScroll() {
                        EmojiBottomSheet.EmojiListView.this.invalidate();
                    }
                });
            }
        }

        public void scrollToPosition(int i, int i2) {
            if (this.scrollHelper == null || !(getLayoutManager() instanceof GridLayoutManager)) {
                return;
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) getLayoutManager();
            View findViewByPosition = gridLayoutManager.findViewByPosition(i);
            int findFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
            if ((findViewByPosition == null && Math.abs(i - findFirstVisibleItemPosition) > gridLayoutManager.getSpanCount() * 9.0f) || !SharedConfig.animationsEnabled()) {
                this.scrollHelper.setScrollDirection(gridLayoutManager.findFirstVisibleItemPosition() < i ? 0 : 1);
                this.scrollHelper.scrollToPosition(i, i2, false, true);
                return;
            }
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2) {
                @Override
                public void onEnd() {
                    EmojiListView.this.smoothScrolling = false;
                }

                @Override
                protected void onStart() {
                    EmojiListView.this.smoothScrolling = true;
                }
            };
            linearSmoothScrollerCustom.setTargetPosition(i);
            linearSmoothScrollerCustom.setOffset(i2);
            gridLayoutManager.startSmoothScroll(linearSmoothScrollerCustom);
        }

        public void setBounds(float f, float f2) {
            this.topBound = f;
            this.bottomBound = f2;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (getVisibility() != 0) {
                return;
            }
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.clipRect(0.0f, this.topBound, getWidth(), this.bottomBound);
            if (!this.selectorRect.isEmpty()) {
                this.selectorDrawable.setBounds(this.selectorRect);
                canvas.save();
                Consumer<Canvas> consumer = this.selectorTransformer;
                if (consumer != null) {
                    consumer.accept(canvas);
                }
                this.selectorDrawable.draw(canvas);
                canvas.restore();
            }
            for (int i = 0; i < this.viewsGroupedByLines.size(); i++) {
                ArrayList<EmojiImageView> valueAt = this.viewsGroupedByLines.valueAt(i);
                valueAt.clear();
                this.unusedArrays.add(valueAt);
            }
            this.viewsGroupedByLines.clear();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof EmojiImageView) {
                    EmojiImageView emojiImageView = (EmojiImageView) childAt;
                    if (emojiImageView.getY() < this.bottomBound && emojiImageView.getY() + emojiImageView.getHeight() > this.topBound) {
                        int y = this.smoothScrolling ? (int) emojiImageView.getY() : emojiImageView.getTop();
                        ArrayList<EmojiImageView> arrayList = this.viewsGroupedByLines.get(y);
                        if (arrayList == null) {
                            if (!this.unusedArrays.isEmpty()) {
                                ArrayList<ArrayList<EmojiImageView>> arrayList2 = this.unusedArrays;
                                arrayList = arrayList2.remove(arrayList2.size() - 1);
                            } else {
                                arrayList = new ArrayList<>();
                            }
                            this.viewsGroupedByLines.put(y, arrayList);
                        }
                        arrayList.add(emojiImageView);
                    }
                }
            }
            this.lineDrawablesTmp.clear();
            this.lineDrawablesTmp.addAll(this.lineDrawables);
            this.lineDrawables.clear();
            canvas.save();
            canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
            long currentTimeMillis = System.currentTimeMillis();
            int i3 = 0;
            while (true) {
                DrawingInBackgroundLine drawingInBackgroundLine = null;
                if (i3 >= this.viewsGroupedByLines.size()) {
                    break;
                }
                ArrayList<EmojiImageView> valueAt2 = this.viewsGroupedByLines.valueAt(i3);
                EmojiImageView emojiImageView2 = valueAt2.get(0);
                int childAdapterPosition = getChildAdapterPosition(emojiImageView2);
                int i4 = 0;
                while (true) {
                    if (i4 >= this.lineDrawablesTmp.size()) {
                        break;
                    } else if (this.lineDrawablesTmp.get(i4).position == childAdapterPosition) {
                        drawingInBackgroundLine = this.lineDrawablesTmp.get(i4);
                        this.lineDrawablesTmp.remove(i4);
                        break;
                    } else {
                        i4++;
                    }
                }
                if (drawingInBackgroundLine == null) {
                    if (!this.unusedLineDrawables.isEmpty()) {
                        ArrayList<DrawingInBackgroundLine> arrayList3 = this.unusedLineDrawables;
                        drawingInBackgroundLine = arrayList3.remove(arrayList3.size() - 1);
                    } else {
                        drawingInBackgroundLine = new DrawingInBackgroundLine();
                        drawingInBackgroundLine.setLayerNum(7);
                    }
                    drawingInBackgroundLine.position = childAdapterPosition;
                    drawingInBackgroundLine.onAttachToWindow();
                }
                this.lineDrawables.add(drawingInBackgroundLine);
                drawingInBackgroundLine.imageViewEmojis = valueAt2;
                canvas.save();
                canvas.translate(emojiImageView2.getLeft(), emojiImageView2.getY());
                drawingInBackgroundLine.startOffset = emojiImageView2.getLeft();
                int measuredWidth = getMeasuredWidth() - (emojiImageView2.getLeft() * 2);
                int measuredHeight = emojiImageView2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    drawingInBackgroundLine.draw(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                }
                canvas.restore();
                i3++;
            }
            for (int i5 = 0; i5 < this.lineDrawablesTmp.size(); i5++) {
                if (this.unusedLineDrawables.size() < 3) {
                    this.unusedLineDrawables.add(this.lineDrawablesTmp.get(i5));
                    this.lineDrawablesTmp.get(i5).imageViewEmojis = null;
                    this.lineDrawablesTmp.get(i5).reset();
                } else {
                    this.lineDrawablesTmp.get(i5).onDetachFromWindow();
                }
            }
            this.lineDrawablesTmp.clear();
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt2 = getChildAt(i6);
                if (childAt2 != null && !(childAt2 instanceof EmojiImageView) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
                    canvas.save();
                    canvas.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
            canvas.restoreToCount(saveCount);
        }

        public class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
            ArrayList<EmojiImageView> imageViewEmojis;
            public int position;
            public int startOffset;
            ArrayList<EmojiImageView> drawInBackgroundViews = new ArrayList<>();
            boolean lite = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);

            public DrawingInBackgroundLine() {
            }

            @Override
            public void draw(Canvas canvas, long j, int i, int i2, float f) {
                if (this.imageViewEmojis == null) {
                    return;
                }
                boolean z = true;
                boolean z2 = EmojiListView.this.isAnimating() || this.imageViewEmojis.size() <= 4 || !this.lite;
                if (!z2) {
                    for (int i3 = 0; i3 < this.imageViewEmojis.size(); i3++) {
                        if (this.imageViewEmojis.get(i3).getScale() != 1.0f) {
                            break;
                        }
                    }
                }
                z = z2;
                if (z) {
                    prepareDraw(System.currentTimeMillis());
                    drawInUiThread(canvas, f);
                    reset();
                    return;
                }
                super.draw(canvas, j, i, i2, f);
            }

            @Override
            public void prepareDraw(long j) {
                this.drawInBackgroundViews.clear();
                for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                    EmojiImageView emojiImageView = this.imageViewEmojis.get(i);
                    if (!emojiImageView.notDraw) {
                        AnimatedEmojiDrawable animatedEmojiDrawable = emojiImageView.drawable;
                        ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : emojiImageView.imageReceiver;
                        if (imageReceiver != null) {
                            imageReceiver.setAlpha(emojiImageView.getAlpha());
                            AnimatedEmojiDrawable animatedEmojiDrawable2 = emojiImageView.drawable;
                            if (animatedEmojiDrawable2 != null) {
                                animatedEmojiDrawable2.setColorFilter(EmojiListView.this.whiteFilter);
                            }
                            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = emojiImageView.backgroundThreadDrawHolder;
                            int i2 = this.threadIndex;
                            backgroundThreadDrawHolderArr[i2] = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i2], i2);
                            emojiImageView.backgroundThreadDrawHolder[this.threadIndex].time = j;
                            emojiImageView.imageReceiverToDraw = imageReceiver;
                            emojiImageView.update(j);
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(emojiImageView.getPaddingLeft(), emojiImageView.getPaddingTop(), emojiImageView.getWidth() - emojiImageView.getPaddingRight(), emojiImageView.getHeight() - emojiImageView.getPaddingBottom());
                            float aspectRatio = getAspectRatio(imageReceiver);
                            if (aspectRatio < 1.0f) {
                                float height = (rect.height() * aspectRatio) / 2.0f;
                                rect.left = (int) (rect.centerX() - height);
                                rect.right = (int) (rect.centerX() + height);
                            } else if (aspectRatio > 1.0f) {
                                float width = (rect.width() / aspectRatio) / 2.0f;
                                rect.top = (int) (rect.centerY() - width);
                                rect.bottom = (int) (rect.centerY() + width);
                            }
                            rect.offset((emojiImageView.getLeft() + ((int) emojiImageView.getTranslationX())) - this.startOffset, 0);
                            emojiImageView.backgroundThreadDrawHolder[this.threadIndex].setBounds(rect);
                            this.drawInBackgroundViews.add(emojiImageView);
                        }
                    }
                }
            }

            private float getAspectRatio(ImageReceiver imageReceiver) {
                float width;
                int height;
                if (imageReceiver == null) {
                    return 1.0f;
                }
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation != null && lottieAnimation.getIntrinsicHeight() != 0) {
                    width = lottieAnimation.getIntrinsicWidth();
                    height = lottieAnimation.getIntrinsicHeight();
                } else {
                    AnimatedFileDrawable animation = imageReceiver.getAnimation();
                    if (animation != null && animation.getIntrinsicHeight() != 0) {
                        width = animation.getIntrinsicWidth();
                        height = animation.getIntrinsicHeight();
                    } else {
                        Bitmap bitmap = imageReceiver.getBitmap();
                        if (bitmap != null) {
                            width = bitmap.getWidth();
                            height = bitmap.getHeight();
                        } else {
                            Drawable staticThumb = imageReceiver.getStaticThumb();
                            if (staticThumb == null || staticThumb.getIntrinsicHeight() == 0) {
                                return 1.0f;
                            }
                            return staticThumb.getIntrinsicWidth() / staticThumb.getIntrinsicHeight();
                        }
                    }
                }
                return width / height;
            }

            @Override
            public void drawInBackground(Canvas canvas) {
                for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                    EmojiImageView emojiImageView = this.drawInBackgroundViews.get(i);
                    if (!emojiImageView.notDraw) {
                        AnimatedEmojiDrawable animatedEmojiDrawable = emojiImageView.drawable;
                        if (animatedEmojiDrawable != null) {
                            animatedEmojiDrawable.setColorFilter(EmojiListView.this.whiteFilter);
                        }
                        emojiImageView.imageReceiverToDraw.draw(canvas, emojiImageView.backgroundThreadDrawHolder[this.threadIndex]);
                    }
                }
            }

            @Override
            protected void drawInUiThread(Canvas canvas, float f) {
                if (this.imageViewEmojis != null) {
                    canvas.save();
                    canvas.translate(-this.startOffset, 0.0f);
                    for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                        EmojiImageView emojiImageView = this.imageViewEmojis.get(i);
                        if (!emojiImageView.notDraw) {
                            float scale = emojiImageView.getScale();
                            float alpha = emojiImageView.getAlpha() * f;
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(((int) emojiImageView.getX()) + emojiImageView.getPaddingLeft(), emojiImageView.getPaddingTop(), (((int) emojiImageView.getX()) + emojiImageView.getWidth()) - emojiImageView.getPaddingRight(), emojiImageView.getHeight() - emojiImageView.getPaddingBottom());
                            AnimatedEmojiDrawable animatedEmojiDrawable = emojiImageView.drawable;
                            if (animatedEmojiDrawable != null) {
                                animatedEmojiDrawable.setBounds(rect);
                            }
                            ImageReceiver imageReceiver = emojiImageView.imageReceiver;
                            if (imageReceiver != null) {
                                imageReceiver.setImageCoords(rect);
                            }
                            if (EmojiListView.this.whiteFilter != null) {
                                AnimatedEmojiDrawable animatedEmojiDrawable2 = emojiImageView.drawable;
                                if (animatedEmojiDrawable2 instanceof AnimatedEmojiDrawable) {
                                    animatedEmojiDrawable2.setColorFilter(EmojiListView.this.whiteFilter);
                                }
                            }
                            if (scale != 1.0f) {
                                canvas.save();
                                canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                                drawImage(canvas, animatedEmojiDrawable, emojiImageView, alpha);
                                canvas.restore();
                            } else {
                                drawImage(canvas, animatedEmojiDrawable, emojiImageView, alpha);
                            }
                        }
                    }
                    canvas.restore();
                }
            }

            private void drawImage(Canvas canvas, Drawable drawable, EmojiImageView emojiImageView, float f) {
                if (drawable != null) {
                    drawable.setAlpha((int) (f * 255.0f));
                    drawable.draw(canvas);
                } else if (emojiImageView.imageReceiver != null) {
                    canvas.save();
                    canvas.clipRect(emojiImageView.imageReceiver.getImageX(), emojiImageView.imageReceiver.getImageY(), emojiImageView.imageReceiver.getImageX2(), emojiImageView.imageReceiver.getImageY2());
                    emojiImageView.imageReceiver.setAlpha(f);
                    emojiImageView.imageReceiver.draw(canvas);
                    canvas.restore();
                }
            }

            @Override
            public void onFrameReady() {
                super.onFrameReady();
                for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                    ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = this.drawInBackgroundViews.get(i).backgroundThreadDrawHolder;
                    int i2 = this.threadIndex;
                    if (backgroundThreadDrawHolderArr[i2] != null) {
                        backgroundThreadDrawHolderArr[i2].release();
                    }
                }
                EmojiListView.this.invalidate();
            }
        }
    }

    public static class SearchField extends FrameLayout {
        private final FrameLayout box;
        private final StickerCategoriesListView categoriesListView;
        private final ImageView clear;
        private boolean clearVisible;
        private final EditTextBoldCursor editText;
        public boolean ignoreTextChange;
        private final FrameLayout inputBox;
        private boolean isprogress;
        private Utilities.Callback2<String, Integer> onSearchQuery;
        private final Theme.ResourcesProvider resourcesProvider;
        private final SearchStateDrawable searchImageDrawable;
        private final ImageView searchImageView;

        public SearchField(Context context, final Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            FrameLayout frameLayout = new FrameLayout(context);
            this.box = frameLayout;
            frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), Theme.getColor(Theme.key_chat_emojiSearchBackground, resourcesProvider)));
            if (Build.VERSION.SDK_INT >= 21) {
                frameLayout.setClipToOutline(true);
                frameLayout.setOutlineProvider(new ViewOutlineProvider(this) {
                    @Override
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(18.0f));
                    }
                });
            }
            addView(frameLayout, LayoutHelper.createFrame(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.inputBox = frameLayout2;
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.searchImageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            SearchStateDrawable searchStateDrawable = new SearchStateDrawable();
            this.searchImageDrawable = searchStateDrawable;
            searchStateDrawable.setIconState(0, false);
            int i = Theme.key_chat_emojiSearchIcon;
            searchStateDrawable.setColor(Theme.getColor(i, resourcesProvider));
            imageView.setImageDrawable(searchStateDrawable);
            frameLayout.addView(imageView, LayoutHelper.createFrame(36, 36, 51));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (!SearchField.this.editText.isEnabled()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (motionEvent.getAction() == 0) {
                        SearchField.this.editText.requestFocus();
                        AndroidUtilities.showKeyboard(SearchField.this.editText);
                    }
                    return super.onTouchEvent(motionEvent);
                }

                @Override
                public void onFocusChanged(boolean z, int i2, Rect rect) {
                    super.onFocusChanged(z, i2, rect);
                    if (z) {
                        return;
                    }
                    AndroidUtilities.hideKeyboard(SearchField.this.editText);
                }
            };
            this.editText = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 16.0f);
            editTextBoldCursor.setHintTextColor(Theme.getColor(i, resourcesProvider));
            editTextBoldCursor.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            editTextBoldCursor.setBackgroundDrawable(null);
            editTextBoldCursor.setPadding(0, 0, 0, 0);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(268435459);
            editTextBoldCursor.setHint(LocaleController.getString("Search", R.string.Search));
            int i2 = Theme.key_featuredStickers_addedIcon;
            editTextBoldCursor.setCursorColor(Theme.getColor(i2, resourcesProvider));
            editTextBoldCursor.setHandlesColor(Theme.getColor(i2, resourcesProvider));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setTranslationY(AndroidUtilities.dp(-2.0f));
            frameLayout2.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
            editTextBoldCursor.addTextChangedListener(new AnonymousClass3());
            StickerCategoriesListView stickerCategoriesListView = new StickerCategoriesListView(context, null, 0, resourcesProvider) {
                @Override
                public void selectCategory(int i3) {
                    super.selectCategory(i3);
                    SearchField.this.updateButton();
                }

                @Override
                protected boolean isTabIconsAnimationEnabled(boolean z) {
                    return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                }
            };
            this.categoriesListView = stickerCategoriesListView;
            TextPaint paint = editTextBoldCursor.getPaint();
            stickerCategoriesListView.setDontOccupyWidth(((int) paint.measureText(((Object) editTextBoldCursor.getHint()) + "")) + AndroidUtilities.dp(16.0f));
            stickerCategoriesListView.setOnScrollIntoOccupiedWidth(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    EmojiBottomSheet.SearchField.this.lambda$new$0((Integer) obj);
                }
            });
            stickerCategoriesListView.setOnCategoryClick(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    EmojiBottomSheet.SearchField.this.lambda$new$1((StickerCategoriesListView.EmojiCategory) obj);
                }
            });
            frameLayout.addView(stickerCategoriesListView, LayoutHelper.createFrame(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.clear = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            imageView2.setImageDrawable(new CloseProgressDrawable2(this, 1.25f) {
                {
                    setSide(AndroidUtilities.dp(7.0f));
                }

                @Override
                protected int getCurrentColor() {
                    return Theme.getColor(Theme.key_chat_emojiSearchIcon, resourcesProvider);
                }
            });
            imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, AndroidUtilities.dp(15.0f)));
            imageView2.setAlpha(0.0f);
            imageView2.setScaleX(0.7f);
            imageView2.setScaleY(0.7f);
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    EmojiBottomSheet.SearchField.this.lambda$new$2(view);
                }
            });
            frameLayout.addView(imageView2, LayoutHelper.createFrame(36, 36, 53));
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    EmojiBottomSheet.SearchField.this.lambda$new$3(view);
                }
            });
        }

        public class AnonymousClass3 implements TextWatcher {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            AnonymousClass3() {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                SearchField searchField = SearchField.this;
                if (searchField.ignoreTextChange) {
                    return;
                }
                searchField.updateButton();
                String obj = SearchField.this.editText.getText().toString();
                SearchField.this.search(TextUtils.isEmpty(obj) ? null : obj, -1);
                if (SearchField.this.categoriesListView != null) {
                    SearchField.this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                    SearchField.this.categoriesListView.updateCategoriesShown(TextUtils.isEmpty(obj), true);
                }
                if (SearchField.this.editText != null) {
                    SearchField.this.editText.animate().cancel();
                    ViewPropertyAnimator translationX = SearchField.this.editText.animate().translationX(0.0f);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    translationX.setInterpolator(cubicBezierInterpolator).start();
                    if (SearchField.this.clear == null || SearchField.this.clearVisible == (!TextUtils.isEmpty(SearchField.this.editText.getText()))) {
                        return;
                    }
                    SearchField searchField2 = SearchField.this;
                    searchField2.clearVisible = true ^ searchField2.clearVisible;
                    SearchField.this.clear.animate().cancel();
                    if (SearchField.this.clearVisible) {
                        SearchField.this.clear.setVisibility(0);
                    }
                    SearchField.this.clear.animate().scaleX(SearchField.this.clearVisible ? 1.0f : 0.7f).scaleY(SearchField.this.clearVisible ? 1.0f : 0.7f).alpha(SearchField.this.clearVisible ? 1.0f : 0.0f).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            EmojiBottomSheet.SearchField.AnonymousClass3.this.lambda$afterTextChanged$0();
                        }
                    }).setInterpolator(cubicBezierInterpolator).setDuration(320L).setStartDelay(SearchField.this.clearVisible ? 240L : 0L).start();
                }
            }

            public void lambda$afterTextChanged$0() {
                if (SearchField.this.clearVisible) {
                    return;
                }
                SearchField.this.clear.setVisibility(8);
            }
        }

        public void lambda$new$0(Integer num) {
            this.editText.animate().cancel();
            this.editText.setTranslationX(-Math.max(0, num.intValue()));
            updateButton();
        }

        public void lambda$new$1(StickerCategoriesListView.EmojiCategory emojiCategory) {
            if (this.categoriesListView.getSelectedCategory() == emojiCategory) {
                this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                search(null, -1);
                return;
            }
            this.categoriesListView.selectCategory(emojiCategory);
            search(emojiCategory.emojis, this.categoriesListView.getCategoryIndex());
        }

        public void lambda$new$2(View view) {
            clear();
        }

        public void lambda$new$3(View view) {
            if (this.searchImageDrawable.getIconState() == 1) {
                clear();
                this.categoriesListView.scrollToStart();
            } else if (this.searchImageDrawable.getIconState() == 0) {
                this.editText.requestFocus();
            }
        }

        public void updateButton() {
            updateButton(false);
        }

        public void showProgress(boolean z) {
            this.isprogress = z;
            if (z) {
                this.searchImageDrawable.setIconState(2);
            } else {
                updateButton(true);
            }
        }

        private void updateButton(boolean z) {
            StickerCategoriesListView stickerCategoriesListView;
            StickerCategoriesListView stickerCategoriesListView2;
            if (!this.isprogress || ((this.editText.length() == 0 && ((stickerCategoriesListView2 = this.categoriesListView) == null || stickerCategoriesListView2.getSelectedCategory() == null)) || z)) {
                this.searchImageDrawable.setIconState((this.editText.length() > 0 || ((stickerCategoriesListView = this.categoriesListView) != null && stickerCategoriesListView.isCategoriesShown() && (this.categoriesListView.isScrolledIntoOccupiedWidth() || this.categoriesListView.getSelectedCategory() != null))) ? 1 : 0);
                this.isprogress = false;
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        public void setOnSearchQuery(Utilities.Callback2<String, Integer> callback2) {
            this.onSearchQuery = callback2;
        }

        public void search(String str, int i) {
            Utilities.Callback2<String, Integer> callback2 = this.onSearchQuery;
            if (callback2 != null) {
                callback2.run(str, Integer.valueOf(i));
            }
        }

        public void clear() {
            this.editText.setText("");
            search(null, -1);
            this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
        }
    }

    public static class TabsView extends View {
        private StaticLayout emojiLayout;
        private float emojiLayoutLeft;
        private float emojiLayoutWidth;
        private final RectF emojiRect;
        private StaticLayout gifsLayout;
        private float gifsLayoutLeft;
        private float gifsLayoutWidth;
        private final RectF gifsRect;
        private int lastWidth;
        private Utilities.Callback<Integer> onTypeSelected;
        private final Paint selectPaint;
        private final RectF selectRect;
        private StaticLayout stickersLayout;
        private float stickersLayoutLeft;
        private float stickersLayoutWidth;
        private final RectF stickersRect;
        private final TextPaint textPaint;
        private float type;

        public TabsView(Context context) {
            super(context);
            this.textPaint = new TextPaint(1);
            this.selectPaint = new Paint(1);
            this.emojiRect = new RectF();
            this.stickersRect = new RectF();
            this.gifsRect = new RectF();
            this.selectRect = new RectF();
        }

        public void setType(float f) {
            this.type = f;
            invalidate();
        }

        public void setOnTypeSelected(Utilities.Callback<Integer> callback) {
            this.onTypeSelected = callback;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(40.0f) + AndroidUtilities.navigationBarHeight);
            if (getMeasuredWidth() != this.lastWidth || this.emojiLayout == null) {
                updateLayouts();
            }
            this.lastWidth = getMeasuredWidth();
        }

        private void updateLayouts() {
            this.textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            this.textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString("Emoji"), this.textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.emojiLayout = staticLayout;
            this.emojiLayoutWidth = staticLayout.getLineCount() >= 1 ? this.emojiLayout.getLineWidth(0) : 0.0f;
            this.emojiLayoutLeft = this.emojiLayout.getLineCount() >= 1 ? this.emojiLayout.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout2 = new StaticLayout(LocaleController.getString("AccDescrStickers"), this.textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.stickersLayout = staticLayout2;
            this.stickersLayoutWidth = staticLayout2.getLineCount() >= 1 ? this.stickersLayout.getLineWidth(0) : 0.0f;
            this.stickersLayoutLeft = this.stickersLayout.getLineCount() >= 1 ? this.stickersLayout.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout3 = new StaticLayout(LocaleController.getString("AccDescrGIFs", R.string.AccDescrGIFs), this.textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.gifsLayout = staticLayout3;
            this.gifsLayoutWidth = staticLayout3.getLineCount() >= 1 ? this.gifsLayout.getLineWidth(0) : 0.0f;
            this.gifsLayoutLeft = this.gifsLayout.getLineCount() >= 1 ? this.gifsLayout.getLineLeft(0) : 0.0f;
            float dp = AndroidUtilities.dp(12.0f) + this.emojiLayoutWidth + AndroidUtilities.dp(36.0f) + this.stickersLayoutWidth + AndroidUtilities.dp(36.0f) + this.gifsLayoutWidth + AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(14.0f) / 2.0f;
            float dp3 = AndroidUtilities.dp(66.0f) / 2.0f;
            float measuredWidth = (getMeasuredWidth() - dp) / 2.0f;
            this.emojiRect.set(measuredWidth, dp2, this.emojiLayoutWidth + measuredWidth + AndroidUtilities.dp(24.0f), dp3);
            float dp4 = measuredWidth + this.emojiLayoutWidth + AndroidUtilities.dp(36.0f);
            this.stickersRect.set(dp4, dp2, this.stickersLayoutWidth + dp4 + AndroidUtilities.dp(24.0f), dp3);
            float dp5 = dp4 + this.stickersLayoutWidth + AndroidUtilities.dp(36.0f);
            this.gifsRect.set(dp5, dp2, this.gifsLayoutWidth + dp5 + AndroidUtilities.dp(24.0f), dp3);
            AndroidUtilities.dp(36.0f);
        }

        private RectF getRect(int i) {
            if (i <= 0) {
                return this.emojiRect;
            }
            if (i == 1) {
                return this.stickersRect;
            }
            return this.gifsRect;
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.drawColor(-14737633);
            this.selectPaint.setColor(-13224394);
            RectF rect = getRect((int) this.type);
            RectF rect2 = getRect((int) Math.ceil(this.type));
            float f = this.type;
            AndroidUtilities.lerp(rect, rect2, f - ((int) f), this.selectRect);
            canvas.drawRoundRect(this.selectRect, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), this.selectPaint);
            if (this.emojiLayout != null) {
                canvas.save();
                float dp = (this.emojiRect.left + AndroidUtilities.dp(12.0f)) - this.emojiLayoutLeft;
                RectF rectF = this.emojiRect;
                canvas.translate(dp, rectF.top + ((rectF.height() - this.emojiLayout.getHeight()) / 2.0f));
                this.textPaint.setColor(ColorUtils.blendARGB(-8158333, -1, Utilities.clamp(1.0f - Math.abs(this.type - 0.0f), 1.0f, 0.0f)));
                this.emojiLayout.draw(canvas);
                canvas.restore();
            }
            if (this.stickersLayout != null) {
                canvas.save();
                float dp2 = (this.stickersRect.left + AndroidUtilities.dp(12.0f)) - this.stickersLayoutLeft;
                RectF rectF2 = this.stickersRect;
                canvas.translate(dp2, rectF2.top + ((rectF2.height() - this.stickersLayout.getHeight()) / 2.0f));
                this.textPaint.setColor(ColorUtils.blendARGB(-8158333, -1, Utilities.clamp(1.0f - Math.abs(this.type - 1.0f), 1.0f, 0.0f)));
                this.stickersLayout.draw(canvas);
                canvas.restore();
            }
            if (this.gifsLayout != null) {
                canvas.save();
                float dp3 = (this.gifsRect.left + AndroidUtilities.dp(12.0f)) - this.gifsLayoutLeft;
                RectF rectF3 = this.gifsRect;
                canvas.translate(dp3, rectF3.top + ((rectF3.height() - this.gifsLayout.getHeight()) / 2.0f));
                this.textPaint.setColor(ColorUtils.blendARGB(-8158333, -1, Utilities.clamp(1.0f - Math.abs(this.type - 2.0f), 1.0f, 0.0f)));
                this.gifsLayout.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                return true;
            }
            if (motionEvent.getAction() == 1 && this.onTypeSelected != null) {
                if (this.emojiRect.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.onTypeSelected.run(0);
                } else if (this.stickersRect.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.onTypeSelected.run(1);
                } else if (this.gifsRect.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.onTypeSelected.run(2);
                }
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    private static class NoEmojiView extends FrameLayout {
        BackupImageView imageView;
        private int lastI;
        TextView textView;

        public NoEmojiView(Context context, boolean z) {
            super(context);
            int i;
            String str;
            this.lastI = -1;
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(36, 36, 17));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            this.textView.setTextColor(-8553090);
            TextView textView2 = this.textView;
            if (z) {
                i = R.string.NoEmojiFound;
                str = "NoEmojiFound";
            } else {
                i = R.string.NoStickersFound;
                str = "NoStickersFound";
            }
            textView2.setText(LocaleController.getString(str, i));
            addView(this.textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
        }

        public void update(int i) {
            if (this.lastI != i) {
                this.lastI = i;
                update();
            }
        }

        public void update() {
            SelectAnimatedEmojiDialog.updateSearchEmptyViewImage(UserConfig.selectedAccount, this.imageView);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(170.0f), (AndroidUtilities.displaySize.y * 0.34999996f) - AndroidUtilities.dp(142.0f)), 1073741824));
        }
    }

    public class StoryWidgetsCell extends View {
        private final Paint bgPaint;
        float[] lineWidths;
        private Utilities.Callback<Integer> onClickListener;
        private final TextPaint textPaint;
        private final List<BaseWidget> widgets;

        public StoryWidgetsCell(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            paint.setColor(436207615);
            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
            textPaint.setColor(-1);
            ArrayList arrayList = new ArrayList();
            this.widgets = arrayList;
            setPadding(0, 0, 0, 0);
            if (EmojiBottomSheet.this.canShowWidget(0)) {
                arrayList.add(new Button(0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
            }
            if (EmojiBottomSheet.this.canShowWidget(1)) {
                arrayList.add(new Button(1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
            }
            if (EmojiBottomSheet.this.canShowWidget(2)) {
                arrayList.add(new Button(2, R.drawable.files_gallery, LocaleController.getString(R.string.StoryWidgetPhoto)));
            }
            if (EmojiBottomSheet.this.canShowWidget(3)) {
                arrayList.add(new ReactionWidget());
            }
        }

        private abstract class BaseWidget {
            ButtonBounce bounce;
            RectF bounds;
            float height;
            int id;
            int layoutLine;
            float layoutX;
            float width;

            abstract void draw(Canvas canvas, float f, float f2);

            public void onAttachToWindow(boolean z) {
            }

            private BaseWidget() {
                this.layoutX = 0.0f;
                this.layoutLine = 0;
                this.bounds = new RectF();
                this.bounce = new ButtonBounce(StoryWidgetsCell.this);
            }
        }

        private class Button extends BaseWidget {
            Drawable drawable;
            StaticLayout layout;
            float textLeft;
            float textWidth;

            public Button(int i, int i2, String str) {
                super();
                this.id = i;
                Drawable mutate = StoryWidgetsCell.this.getContext().getResources().getDrawable(i2).mutate();
                this.drawable = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str.toUpperCase(), StoryWidgetsCell.this.textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), StoryWidgetsCell.this.textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.layout = staticLayout;
                this.textWidth = staticLayout.getLineCount() > 0 ? this.layout.getLineWidth(0) : 0.0f;
                this.textLeft = this.layout.getLineCount() > 0 ? this.layout.getLineLeft(0) : 0.0f;
                this.width = AndroidUtilities.dpf2(45.6f) + this.textWidth;
                this.height = AndroidUtilities.dpf2(36.0f);
            }

            @Override
            public void draw(Canvas canvas, float f, float f2) {
                this.bounds.set(f, f2, this.width + f, this.height + f2);
                float scale = this.bounce.getScale(0.05f);
                canvas.save();
                canvas.scale(scale, scale, this.bounds.centerX(), this.bounds.centerY());
                canvas.drawRoundRect(this.bounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), StoryWidgetsCell.this.bgPaint);
                this.drawable.setBounds((int) (this.bounds.left + AndroidUtilities.dp(6.0f)), (int) ((this.bounds.top + (this.height / 2.0f)) - (AndroidUtilities.dp(24.0f) / 2)), (int) (this.bounds.left + AndroidUtilities.dp(30.0f)), (int) (this.bounds.top + (this.height / 2.0f) + (AndroidUtilities.dp(24.0f) / 2)));
                this.drawable.draw(canvas);
                canvas.translate((this.bounds.left + AndroidUtilities.dp(34.0f)) - this.textLeft, (this.bounds.top + (this.height / 2.0f)) - (this.layout.getHeight() / 2.0f));
                this.layout.draw(canvas);
                canvas.restore();
            }
        }

        public class ReactionWidget extends BaseWidget {
            StoryReactionWidgetBackground background;
            int currentIndex;
            ReactionImageHolder nextReactionHolder;
            AnimatedFloat progressToNext;
            ReactionImageHolder reactionHolder;
            Timer timeTimer;
            ArrayList<ReactionsLayoutInBubble.VisibleReaction> visibleReactions;

            ReactionWidget() {
                super();
                this.reactionHolder = new ReactionImageHolder(StoryWidgetsCell.this);
                this.nextReactionHolder = new ReactionImageHolder(StoryWidgetsCell.this);
                this.progressToNext = new AnimatedFloat(StoryWidgetsCell.this);
                this.background = new StoryReactionWidgetBackground(StoryWidgetsCell.this);
                this.visibleReactions = new ArrayList<>();
                this.id = 3;
                this.width = AndroidUtilities.dp(44.0f);
                this.height = AndroidUtilities.dp(36.0f);
                List<TLRPC$TL_availableReaction> reactionsList = MediaDataController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).getReactionsList();
                for (int i = 0; i < Math.min(reactionsList.size(), 8); i++) {
                    this.visibleReactions.add(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(reactionsList.get(i)));
                }
                Collections.sort(this.visibleReactions, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        int lambda$new$0;
                        lambda$new$0 = EmojiBottomSheet.StoryWidgetsCell.ReactionWidget.lambda$new$0((ReactionsLayoutInBubble.VisibleReaction) obj, (ReactionsLayoutInBubble.VisibleReaction) obj2);
                        return lambda$new$0;
                    }
                });
                if (!this.visibleReactions.isEmpty()) {
                    this.reactionHolder.setVisibleReaction(this.visibleReactions.get(this.currentIndex));
                }
                this.progressToNext.set(1.0f, true);
            }

            public static int lambda$new$0(ReactionsLayoutInBubble.VisibleReaction visibleReaction, ReactionsLayoutInBubble.VisibleReaction visibleReaction2) {
                String str = visibleReaction.emojicon;
                int i = -1;
                int i2 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = visibleReaction2.emojicon;
                return i2 - ((str2 == null || !str2.equals("❤")) ? 0 : 0);
            }

            @Override
            void draw(Canvas canvas, float f, float f2) {
                float dp = f2 - AndroidUtilities.dp(4.0f);
                float f3 = this.width;
                this.bounds.set((int) f, (int) dp, (int) (f + f3), (int) (dp + f3));
                float scale = this.bounce.getScale(0.05f);
                canvas.save();
                canvas.scale(scale, scale, this.bounds.centerX(), this.bounds.centerY());
                StoryReactionWidgetBackground storyReactionWidgetBackground = this.background;
                RectF rectF = this.bounds;
                storyReactionWidgetBackground.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.background.draw(canvas);
                Rect rect = AndroidUtilities.rectTmp2;
                float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
                rect.set((int) (this.bounds.centerX() - dp2), (int) (this.bounds.centerY() - dp2), (int) (this.bounds.centerX() + dp2), (int) (this.bounds.centerY() + dp2));
                float f4 = this.progressToNext.set(1.0f);
                this.nextReactionHolder.setBounds(rect);
                this.reactionHolder.setBounds(rect);
                if (f4 == 1.0f) {
                    this.reactionHolder.draw(canvas);
                } else {
                    canvas.save();
                    float f5 = 1.0f - f4;
                    canvas.scale(f5, f5, this.bounds.centerX(), this.bounds.top);
                    this.nextReactionHolder.setAlpha(f5);
                    this.nextReactionHolder.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.scale(f4, f4, this.bounds.centerX(), this.bounds.bottom);
                    this.reactionHolder.setAlpha(f4);
                    this.reactionHolder.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }

            @Override
            public void onAttachToWindow(boolean z) {
                super.onAttachToWindow(z);
                this.reactionHolder.onAttachedToWindow(z);
                this.nextReactionHolder.onAttachedToWindow(z);
                Timer timer = this.timeTimer;
                if (timer != null) {
                    timer.cancel();
                    this.timeTimer = null;
                }
                if (z) {
                    Timer timer2 = new Timer();
                    this.timeTimer = timer2;
                    timer2.schedule(new AnonymousClass1(), 2000L, 2000L);
                }
            }

            public class AnonymousClass1 extends TimerTask {
                AnonymousClass1() {
                }

                @Override
                public void run() {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            EmojiBottomSheet.StoryWidgetsCell.ReactionWidget.AnonymousClass1.this.lambda$run$0();
                        }
                    });
                }

                public void lambda$run$0() {
                    if (ReactionWidget.this.visibleReactions.isEmpty()) {
                        return;
                    }
                    ReactionWidget.this.progressToNext.set(0.0f, true);
                    ReactionWidget reactionWidget = ReactionWidget.this;
                    int i = reactionWidget.currentIndex + 1;
                    reactionWidget.currentIndex = i;
                    if (i > reactionWidget.visibleReactions.size() - 1) {
                        ReactionWidget.this.currentIndex = 0;
                    }
                    ReactionWidget reactionWidget2 = ReactionWidget.this;
                    ReactionImageHolder reactionImageHolder = reactionWidget2.nextReactionHolder;
                    reactionImageHolder.setVisibleReaction(reactionWidget2.visibleReactions.get(reactionWidget2.currentIndex));
                    ReactionWidget reactionWidget3 = ReactionWidget.this;
                    reactionWidget3.nextReactionHolder = reactionWidget3.reactionHolder;
                    reactionWidget3.reactionHolder = reactionImageHolder;
                    StoryWidgetsCell.this.invalidate();
                }
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int paddingLeft = (int) (((size - getPaddingLeft()) - getPaddingRight()) * 0.8f);
            int i3 = 1;
            float f = 0.0f;
            for (BaseWidget baseWidget : this.widgets) {
                baseWidget.layoutX = f;
                f += baseWidget.width + AndroidUtilities.dp(10.0f);
                if (f > paddingLeft) {
                    i3++;
                    baseWidget.layoutX = 0.0f;
                    f = baseWidget.width + AndroidUtilities.dp(10.0f) + 0.0f;
                }
                baseWidget.layoutLine = i3;
            }
            float[] fArr = this.lineWidths;
            if (fArr == null || fArr.length != i3) {
                this.lineWidths = new float[i3];
            } else {
                Arrays.fill(fArr, 0.0f);
            }
            for (BaseWidget baseWidget2 : this.widgets) {
                int i4 = baseWidget2.layoutLine - 1;
                float[] fArr2 = this.lineWidths;
                if (fArr2[i4] > 0.0f) {
                    fArr2[i4] = fArr2[i4] + AndroidUtilities.dp(10.0f);
                }
                float[] fArr3 = this.lineWidths;
                fArr3[i4] = fArr3[i4] + baseWidget2.width;
            }
            setMeasuredDimension(size, AndroidUtilities.dp(24.0f) + (AndroidUtilities.dp(36.0f) * i3) + ((i3 - 1) * AndroidUtilities.dp(12.0f)));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            for (BaseWidget baseWidget : this.widgets) {
                baseWidget.draw(canvas, getPaddingLeft() + ((((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.lineWidths[baseWidget.layoutLine - 1]) / 2.0f) + baseWidget.layoutX, AndroidUtilities.dp(12.0f) + ((baseWidget.layoutLine - 1) * AndroidUtilities.dp(48.0f)));
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            BaseWidget baseWidget;
            Utilities.Callback<Integer> callback;
            Iterator<BaseWidget> it = this.widgets.iterator();
            while (true) {
                if (!it.hasNext()) {
                    baseWidget = null;
                    break;
                }
                baseWidget = it.next();
                if (baseWidget.bounds.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            }
            for (BaseWidget baseWidget2 : this.widgets) {
                if (baseWidget2 != baseWidget) {
                    baseWidget2.bounce.setPressed(false);
                }
            }
            if (baseWidget != null) {
                baseWidget.bounce.setPressed((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) ? false : true);
            }
            if (motionEvent.getAction() == 1 && baseWidget != null && (callback = this.onClickListener) != null) {
                callback.run(Integer.valueOf(baseWidget.id));
            }
            return baseWidget != null;
        }

        public void setOnButtonClickListener(Utilities.Callback<Integer> callback) {
            this.onClickListener = callback;
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            for (BaseWidget baseWidget : this.widgets) {
                baseWidget.onAttachToWindow(true);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            for (BaseWidget baseWidget : this.widgets) {
                baseWidget.onAttachToWindow(false);
            }
        }
    }
}
