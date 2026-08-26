package org.telegram.ui.bots;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda153;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AttachableDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Text;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda2;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda22;

public abstract class SetupEmojiStatusSheet {

    public final class AnonymousClass1 extends BaseFragment {
        @Override
        public final Context getContext() {
            return AndroidUtilities.findActivity(LaunchActivity.instance);
        }

        @Override
        public final int getCurrentAccount() {
            return this.currentAccount;
        }

        @Override
        public final Activity getParentActivity() {
            Activity activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
            return activityFindActivity == null ? LaunchActivity.instance : activityFindActivity;
        }
    }

    public final class AnonymousClass2 extends BaseFragment {
        @Override
        public final Context getContext() {
            return AndroidUtilities.findActivity(LaunchActivity.instance);
        }

        @Override
        public final int getCurrentAccount() {
            return this.currentAccount;
        }

        @Override
        public final Activity getParentActivity() {
            Activity activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
            return activityFindActivity == null ? LaunchActivity.instance : activityFindActivity;
        }
    }

    public static void askPermission(int i, long j, BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda22) {
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(j);
        if (userFull == null) {
            MessagesController.getInstance(i).loadFullUser(user, 0, true, new CommunityUtils$$ExternalSyntheticLambda2(botWebViewContainer$$ExternalSyntheticLambda22, i, user, 3));
        } else {
            askPermission(botWebViewContainer$$ExternalSyntheticLambda22, i, user, userFull);
        }
    }

    public static boolean getAccessRequested(Context context, int i, long j) {
        if (context == null) {
            return false;
        }
        return NotificationsController$$ExternalSyntheticOutline0.m("requested_", j, context.getSharedPreferences("botemojistatus_" + i, 0), false);
    }

    public static void show(final int i, final TLRPC.User user, long j, final int i2, final BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda22) {
        TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(i, j);
        if (documentFindDocument != null) {
            show(i, user, documentFindDocument, i2, new SetupEmojiStatusSheet$$ExternalSyntheticLambda1(botWebViewContainer$$ExternalSyntheticLambda22, documentFindDocument, 0));
        } else {
            AnimatedEmojiDrawable.getDocumentFetcher(i).fetchDocument(j, new AnimatedEmojiDrawable.ReceivedDocument() {
                @Override
                public final void run(TLRPC.Document document) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda153(i, user, document, i2, botWebViewContainer$$ExternalSyntheticLambda22));
                }
            });
        }
    }

    public static void show(int i, TLRPC.User user, TLRPC.Document document, int i2, Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        if (document != null && !(document instanceof TLRPC.TL_documentEmpty)) {
            Context contextFindActivity = AndroidUtilities.findActivity(LaunchActivity.instance);
            if (contextFindActivity == null) {
                contextFindActivity = ApplicationLoader.applicationContext;
            }
            ConnectionsManager.getInstance(i).getCurrentTime();
            TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
            boolean[] zArr = new boolean[1];
            boolean[] zArr2 = new boolean[1];
            if (i2 > 0) {
                int i3 = i2 / 86400;
                int i4 = i2 - (86400 * i3);
                int i5 = i4 / 3600;
                int iRound = Math.round((i4 - (i5 * 3600)) / 60.0f);
                StringBuilder sb = new StringBuilder();
                if (i3 > 0) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(LocaleController.formatPluralString("BotEmojiStatusSetRequestForDay", i3, new Object[0]));
                }
                if (i5 > 0) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(LocaleController.formatPluralString("BotEmojiStatusSetRequestForHour", i5, new Object[0]));
                }
                if (iRound > 0) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(LocaleController.formatPluralString("BotEmojiStatusSetRequestForMinute", iRound, new Object[0]));
                }
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusSetRequestFor, UserObject.getUserName(user), sb));
            } else {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusSetRequest, UserObject.getUserName(user)));
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(contextFindActivity, 0, null).setTopImage(new UserEmojiStatusDrawable(currentUser, document), Theme.getColor(null, Theme.key_dialogTopBackground, false)).setMessage(spannableStringBuilderReplaceTags).setPositiveButton(LocaleController.getString(R.string.BotEmojiStatusConfirm), new SetupEmojiStatusSheet$$ExternalSyntheticLambda3(i, zArr2, document, i2, zArr, callback)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
            alertDialogCreate.show();
            alertDialogCreate.setOnDismissListener(new BotLocation$$ExternalSyntheticLambda13(zArr2, zArr, callback));
            return;
        }
        callback.run("SUGGESTED_EMOJI_INVALID");
    }

    public static void askPermission(final BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda22, final int i, final TLRPC.User user, final TLRPC.UserFull userFull) {
        if (userFull.bot_can_manage_emoji_status) {
            botWebViewContainer$$ExternalSyntheticLambda22.run(Boolean.FALSE, "allowed");
            return;
        }
        Context contextFindActivity = AndroidUtilities.findActivity(LaunchActivity.instance);
        if (contextFindActivity == null) {
            contextFindActivity = ApplicationLoader.applicationContext;
        }
        final Context context = contextFindActivity;
        final boolean[] zArr = new boolean[1];
        final boolean[] zArr2 = new boolean[1];
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context, 0, null).setTopImage(new UserEmojiStatusDrawable(UserConfig.getInstance(i).getCurrentUser()), Theme.getColor(null, Theme.key_dialogTopBackground, false)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)))).setPositiveButton(LocaleController.getString(R.string.BotEmojiStatusPermissionAllow), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                int i3 = i;
                boolean zIsPremium = UserConfig.getInstance(i3).isPremium();
                boolean[] zArr3 = zArr2;
                boolean[] zArr4 = zArr;
                BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda23 = botWebViewContainer$$ExternalSyntheticLambda22;
                if (!zIsPremium) {
                    SetupEmojiStatusSheet.AnonymousClass2 anonymousClass2 = new SetupEmojiStatusSheet.AnonymousClass2(null);
                    new PremiumFeatureBottomSheet(anonymousClass2, AndroidUtilities.findActivity(LaunchActivity.instance), anonymousClass2.getCurrentAccount(), false, 12, false, null).show();
                    if (zArr3[0] || zArr4[0]) {
                        return;
                    }
                    zArr4[0] = true;
                    botWebViewContainer$$ExternalSyntheticLambda23.run(Boolean.TRUE, "cancelled");
                    return;
                }
                zArr3[0] = true;
                TLRPC.User user2 = user;
                long j = user2.id;
                Context context2 = context;
                if (context2 != null) {
                    context2.getSharedPreferences("botemojistatus_" + i3, 0).edit().putBoolean("requested_" + j, true).apply();
                }
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(i3).getInputUser(user2);
                toggleuseremojistatuspermission.enabled = true;
                ConnectionsManager.getInstance(i3).sendRequest(toggleuseremojistatuspermission, new StarGiftSheet$$ExternalSyntheticLambda1(zArr4, botWebViewContainer$$ExternalSyntheticLambda23, userFull, 16));
            }
        }).setNegativeButton(LocaleController.getString(R.string.BotEmojiStatusPermissionDecline), null).create();
        alertDialogCreate.show();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                if (zArr2[0]) {
                    return;
                }
                boolean[] zArr3 = zArr;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                long j = user.id;
                Context context2 = context;
                if (context2 != null) {
                    context2.getSharedPreferences("botemojistatus_" + i, 0).edit().putBoolean("requested_" + j, true).apply();
                }
                botWebViewContainer$$ExternalSyntheticLambda22.run(Boolean.TRUE, "cancelled");
            }
        });
    }

    public final class UserEmojiStatusDrawable extends Drawable implements AttachableDrawable, NotificationCenter.NotificationCenterDelegate {
        public final AnimatedFloat animatedSwap;
        public boolean attached;
        public final Paint backgroundPaint;
        public final Paint backgroundPaint2;
        public int currentStatus;
        public final AnimatedEmojiDrawable[] emojis;
        public final boolean highlight;
        public final RectF rect;
        public final ImageReceiver statusImageReceiver;
        public final Text text;
        public final ImageReceiver userImageReceiver;
        public View view;
        public boolean waitingForStatuses;

        public UserEmojiStatusDrawable(TLRPC.User user) {
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            Paint paint2 = new Paint(1);
            this.backgroundPaint2 = paint2;
            ImageReceiver imageReceiver = new ImageReceiver();
            this.userImageReceiver = imageReceiver;
            this.statusImageReceiver = new ImageReceiver();
            this.currentStatus = 1;
            this.emojis = new AnimatedEmojiDrawable[2];
            this.rect = new RectF();
            this.animatedSwap = new AnimatedFloat(new SetupEmojiStatusSheet$UserEmojiStatusDrawable$$ExternalSyntheticLambda0(this, 1), 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.highlight = false;
            int i = Theme.key_windowBackgroundWhite;
            paint.setColor(Theme.getColor(null, i, false));
            paint2.setColor(Theme.getColor(null, i, false));
            paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), Theme.multAlpha(0.18f, -16777216));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(user);
            imageReceiver.setForUserOrChat(user, avatarDrawable);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
            setRandomStatus();
            this.text = new Text(UserObject.getUserName(user), 14.0f);
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.groupStickersDidLoad && this.waitingForStatuses && this.attached) {
                this.waitingForStatuses = false;
                setRandomStatus();
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            float f4;
            AnimatedEmojiDrawable animatedEmojiDrawable;
            AnimatedEmojiDrawable animatedEmojiDrawable2;
            Rect bounds = getBounds();
            boolean z = this.highlight;
            float currentWidth = this.text.getCurrentWidth() + AndroidUtilities.dp((z ? 48 : 28) + 38 + 6.66f);
            float fDp = AndroidUtilities.dp(32.0f);
            float f5 = currentWidth / 2.0f;
            float fCenterX = bounds.centerX() - f5;
            float f6 = fDp / 2.0f;
            float fCenterY = bounds.centerY() - f6;
            float fCenterX2 = bounds.centerX() + f5;
            float fCenterY2 = bounds.centerY() + f6;
            RectF rectF = this.rect;
            rectF.set(fCenterX, fCenterY, fCenterX2, fCenterY2);
            canvas.drawRoundRect(rectF, f6, f6, this.backgroundPaint);
            float f7 = rectF.left;
            float f8 = rectF.top;
            float fDp2 = AndroidUtilities.dp(32.0f);
            float fDp3 = AndroidUtilities.dp(32.0f);
            ImageReceiver imageReceiver = this.userImageReceiver;
            imageReceiver.setImageCoords(f7, f8, fDp2, fDp3);
            imageReceiver.draw(canvas);
            this.text.draw(canvas, AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 1.0f);
            if (z) {
                float fDp4 = rectF.right - AndroidUtilities.dp(22.66f);
                canvas.drawCircle(fDp4, rectF.centerY(), AndroidUtilities.dp(24.0f), this.backgroundPaint2);
                float fDp5 = fDp4 - AndroidUtilities.dp(16.0f);
                float fCenterY3 = rectF.centerY() - AndroidUtilities.dp(16.0f);
                float fDp6 = AndroidUtilities.dp(32.0f);
                float fDp7 = AndroidUtilities.dp(32.0f);
                ImageReceiver imageReceiver2 = this.statusImageReceiver;
                imageReceiver2.setImageCoords(fDp5, fCenterY3, fDp6, fDp7);
                imageReceiver2.draw(canvas);
                return;
            }
            float f9 = this.animatedSwap.set(this.currentStatus);
            canvas.save();
            canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
            AnimatedEmojiDrawable[] animatedEmojiDrawableArr = this.emojis;
            if (f9 >= 1.0f || (animatedEmojiDrawable2 = animatedEmojiDrawableArr[0]) == null) {
                f = 24.0f;
                f2 = 0.6f;
                f3 = 255.0f;
                f4 = 12.0f;
            } else {
                canvas.save();
                f = 24.0f;
                canvas.translate(0.0f, (this.currentStatus == 0 ? -1 : 1) * AndroidUtilities.dp(9.0f) * f9);
                float f10 = 1.0f - f9;
                f3 = 255.0f;
                float f11 = (f10 * 0.4f) + 0.6f;
                f2 = 0.6f;
                f4 = 12.0f;
                canvas.scale(f11, f11, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                animatedEmojiDrawable2.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                animatedEmojiDrawable2.setAlpha((int) (f10 * 255.0f));
                animatedEmojiDrawable2.draw(canvas);
                canvas.restore();
            }
            if (f9 > 0.0f && (animatedEmojiDrawable = animatedEmojiDrawableArr[1]) != null) {
                canvas.save();
                canvas.translate(0.0f, (1.0f - f9) * AndroidUtilities.dp(9.0f) * (this.currentStatus != 1 ? 1 : -1));
                float f12 = (0.4f * f9) + f2;
                canvas.scale(f12, f12, AndroidUtilities.dp(f4), AndroidUtilities.dp(f4));
                animatedEmojiDrawable.setBounds(0, 0, AndroidUtilities.dp(f), AndroidUtilities.dp(f));
                animatedEmojiDrawable.setAlpha((int) (f9 * f3));
                animatedEmojiDrawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void onAttachedToWindow(ImageReceiver imageReceiver) {
            this.attached = true;
            this.userImageReceiver.onAttachedToWindow();
            this.statusImageReceiver.onAttachedToWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
            AnimatedEmojiDrawable[] animatedEmojiDrawableArr = this.emojis;
            AnimatedEmojiDrawable animatedEmojiDrawable = animatedEmojiDrawableArr[0];
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this.view);
            }
            AnimatedEmojiDrawable animatedEmojiDrawable2 = animatedEmojiDrawableArr[1];
            if (animatedEmojiDrawable2 != null) {
                animatedEmojiDrawable2.addView(this.view);
            }
        }

        @Override
        public final void onDetachedFromWindow(ImageReceiver imageReceiver) {
            this.attached = false;
            this.userImageReceiver.onDetachedFromWindow();
            this.statusImageReceiver.onDetachedFromWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
            AnimatedEmojiDrawable[] animatedEmojiDrawableArr = this.emojis;
            AnimatedEmojiDrawable animatedEmojiDrawable = animatedEmojiDrawableArr[0];
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this.view);
            }
            AnimatedEmojiDrawable animatedEmojiDrawable2 = animatedEmojiDrawableArr[1];
            if (animatedEmojiDrawable2 != null) {
                animatedEmojiDrawable2.removeView(this.view);
            }
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }

        @Override
        public final void setParent(View view) {
            this.view = view;
            this.statusImageReceiver.setParentView(view);
            this.userImageReceiver.setParentView(view);
        }

        public final void setRandomStatus() {
            AnimatedEmojiDrawable animatedEmojiDrawable;
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            if (stickerSet == null || stickerSet.documents.isEmpty()) {
                this.waitingForStatuses = true;
                return;
            }
            TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * ((double) stickerSet.documents.size())));
            int i = 1 - this.currentStatus;
            this.currentStatus = i;
            AnimatedEmojiDrawable[] animatedEmojiDrawableArr = this.emojis;
            AnimatedEmojiDrawable animatedEmojiDrawable2 = animatedEmojiDrawableArr[i];
            if (animatedEmojiDrawable2 != null) {
                animatedEmojiDrawable2.removeView(this.view);
            }
            animatedEmojiDrawableArr[this.currentStatus] = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, 9, document);
            animatedEmojiDrawableArr[this.currentStatus].setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_featuredStickers_addButton, false), PorterDuff.Mode.SRC_IN));
            if (this.attached && (animatedEmojiDrawable = animatedEmojiDrawableArr[this.currentStatus]) != null) {
                animatedEmojiDrawable.addView(this.view);
            }
            AndroidUtilities.runOnUIThread(new SetupEmojiStatusSheet$UserEmojiStatusDrawable$$ExternalSyntheticLambda0(this, 0), 2500L);
        }

        public UserEmojiStatusDrawable(TLRPC.User user, TLRPC.Document document) {
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            Paint paint2 = new Paint(1);
            this.backgroundPaint2 = paint2;
            ImageReceiver imageReceiver = new ImageReceiver();
            this.userImageReceiver = imageReceiver;
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.statusImageReceiver = imageReceiver2;
            this.currentStatus = 1;
            this.emojis = new AnimatedEmojiDrawable[2];
            this.rect = new RectF();
            this.animatedSwap = new AnimatedFloat(new SetupEmojiStatusSheet$UserEmojiStatusDrawable$$ExternalSyntheticLambda0(this, 1), 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.highlight = true;
            int i = Theme.key_windowBackgroundWhite;
            paint.setColor(Theme.getColor(null, i, false));
            paint2.setColor(Theme.getColor(null, i, false));
            paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), Theme.multAlpha(0.18f, -16777216));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(user);
            imageReceiver.setForUserOrChat(user, avatarDrawable);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
            imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document), "120_120", DocumentObject.getSvgThumb(document.thumbs, Theme.key_windowBackgroundGray, 0.35f), 0L, null, null, 0);
            this.text = new Text(UserObject.getUserName(user), 14.0f);
        }
    }
}
