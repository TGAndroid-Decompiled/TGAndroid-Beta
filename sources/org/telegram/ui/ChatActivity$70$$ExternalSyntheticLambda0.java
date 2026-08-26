package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.RLottieDrawable;

public final class ChatActivity$70$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final Object f$3;
    public final int f$4;
    public final int f$5;

    public ChatActivity$70$$ExternalSyntheticLambda0(MediaDataController mediaDataController, int i, TLObject tLObject, BaseFragment baseFragment, boolean z, int i2) {
        this.f$0 = mediaDataController;
        this.f$4 = i;
        this.f$2 = tLObject;
        this.f$3 = baseFragment;
        this.f$1 = z;
        this.f$5 = i2;
    }

    @Override
    public final void run() {
        Bulletin bulletin;
        int i;
        int i2;
        float f;
        int i3;
        boolean z = this.f$1;
        int i4 = this.f$5;
        int i5 = this.f$4;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = ChatActivity.this;
                if (z) {
                    MessagesController.getNotificationsSettings(((BaseFragment) chatActivity).currentAccount).edit().remove("pin_" + chatActivity.dialog_id).commit();
                    chatActivity.updatePinnedMessageView(0, true);
                    bulletin = null;
                } else {
                    bulletin = null;
                    chatActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(chatActivity.dialog_id), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i5), Boolean.valueOf(chatActivity.pinnedEndReached));
                }
                if (i4 == chatActivity.pinBullerinTag) {
                    chatActivity.pinBulletin = bulletin;
                }
                break;
            case 1:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f$4, (TLObject) obj2, (BaseFragment) obj, this.f$1, this.f$5);
                break;
            case 2:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.f$1, (TLRPC.Message) obj, this.f$4, (ArrayList) obj2, this.f$5);
                break;
            case 3:
                BlurringShader.ThumbBlurer thumbBlurer = (BlurringShader.ThumbBlurer) obj3;
                thumbBlurer.getClass();
                Bitmap bitmap = (Bitmap) obj2;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int iRound = (int) Math.round(Math.sqrt(width * 324.0f));
                    int iRound2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i5 == 90 || i5 == 270) {
                        i = iRound2;
                        i2 = iRound;
                    } else {
                        i2 = iRound2;
                        i = iRound;
                    }
                    int i6 = thumbBlurer.padding;
                    int i7 = i6 * 2;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7 + i, i7 + i2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i8 = i6 + iRound;
                    int i9 = i6 + iRound2;
                    Rect rect2 = new Rect(i6, i6, i8, i9);
                    float f2 = i6;
                    canvas.translate((i / 2.0f) + f2, (i2 / 2.0f) + f2);
                    if (i4 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                        f = f2;
                        i3 = i6;
                    } else {
                        f = f2;
                        i3 = i6;
                        if (i4 == 2) {
                            canvas.scale(1.0f, -1.0f);
                        }
                    }
                    canvas.rotate(i5);
                    float f3 = -i3;
                    canvas.translate(f3 - (iRound / 2.0f), f3 - (iRound2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                        break;
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(bitmapCreateBitmap, 6);
                    if (i3 > 0) {
                        float f4 = i8;
                        Paint paint = thumbBlurer.clearPaint;
                        canvas.drawRect(0.0f, 0.0f, f4, f, paint);
                        float f5 = f;
                        float f6 = i9;
                        canvas.drawRect(0.0f, f5, f5, f6, paint);
                        float f7 = i8 + i3;
                        canvas.drawRect(f4, f5, f7, f6, paint);
                        canvas.drawRect(0.0f, f6, f7, i9 + i3, paint);
                    }
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda488(thumbBlurer, (String) obj, bitmapCreateBitmap, this.f$1, bitmap, 12));
                    break;
                }
                break;
            default:
                final DefaultThemesPreviewCell.AnonymousClass2 anonymousClass2 = (DefaultThemesPreviewCell.AnonymousClass2) obj3;
                DefaultThemesPreviewCell defaultThemesPreviewCell = DefaultThemesPreviewCell.this;
                defaultThemesPreviewCell.updateDayNightMode();
                defaultThemesPreviewCell.updateSelectedPosition();
                int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false);
                RLottieDrawable rLottieDrawable = defaultThemesPreviewCell.darkThemeDrawable;
                rLottieDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new DefaultThemesPreviewCell.AnonymousClass2.AnonymousClass1(anonymousClass2, i5, color));
                valueAnimatorOfFloat.addListener(new ArticleViewer.AnonymousClass3(anonymousClass2, color, 10));
                valueAnimatorOfFloat.setDuration(350L);
                valueAnimatorOfFloat.start();
                final int color2 = Theme.getColor(null, Theme.key_windowBackgroundGray, false);
                Context context = (Context) obj2;
                final Activity activity = context instanceof Activity ? (Activity) context : null;
                if ((activity != null ? activity.getWindow() : null) != null) {
                    ValueAnimator valueAnimator = defaultThemesPreviewCell.navBarAnimator;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        defaultThemesPreviewCell.navBarAnimator.cancel();
                    }
                    ValueAnimator valueAnimator2 = defaultThemesPreviewCell.navBarAnimator;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i4 = defaultThemesPreviewCell.navBarColor;
                    }
                    final int i10 = i4;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    defaultThemesPreviewCell.navBarAnimator = valueAnimatorOfFloat2;
                    final float f8 = z ? 50.0f : 200.0f;
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            float fMax = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator3.getAnimatedValue()).floatValue() * 350.0f) - f8) / 150.0f));
                            AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                            DefaultThemesPreviewCell.this.navBarColor = ColorUtils.blendARGB(fMax, i10, color2);
                            int i11 = DefaultThemesPreviewCell.this.navBarColor;
                            Activity activity2 = activity;
                            AndroidUtilities.setNavigationBarColor(activity2, i11, false);
                            AndroidUtilities.setLightNavigationBar(activity2, AndroidUtilities.computePerceivedBrightness(DefaultThemesPreviewCell.this.navBarColor) >= 0.721f);
                        }
                    });
                    defaultThemesPreviewCell.navBarAnimator.addListener(new ArticleViewer.AnonymousClass3(activity, color2, 11));
                    defaultThemesPreviewCell.navBarAnimator.setDuration(350L);
                    defaultThemesPreviewCell.navBarAnimator.start();
                }
                boolean zIsCurrentThemeDay = Theme.isCurrentThemeDay();
                TextCell textCell = defaultThemesPreviewCell.dayNightCell;
                if (zIsCurrentThemeDay) {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SettingsSwitchToNightMode), (Drawable) rLottieDrawable, true);
                } else {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SettingsSwitchToDayMode), (Drawable) rLottieDrawable, true);
                }
                Theme.turnOffAutoNight((BaseFragment) obj);
                break;
        }
    }

    public ChatActivity$70$$ExternalSyntheticLambda0(SendMessagesHelper sendMessagesHelper, boolean z, TLRPC.Message message, int i, ArrayList arrayList, int i2) {
        this.f$0 = sendMessagesHelper;
        this.f$1 = z;
        this.f$3 = message;
        this.f$4 = i;
        this.f$2 = arrayList;
        this.f$5 = i2;
    }

    public ChatActivity$70$$ExternalSyntheticLambda0(ChatActivity.AnonymousClass70 anonymousClass70, boolean z, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.f$0 = anonymousClass70;
        this.f$1 = z;
        this.f$2 = arrayList;
        this.f$3 = arrayList2;
        this.f$4 = i;
        this.f$5 = i2;
    }

    public ChatActivity$70$$ExternalSyntheticLambda0(BlurringShader.ThumbBlurer thumbBlurer, Bitmap bitmap, int i, int i2, String str, boolean z) {
        this.f$0 = thumbBlurer;
        this.f$2 = bitmap;
        this.f$4 = i;
        this.f$5 = i2;
        this.f$3 = str;
        this.f$1 = z;
    }

    public ChatActivity$70$$ExternalSyntheticLambda0(DefaultThemesPreviewCell.AnonymousClass2 anonymousClass2, int i, Context context, int i2, boolean z, BaseFragment baseFragment) {
        this.f$0 = anonymousClass2;
        this.f$4 = i;
        this.f$2 = context;
        this.f$5 = i2;
        this.f$1 = z;
        this.f$3 = baseFragment;
    }
}
