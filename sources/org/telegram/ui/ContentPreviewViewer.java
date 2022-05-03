package org.telegram.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.tgnet.TLRPC$TL_webDocument;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.tgnet.TLRPC$WebDocument;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.ContentPreviewViewer;

public class ContentPreviewViewer {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile ContentPreviewViewer Instance;
    private static TextPaint textPaint;
    private boolean animateY;
    private boolean clearsInputField;
    private FrameLayoutDrawer containerView;
    private int currentAccount;
    private int currentContentType;
    private TLRPC$Document currentDocument;
    private float currentMoveY;
    private float currentMoveYProgress;
    private View currentPreviewCell;
    private String currentQuery;
    private TLRPC$InputStickerSet currentStickerSet;
    private ContentPreviewViewerDelegate delegate;
    private float finalMoveY;
    private SendMessagesHelper.ImportingSticker importingSticker;
    private TLRPC$BotInlineResult inlineResult;
    private boolean isRecentSticker;
    private WindowInsets lastInsets;
    private float lastTouchY;
    private long lastUpdateTime;
    private Runnable openPreviewRunnable;
    private Activity parentActivity;
    private Object parentObject;
    private Theme.ResourcesProvider resourcesProvider;
    private float showProgress;
    private Drawable slideUpDrawable;
    private float startMoveY;
    private int startX;
    private int startY;
    private StaticLayout stickerEmojiLayout;
    VibrationEffect vibrationEffect;
    private BottomSheet visibleDialog;
    private WindowManager.LayoutParams windowLayoutParams;
    private FrameLayout windowView;
    private float moveY = 0.0f;
    private ColorDrawable backgroundDrawable = new ColorDrawable(1895825408);
    private ImageReceiver centerImage = new ImageReceiver();
    private boolean isVisible = false;
    private int keyboardHeight = AndroidUtilities.dp(200.0f);
    private Runnable showSheetRunnable = new AnonymousClass1();

    public interface ContentPreviewViewerDelegate {

        public final class CC {
            public static String $default$getQuery(ContentPreviewViewerDelegate contentPreviewViewerDelegate, boolean z) {
                return null;
            }

            public static void $default$gifAddedOrDeleted(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
            }

            public static boolean $default$needMenu(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static boolean $default$needOpen(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static boolean $default$needRemove(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static void $default$remove(ContentPreviewViewerDelegate contentPreviewViewerDelegate, SendMessagesHelper.ImportingSticker importingSticker) {
            }

            public static void $default$sendGif(ContentPreviewViewerDelegate contentPreviewViewerDelegate, Object obj, Object obj2, boolean z, int i) {
            }
        }

        boolean canSchedule();

        long getDialogId();

        String getQuery(boolean z);

        void gifAddedOrDeleted();

        boolean isInScheduleMode();

        boolean needMenu();

        boolean needOpen();

        boolean needRemove();

        boolean needSend();

        void openSet(TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z);

        void remove(SendMessagesHelper.ImportingSticker importingSticker);

        void sendGif(Object obj, Object obj2, boolean z, int i);

        void sendSticker(TLRPC$Document tLRPC$Document, String str, Object obj, boolean z, int i);
    }

    public class FrameLayoutDrawer extends FrameLayout {
        public FrameLayoutDrawer(Context context) {
            super(context);
            ContentPreviewViewer.this = r1;
            setWillNotDraw(false);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            ContentPreviewViewer.this.onDraw(canvas);
        }
    }

    public class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
            ContentPreviewViewer.this = r1;
        }

        @Override
        public void run() {
            boolean z;
            String str;
            int i;
            if (ContentPreviewViewer.this.parentActivity != null) {
                if (ContentPreviewViewer.this.currentContentType == 0) {
                    final boolean isStickerInFavorites = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).isStickerInFavorites(ContentPreviewViewer.this.currentDocument);
                    BottomSheet.Builder builder = new BottomSheet.Builder(ContentPreviewViewer.this.parentActivity, true, ContentPreviewViewer.this.resourcesProvider);
                    ArrayList arrayList = new ArrayList();
                    final ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (ContentPreviewViewer.this.delegate != null) {
                        if (ContentPreviewViewer.this.delegate.needSend() && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                            arrayList.add(LocaleController.getString("SendStickerPreview", R.string.SendStickerPreview));
                            arrayList3.add(Integer.valueOf((int) R.drawable.outline_send));
                            arrayList2.add(0);
                        }
                        if (!ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                            arrayList.add(LocaleController.getString("SendWithoutSound", R.string.SendWithoutSound));
                            arrayList3.add(Integer.valueOf((int) R.drawable.input_notify_off));
                            arrayList2.add(6);
                        }
                        if (ContentPreviewViewer.this.delegate.canSchedule()) {
                            arrayList.add(LocaleController.getString("Schedule", R.string.Schedule));
                            arrayList3.add(Integer.valueOf((int) R.drawable.msg_timer));
                            arrayList2.add(3);
                        }
                        if (ContentPreviewViewer.this.currentStickerSet != null && ContentPreviewViewer.this.delegate.needOpen()) {
                            arrayList.add(LocaleController.formatString("ViewPackPreview", R.string.ViewPackPreview, new Object[0]));
                            arrayList3.add(Integer.valueOf((int) R.drawable.outline_pack));
                            arrayList2.add(1);
                        }
                        if (ContentPreviewViewer.this.delegate.needRemove()) {
                            arrayList.add(LocaleController.getString("ImportStickersRemoveMenu", R.string.ImportStickersRemoveMenu));
                            arrayList3.add(Integer.valueOf((int) R.drawable.msg_delete));
                            arrayList2.add(5);
                        }
                    }
                    if (!MessageObject.isMaskDocument(ContentPreviewViewer.this.currentDocument) && (isStickerInFavorites || (MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).canAddStickerToFavorites() && MessageObject.isStickerHasSet(ContentPreviewViewer.this.currentDocument)))) {
                        if (isStickerInFavorites) {
                            i = R.string.DeleteFromFavorites;
                            str = "DeleteFromFavorites";
                        } else {
                            i = R.string.AddToFavorites;
                            str = "AddToFavorites";
                        }
                        arrayList.add(LocaleController.getString(str, i));
                        arrayList3.add(Integer.valueOf(isStickerInFavorites ? R.drawable.outline_unfave : R.drawable.outline_fave));
                        arrayList2.add(2);
                    }
                    if (ContentPreviewViewer.this.isRecentSticker) {
                        arrayList.add(LocaleController.getString("DeleteFromRecent", R.string.DeleteFromRecent));
                        arrayList3.add(Integer.valueOf((int) R.drawable.msg_delete));
                        arrayList2.add(4);
                    }
                    if (!arrayList.isEmpty()) {
                        int[] iArr = new int[arrayList3.size()];
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            iArr[i2] = ((Integer) arrayList3.get(i2)).intValue();
                        }
                        builder.setItems((CharSequence[]) arrayList.toArray(new CharSequence[0]), iArr, new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ContentPreviewViewer.AnonymousClass1.this.lambda$run$1(arrayList2, isStickerInFavorites, dialogInterface, i3);
                            }
                        });
                        builder.setDimBehind(false);
                        ContentPreviewViewer.this.visibleDialog = builder.create();
                        ContentPreviewViewer.this.visibleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ContentPreviewViewer.AnonymousClass1.this.lambda$run$2(dialogInterface);
                            }
                        });
                        ContentPreviewViewer.this.visibleDialog.show();
                        ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                        if (ContentPreviewViewer.this.delegate != null && ContentPreviewViewer.this.delegate.needRemove()) {
                            BottomSheet.BottomSheetCell bottomSheetCell = ContentPreviewViewer.this.visibleDialog.getItemViews().get(0);
                            bottomSheetCell.setTextColor(ContentPreviewViewer.this.getThemedColor("dialogTextRed"));
                            bottomSheetCell.setIconColor(ContentPreviewViewer.this.getThemedColor("dialogRedIcon"));
                        }
                    }
                } else if (ContentPreviewViewer.this.delegate != null) {
                    ContentPreviewViewer.this.animateY = true;
                    ContentPreviewViewer.this.visibleDialog = new BottomSheet(ContentPreviewViewer.this.parentActivity, false) {
                        {
                            AnonymousClass1.this = this;
                        }

                        @Override
                        protected void onContainerTranslationYChanged(float f) {
                            if (ContentPreviewViewer.this.animateY) {
                                getSheetContainer();
                                if (ContentPreviewViewer.this.finalMoveY == 0.0f) {
                                    ContentPreviewViewer.this.finalMoveY = 0.0f;
                                    ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
                                    contentPreviewViewer.startMoveY = contentPreviewViewer.moveY;
                                }
                                ContentPreviewViewer.this.currentMoveYProgress = 1.0f - Math.min(1.0f, f / this.containerView.getMeasuredHeight());
                                ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                                contentPreviewViewer2.moveY = contentPreviewViewer2.startMoveY + ((ContentPreviewViewer.this.finalMoveY - ContentPreviewViewer.this.startMoveY) * ContentPreviewViewer.this.currentMoveYProgress);
                                ContentPreviewViewer.this.containerView.invalidate();
                                if (ContentPreviewViewer.this.currentMoveYProgress == 1.0f) {
                                    ContentPreviewViewer.this.animateY = false;
                                }
                            }
                        }
                    };
                    ArrayList arrayList4 = new ArrayList();
                    final ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (ContentPreviewViewer.this.delegate.needSend() && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                        arrayList4.add(LocaleController.getString("SendGifPreview", R.string.SendGifPreview));
                        arrayList6.add(Integer.valueOf((int) R.drawable.outline_send));
                        arrayList5.add(0);
                    }
                    if (ContentPreviewViewer.this.delegate.canSchedule()) {
                        arrayList4.add(LocaleController.getString("Schedule", R.string.Schedule));
                        arrayList6.add(Integer.valueOf((int) R.drawable.msg_timer));
                        arrayList5.add(3);
                    }
                    if (ContentPreviewViewer.this.currentDocument != null) {
                        z = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).hasRecentGif(ContentPreviewViewer.this.currentDocument);
                        if (z) {
                            arrayList4.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                            arrayList6.add(Integer.valueOf((int) R.drawable.msg_delete));
                            arrayList5.add(1);
                        } else {
                            arrayList4.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                            arrayList6.add(Integer.valueOf((int) R.drawable.outline_add_gif));
                            arrayList5.add(2);
                        }
                    } else {
                        z = false;
                    }
                    int[] iArr2 = new int[arrayList6.size()];
                    for (int i3 = 0; i3 < arrayList6.size(); i3++) {
                        iArr2[i3] = ((Integer) arrayList6.get(i3)).intValue();
                    }
                    ContentPreviewViewer.this.visibleDialog.setItems((CharSequence[]) arrayList4.toArray(new CharSequence[0]), iArr2, new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            ContentPreviewViewer.AnonymousClass1.this.lambda$run$4(arrayList5, dialogInterface, i4);
                        }
                    });
                    ContentPreviewViewer.this.visibleDialog.setDimBehind(false);
                    ContentPreviewViewer.this.visibleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ContentPreviewViewer.AnonymousClass1.this.lambda$run$5(dialogInterface);
                        }
                    });
                    ContentPreviewViewer.this.visibleDialog.show();
                    ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                    if (z) {
                        ContentPreviewViewer.this.visibleDialog.setItemColor(arrayList4.size() - 1, ContentPreviewViewer.this.getThemedColor("dialogTextRed2"), ContentPreviewViewer.this.getThemedColor("dialogRedIcon"));
                    }
                }
            }
        }

        public void lambda$run$1(ArrayList arrayList, boolean z, DialogInterface dialogInterface, int i) {
            if (ContentPreviewViewer.this.parentActivity != null) {
                if (((Integer) arrayList.get(i)).intValue() == 0 || ((Integer) arrayList.get(i)).intValue() == 6) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ContentPreviewViewer.this.delegate.sendSticker(ContentPreviewViewer.this.currentDocument, ContentPreviewViewer.this.currentQuery, ContentPreviewViewer.this.parentObject, ((Integer) arrayList.get(i)).intValue() == 0, 0);
                    }
                } else if (((Integer) arrayList.get(i)).intValue() == 1) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ContentPreviewViewer.this.delegate.openSet(ContentPreviewViewer.this.currentStickerSet, ContentPreviewViewer.this.clearsInputField);
                    }
                } else if (((Integer) arrayList.get(i)).intValue() == 2) {
                    MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentSticker(2, ContentPreviewViewer.this.parentObject, ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), z);
                } else if (((Integer) arrayList.get(i)).intValue() == 3) {
                    final TLRPC$Document tLRPC$Document = ContentPreviewViewer.this.currentDocument;
                    final Object obj = ContentPreviewViewer.this.parentObject;
                    final String str = ContentPreviewViewer.this.currentQuery;
                    final ContentPreviewViewerDelegate contentPreviewViewerDelegate = ContentPreviewViewer.this.delegate;
                    AlertsCreator.createScheduleDatePickerDialog(ContentPreviewViewer.this.parentActivity, contentPreviewViewerDelegate.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        @Override
                        public final void didSelectDate(boolean z2, int i2) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.this.sendSticker(tLRPC$Document, str, obj, z2, i2);
                        }
                    });
                } else if (((Integer) arrayList.get(i)).intValue() == 4) {
                    MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentSticker(0, ContentPreviewViewer.this.parentObject, ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(i)).intValue() == 5) {
                    ContentPreviewViewer.this.delegate.remove(ContentPreviewViewer.this.importingSticker);
                }
            }
        }

        public void lambda$run$2(DialogInterface dialogInterface) {
            ContentPreviewViewer.this.visibleDialog = null;
            ContentPreviewViewer.this.close();
        }

        public void lambda$run$4(ArrayList arrayList, DialogInterface dialogInterface, int i) {
            if (ContentPreviewViewer.this.parentActivity != null) {
                if (((Integer) arrayList.get(i)).intValue() == 0) {
                    ContentPreviewViewer.this.delegate.sendGif(ContentPreviewViewer.this.currentDocument != null ? ContentPreviewViewer.this.currentDocument : ContentPreviewViewer.this.inlineResult, ContentPreviewViewer.this.parentObject, true, 0);
                } else if (((Integer) arrayList.get(i)).intValue() == 1) {
                    MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).removeRecentGif(ContentPreviewViewer.this.currentDocument);
                    ContentPreviewViewer.this.delegate.gifAddedOrDeleted();
                } else if (((Integer) arrayList.get(i)).intValue() == 2) {
                    MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentGif(ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000));
                    MessagesController.getInstance(ContentPreviewViewer.this.currentAccount).saveGif("gif", ContentPreviewViewer.this.currentDocument);
                    ContentPreviewViewer.this.delegate.gifAddedOrDeleted();
                } else if (((Integer) arrayList.get(i)).intValue() == 3) {
                    final TLRPC$Document tLRPC$Document = ContentPreviewViewer.this.currentDocument;
                    final TLRPC$BotInlineResult tLRPC$BotInlineResult = ContentPreviewViewer.this.inlineResult;
                    final Object obj = ContentPreviewViewer.this.parentObject;
                    final ContentPreviewViewerDelegate contentPreviewViewerDelegate = ContentPreviewViewer.this.delegate;
                    AlertsCreator.createScheduleDatePickerDialog(ContentPreviewViewer.this.parentActivity, contentPreviewViewerDelegate.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        @Override
                        public final void didSelectDate(boolean z, int i2) {
                            ContentPreviewViewer.AnonymousClass1.lambda$run$3(ContentPreviewViewer.ContentPreviewViewerDelegate.this, tLRPC$Document, tLRPC$BotInlineResult, obj, z, i2);
                        }
                    }, ContentPreviewViewer.this.resourcesProvider);
                }
            }
        }

        public static void lambda$run$3(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC$Document tLRPC$Document, TLRPC$BotInlineResult tLRPC$BotInlineResult, Object obj, boolean z, int i) {
            if (tLRPC$Document == null) {
                tLRPC$Document = tLRPC$BotInlineResult;
            }
            contentPreviewViewerDelegate.sendGif(tLRPC$Document, obj, z, i);
        }

        public void lambda$run$5(DialogInterface dialogInterface) {
            ContentPreviewViewer.this.visibleDialog = null;
            ContentPreviewViewer.this.close();
        }
    }

    public static ContentPreviewViewer getInstance() {
        ContentPreviewViewer contentPreviewViewer = Instance;
        if (contentPreviewViewer == null) {
            synchronized (PhotoViewer.class) {
                contentPreviewViewer = Instance;
                if (contentPreviewViewer == null) {
                    contentPreviewViewer = new ContentPreviewViewer();
                    Instance = contentPreviewViewer;
                }
            }
        }
        return contentPreviewViewer;
    }

    public static boolean hasInstance() {
        return Instance != null;
    }

    public void reset() {
        Runnable runnable = this.openPreviewRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.openPreviewRunnable = null;
        }
        View view = this.currentPreviewCell;
        if (view != null) {
            if (view instanceof StickerEmojiCell) {
                ((StickerEmojiCell) view).setScaled(false);
            } else if (view instanceof StickerCell) {
                ((StickerCell) view).setScaled(false);
            } else if (view instanceof ContextLinkCell) {
                ((ContextLinkCell) view).setScaled(false);
            }
            this.currentPreviewCell = null;
        }
    }

    public boolean onTouch(android.view.MotionEvent r16, final org.telegram.ui.Components.RecyclerListView r17, int r18, final java.lang.Object r19, org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate r20, org.telegram.ui.ActionBar.Theme.ResourcesProvider r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ContentPreviewViewer.onTouch(android.view.MotionEvent, org.telegram.ui.Components.RecyclerListView, int, java.lang.Object, org.telegram.ui.ContentPreviewViewer$ContentPreviewViewerDelegate, org.telegram.ui.ActionBar.Theme$ResourcesProvider):boolean");
    }

    public static void lambda$onTouch$0(RecyclerListView recyclerListView, Object obj) {
        if (recyclerListView instanceof RecyclerListView) {
            recyclerListView.setOnItemClickListener((RecyclerListView.OnItemClickListener) obj);
        }
    }

    protected void runSmoothHaptic() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) this.containerView.getContext().getSystemService("vibrator");
            if (this.vibrationEffect == null) {
                this.vibrationEffect = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.vibrationEffect);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent, final RecyclerListView recyclerListView, final int i, ContentPreviewViewerDelegate contentPreviewViewerDelegate, final Theme.ResourcesProvider resourcesProvider) {
        int i2;
        this.delegate = contentPreviewViewerDelegate;
        this.resourcesProvider = resourcesProvider;
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = recyclerListView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerListView.getChildAt(i3);
                if (childAt == null) {
                    return false;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y && bottom >= y && left <= x && right >= x) {
                    if (childAt instanceof StickerEmojiCell) {
                        if (((StickerEmojiCell) childAt).showingBitmap()) {
                            this.centerImage.setRoundRadius(0);
                            i2 = 0;
                        }
                        i2 = -1;
                    } else if (childAt instanceof StickerCell) {
                        if (((StickerCell) childAt).showingBitmap()) {
                            this.centerImage.setRoundRadius(0);
                            i2 = 0;
                        }
                        i2 = -1;
                    } else {
                        if (childAt instanceof ContextLinkCell) {
                            ContextLinkCell contextLinkCell = (ContextLinkCell) childAt;
                            if (contextLinkCell.showingBitmap()) {
                                if (contextLinkCell.isSticker()) {
                                    this.centerImage.setRoundRadius(0);
                                    i2 = 0;
                                } else if (contextLinkCell.isGif()) {
                                    this.centerImage.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i2 = 1;
                                }
                            }
                        }
                        i2 = -1;
                    }
                    if (i2 == -1) {
                        return false;
                    }
                    this.startX = x;
                    this.startY = y;
                    this.currentPreviewCell = childAt;
                    final int i4 = i2;
                    Runnable contentPreviewViewer$$ExternalSyntheticLambda4 = new Runnable() {
                        @Override
                        public final void run() {
                            ContentPreviewViewer.this.lambda$onInterceptTouchEvent$1(recyclerListView, i, i4, resourcesProvider);
                        }
                    };
                    this.openPreviewRunnable = contentPreviewViewer$$ExternalSyntheticLambda4;
                    AndroidUtilities.runOnUIThread(contentPreviewViewer$$ExternalSyntheticLambda4, 200L);
                    return true;
                }
            }
        }
        return false;
    }

    public void lambda$onInterceptTouchEvent$1(RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        if (this.openPreviewRunnable != null) {
            recyclerListView.setOnItemClickListener((RecyclerListView.OnItemClickListener) null);
            recyclerListView.requestDisallowInterceptTouchEvent(true);
            this.openPreviewRunnable = null;
            setParentActivity((Activity) recyclerListView.getContext());
            setKeyboardHeight(i);
            this.clearsInputField = false;
            View view = this.currentPreviewCell;
            if (view instanceof StickerEmojiCell) {
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
                TLRPC$Document sticker = stickerEmojiCell.getSticker();
                SendMessagesHelper.ImportingSticker stickerPath = stickerEmojiCell.getStickerPath();
                String emoji = stickerEmojiCell.getEmoji();
                ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
                open(sticker, stickerPath, emoji, contentPreviewViewerDelegate != null ? contentPreviewViewerDelegate.getQuery(false) : null, null, i2, stickerEmojiCell.isRecent(), stickerEmojiCell.getParentObject(), resourcesProvider);
                stickerEmojiCell.setScaled(true);
            } else if (view instanceof StickerCell) {
                StickerCell stickerCell = (StickerCell) view;
                TLRPC$Document sticker2 = stickerCell.getSticker();
                ContentPreviewViewerDelegate contentPreviewViewerDelegate2 = this.delegate;
                open(sticker2, null, null, contentPreviewViewerDelegate2 != null ? contentPreviewViewerDelegate2.getQuery(false) : null, null, i2, false, stickerCell.getParentObject(), resourcesProvider);
                stickerCell.setScaled(true);
                this.clearsInputField = stickerCell.isClearsInputField();
            } else if (view instanceof ContextLinkCell) {
                ContextLinkCell contextLinkCell = (ContextLinkCell) view;
                TLRPC$Document document = contextLinkCell.getDocument();
                ContentPreviewViewerDelegate contentPreviewViewerDelegate3 = this.delegate;
                open(document, null, null, contentPreviewViewerDelegate3 != null ? contentPreviewViewerDelegate3.getQuery(true) : null, contextLinkCell.getBotInlineResult(), i2, false, contextLinkCell.getBotInlineResult() != null ? contextLinkCell.getInlineBot() : contextLinkCell.getParentObject(), resourcesProvider);
                if (i2 != 1) {
                    contextLinkCell.setScaled(true);
                }
            }
            this.currentPreviewCell.performHapticFeedback(0, 2);
        }
    }

    public void setParentActivity(Activity activity) {
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.centerImage.setCurrentAccount(i);
        this.centerImage.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.parentActivity != activity) {
            this.parentActivity = activity;
            this.slideUpDrawable = activity.getResources().getDrawable(R.drawable.preview_arrow);
            FrameLayout frameLayout = new FrameLayout(activity);
            this.windowView = frameLayout;
            frameLayout.setFocusable(true);
            this.windowView.setFocusableInTouchMode(true);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                this.windowView.setFitsSystemWindows(true);
                this.windowView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    @Override
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        WindowInsets lambda$setParentActivity$2;
                        lambda$setParentActivity$2 = ContentPreviewViewer.this.lambda$setParentActivity$2(view, windowInsets);
                        return lambda$setParentActivity$2;
                    }
                });
            }
            FrameLayoutDrawer frameLayoutDrawer = new FrameLayoutDrawer(activity) {
                {
                    ContentPreviewViewer.this = this;
                }

                @Override
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    ContentPreviewViewer.this.centerImage.onAttachedToWindow();
                }

                @Override
                protected void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    ContentPreviewViewer.this.centerImage.onDetachedFromWindow();
                }
            };
            this.containerView = frameLayoutDrawer;
            frameLayoutDrawer.setFocusable(false);
            this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 51));
            this.containerView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$setParentActivity$3;
                    lambda$setParentActivity$3 = ContentPreviewViewer.this.lambda$setParentActivity$3(view, motionEvent);
                    return lambda$setParentActivity$3;
                }
            });
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.windowLayoutParams = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 48;
            layoutParams.type = 99;
            if (i2 >= 21) {
                layoutParams.flags = -2147417848;
            } else {
                layoutParams.flags = 8;
            }
            this.centerImage.setAspectFit(true);
            this.centerImage.setInvalidateAll(true);
            this.centerImage.setParentView(this.containerView);
        }
    }

    public WindowInsets lambda$setParentActivity$2(View view, WindowInsets windowInsets) {
        this.lastInsets = windowInsets;
        return windowInsets;
    }

    public boolean lambda$setParentActivity$3(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
            close();
        }
        return true;
    }

    public void setKeyboardHeight(int i) {
        this.keyboardHeight = i;
    }

    public void open(TLRPC$Document tLRPC$Document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC$BotInlineResult tLRPC$BotInlineResult, int i, boolean z, Object obj, Theme.ResourcesProvider resourcesProvider) {
        TLRPC$InputStickerSet tLRPC$InputStickerSet;
        ContentPreviewViewerDelegate contentPreviewViewerDelegate;
        if (this.parentActivity != null && this.windowView != null) {
            this.resourcesProvider = resourcesProvider;
            this.isRecentSticker = z;
            this.stickerEmojiLayout = null;
            if (i != 0) {
                if (tLRPC$Document != null) {
                    TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                    TLRPC$VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(tLRPC$Document);
                    ImageLocation forDocument = ImageLocation.getForDocument(tLRPC$Document);
                    forDocument.imageType = 2;
                    if (documentVideoThumb != null) {
                        this.centerImage.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, tLRPC$Document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), "90_90_b", null, tLRPC$Document.size, null, "gif" + tLRPC$Document, 0);
                    } else {
                        this.centerImage.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), "90_90_b", tLRPC$Document.size, null, "gif" + tLRPC$Document, 0);
                    }
                } else if (tLRPC$BotInlineResult != null && tLRPC$BotInlineResult.content != null) {
                    TLRPC$WebDocument tLRPC$WebDocument = tLRPC$BotInlineResult.thumb;
                    if (!(tLRPC$WebDocument instanceof TLRPC$TL_webDocument) || !"video/mp4".equals(tLRPC$WebDocument.mime_type)) {
                        this.centerImage.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$BotInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$BotInlineResult.thumb)), "90_90_b", tLRPC$BotInlineResult.content.size, null, "gif" + tLRPC$BotInlineResult, 1);
                    } else {
                        this.centerImage.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$BotInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$BotInlineResult.thumb)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$BotInlineResult.thumb)), "90_90_b", null, tLRPC$BotInlineResult.content.size, null, "gif" + tLRPC$BotInlineResult, 1);
                    }
                } else {
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
                AndroidUtilities.runOnUIThread(this.showSheetRunnable, 2000L);
            } else if (tLRPC$Document != null || importingSticker != null) {
                if (textPaint == null) {
                    TextPaint textPaint2 = new TextPaint(1);
                    textPaint = textPaint2;
                    textPaint2.setTextSize(AndroidUtilities.dp(24.0f));
                }
                if (tLRPC$Document != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= tLRPC$Document.attributes.size()) {
                            tLRPC$InputStickerSet = null;
                            break;
                        }
                        TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i2);
                        if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) && (tLRPC$InputStickerSet = tLRPC$DocumentAttribute.stickerset) != null) {
                            break;
                        }
                        i2++;
                    }
                    if (tLRPC$InputStickerSet != null && ((contentPreviewViewerDelegate = this.delegate) == null || contentPreviewViewerDelegate.needMenu())) {
                        try {
                            BottomSheet bottomSheet = this.visibleDialog;
                            if (bottomSheet != null) {
                                bottomSheet.setOnDismissListener(null);
                                this.visibleDialog.dismiss();
                                this.visibleDialog = null;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
                        AndroidUtilities.runOnUIThread(this.showSheetRunnable, 1300L);
                    }
                    this.currentStickerSet = tLRPC$InputStickerSet;
                    TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                    if (MessageObject.isVideoStickerDocument(tLRPC$Document)) {
                        this.centerImage.setImage(ImageLocation.getForDocument(tLRPC$Document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, tLRPC$Document), null, null, 0, "webp", this.currentStickerSet, 1);
                    } else {
                        this.centerImage.setImage(ImageLocation.getForDocument(tLRPC$Document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, tLRPC$Document), (String) null, "webp", this.currentStickerSet, 1);
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= tLRPC$Document.attributes.size()) {
                            break;
                        }
                        TLRPC$DocumentAttribute tLRPC$DocumentAttribute2 = tLRPC$Document.attributes.get(i3);
                        if ((tLRPC$DocumentAttribute2 instanceof TLRPC$TL_documentAttributeSticker) && !TextUtils.isEmpty(tLRPC$DocumentAttribute2.alt)) {
                            this.stickerEmojiLayout = new StaticLayout(Emoji.replaceEmoji(tLRPC$DocumentAttribute2.alt, textPaint.getFontMetricsInt(), AndroidUtilities.dp(24.0f), false), textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            break;
                        }
                        i3++;
                    }
                } else if (importingSticker != null) {
                    this.centerImage.setImage(importingSticker.path, null, null, importingSticker.animated ? "tgs" : null, 0);
                    if (str != null) {
                        this.stickerEmojiLayout = new StaticLayout(Emoji.replaceEmoji(str, textPaint.getFontMetricsInt(), AndroidUtilities.dp(24.0f), false), textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    if (this.delegate.needMenu()) {
                        try {
                            BottomSheet bottomSheet2 = this.visibleDialog;
                            if (bottomSheet2 != null) {
                                bottomSheet2.setOnDismissListener(null);
                                this.visibleDialog.dismiss();
                                this.visibleDialog = null;
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                        AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
                        AndroidUtilities.runOnUIThread(this.showSheetRunnable, 1300L);
                    }
                }
            } else {
                return;
            }
            this.currentContentType = i;
            this.currentDocument = tLRPC$Document;
            this.importingSticker = importingSticker;
            this.currentQuery = str2;
            this.inlineResult = tLRPC$BotInlineResult;
            this.parentObject = obj;
            this.resourcesProvider = resourcesProvider;
            this.containerView.invalidate();
            if (!this.isVisible) {
                AndroidUtilities.lockOrientation(this.parentActivity);
                try {
                    if (this.windowView.getParent() != null) {
                        ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                ((WindowManager) this.parentActivity.getSystemService("window")).addView(this.windowView, this.windowLayoutParams);
                this.isVisible = true;
                this.showProgress = 0.0f;
                this.lastTouchY = -10000.0f;
                this.currentMoveYProgress = 0.0f;
                this.finalMoveY = 0.0f;
                this.currentMoveY = 0.0f;
                this.moveY = 0.0f;
                this.lastUpdateTime = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void close() {
        if (this.parentActivity != null && this.visibleDialog == null) {
            AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
            this.showProgress = 1.0f;
            this.lastUpdateTime = System.currentTimeMillis();
            this.containerView.invalidate();
            try {
                BottomSheet bottomSheet = this.visibleDialog;
                if (bottomSheet != null) {
                    bottomSheet.dismiss();
                    this.visibleDialog = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.currentDocument = null;
            this.currentStickerSet = null;
            this.currentQuery = null;
            this.delegate = null;
            this.isVisible = false;
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public void destroy() {
        FrameLayout frameLayout;
        this.isVisible = false;
        this.delegate = null;
        this.currentDocument = null;
        this.currentQuery = null;
        this.currentStickerSet = null;
        try {
            BottomSheet bottomSheet = this.visibleDialog;
            if (bottomSheet != null) {
                bottomSheet.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.parentActivity != null && (frameLayout = this.windowView) != null) {
            try {
                if (frameLayout.getParent() != null) {
                    ((WindowManager) this.parentActivity.getSystemService("window")).removeViewImmediate(this.windowView);
                }
                this.windowView = null;
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            Instance = null;
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    private float rubberYPoisition(float f, float f2) {
        float f3 = 1.0f;
        float f4 = -((1.0f - (1.0f / (((Math.abs(f) * 0.55f) / f2) + 1.0f))) * f2);
        if (f >= 0.0f) {
            f3 = -1.0f;
        }
        return f4 * f3;
    }

    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        ColorDrawable colorDrawable;
        int i;
        int i2;
        int i3;
        Drawable drawable;
        WindowInsets windowInsets;
        if (this.containerView != null && (colorDrawable = this.backgroundDrawable) != null) {
            colorDrawable.setAlpha((int) (this.showProgress * 180.0f));
            int i4 = 0;
            this.backgroundDrawable.setBounds(0, 0, this.containerView.getWidth(), this.containerView.getHeight());
            this.backgroundDrawable.draw(canvas);
            canvas.save();
            if (Build.VERSION.SDK_INT < 21 || (windowInsets = this.lastInsets) == null) {
                i = AndroidUtilities.statusBarHeight;
                i2 = 0;
            } else {
                i2 = windowInsets.getStableInsetBottom() + this.lastInsets.getStableInsetTop();
                i = this.lastInsets.getStableInsetTop();
            }
            if (this.currentContentType == 1) {
                i3 = Math.min(this.containerView.getWidth(), this.containerView.getHeight() - i2) - AndroidUtilities.dp(40.0f);
            } else {
                i3 = (int) (Math.min(this.containerView.getWidth(), this.containerView.getHeight() - i2) / 1.8f);
            }
            float width = this.containerView.getWidth() / 2;
            float f = this.moveY;
            int i5 = (i3 / 2) + i;
            if (this.stickerEmojiLayout != null) {
                i4 = AndroidUtilities.dp(40.0f);
            }
            canvas.translate(width, f + Math.max(i5 + i4, ((this.containerView.getHeight() - i2) - this.keyboardHeight) / 2));
            float f2 = this.showProgress;
            int i6 = (int) (i3 * ((f2 * 0.8f) / 0.8f));
            this.centerImage.setAlpha(f2);
            float f3 = (-i6) / 2;
            float f4 = i6;
            this.centerImage.setImageCoords(f3, f3, f4, f4);
            this.centerImage.draw(canvas);
            if (this.currentContentType == 1 && (drawable = this.slideUpDrawable) != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = this.slideUpDrawable.getIntrinsicHeight();
                int dp = (int) (this.centerImage.getDrawRegion().top - AndroidUtilities.dp(((this.currentMoveY / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
                this.slideUpDrawable.setAlpha((int) ((1.0f - this.currentMoveYProgress) * 255.0f));
                this.slideUpDrawable.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + dp, intrinsicWidth / 2, dp);
                this.slideUpDrawable.draw(canvas);
            }
            if (this.stickerEmojiLayout != null) {
                canvas.translate(-AndroidUtilities.dp(50.0f), ((-this.centerImage.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                this.stickerEmojiLayout.draw(canvas);
            }
            canvas.restore();
            if (this.isVisible) {
                if (this.showProgress != 1.0f) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.lastUpdateTime = currentTimeMillis;
                    this.showProgress += ((float) (currentTimeMillis - this.lastUpdateTime)) / 120.0f;
                    this.containerView.invalidate();
                    if (this.showProgress > 1.0f) {
                        this.showProgress = 1.0f;
                    }
                }
            } else if (this.showProgress != 0.0f) {
                long currentTimeMillis2 = System.currentTimeMillis();
                this.lastUpdateTime = currentTimeMillis2;
                this.showProgress -= ((float) (currentTimeMillis2 - this.lastUpdateTime)) / 120.0f;
                this.containerView.invalidate();
                if (this.showProgress < 0.0f) {
                    this.showProgress = 0.0f;
                }
                if (this.showProgress == 0.0f) {
                    this.centerImage.setImageBitmap((Drawable) null);
                    AndroidUtilities.unlockOrientation(this.parentActivity);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ContentPreviewViewer.this.lambda$onDraw$4();
                        }
                    });
                    try {
                        if (this.windowView.getParent() != null) {
                            ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
        }
    }

    public void lambda$onDraw$4() {
        this.centerImage.setImageBitmap((Bitmap) null);
    }

    public int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
