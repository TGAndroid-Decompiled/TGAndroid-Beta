package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.zxing.qrcode.decoder.Version;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda189;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretVoicePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class AvatarConstructorFragment extends BaseFragment {
    public static final int[][] defaultColors = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] premiumColors = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public final Paint actionBarPaint;
    public CanvasButton avatarClickableArea;
    public final ImageUpdater.AvatarFor avatarFor;
    public BackgroundSelectView backgroundSelectView;
    public FrameLayout bottomBulletinContainer;
    public AnonymousClass11 bottomSheet;
    public ButtonWithCounterView button;
    public boolean buttonIsLocked;
    public CharSequence buttonText;
    public TextView chooseBackgroundHint;
    public TextView chooseEmojiHint;
    public int collapsedHeight;
    public BackgroundGradient colorPickerGradient;
    public boolean colorPickerInAnimatoin;
    public View colorPickerPreviewView;
    public ChatActivity$$ExternalSyntheticLambda189 delegate;
    public boolean drawForBlur;
    public ValueAnimator expandAnimator;
    public boolean expandWithKeyboard;
    public int expandedHeight;
    public boolean finishOnDone;
    public int gradientBackgroundItemWidth;
    public final ImageUpdater imageUpdater;
    public boolean isLandscapeMode;
    public boolean isLightInternal;
    public ValueAnimator keyboardVisibilityAnimator;
    public boolean keyboardVisible;
    public float keyboardVisibleProgress;
    public ValueAnimator lightProgressAnimator;
    public PhotoViewer.AnonymousClass35 linearLayout;
    public SpannableStringBuilder lockedButtonText;
    public ActionBar overlayActionBar;
    public AnonymousClass5 previewView;
    public float progressToExpand;
    public float progressToLightStatusBar;
    public AnonymousClass7 selectAnimatedEmojiDialog;
    public ActionBarMenuItem setPhotoItem;
    public boolean wasChanged;

    public final class AnonymousClass11 extends BottomSheet {
        public AnonymousClass11(Activity activity) {
            super(activity, null, true, false);
        }

        @Override
        public final void lambda$showGiftOfferSheet$15() {
            super.lambda$showGiftOfferSheet$15();
            AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
            avatarConstructorFragment.backgroundSelectView.selectGradient(avatarConstructorFragment.colorPickerGradient);
            avatarConstructorFragment.colorPickerInAnimatoin = true;
            avatarConstructorFragment.fragmentView.invalidate();
            avatarConstructorFragment.colorPickerPreviewView.animate().setListener(new CheckBox.AnonymousClass1(this, 9)).alpha(0.0f).setDuration(200L).start();
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
            AndroidUtilities.requestAdjustResize(avatarConstructorFragment.getParentActivity(), avatarConstructorFragment.getClassGuid());
            avatarConstructorFragment.bottomSheet = null;
        }
    }

    public final class AnonymousClass5 extends PreviewView {
        public final AnonymousClass4 val$nestedSizeNotifierLayout;

        public AnonymousClass5(AvatarConstructorFragment avatarConstructorFragment, Activity activity, AnonymousClass4 anonymousClass4) {
            super(activity);
            this.val$nestedSizeNotifierLayout = anonymousClass4;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            invalidate();
        }
    }

    public final class AnonymousClass9 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final AvatarConstructorFragment this$0;

        public AnonymousClass9(AvatarConstructorFragment avatarConstructorFragment, int i) {
            this.$r8$classId = i;
            this.this$0 = avatarConstructorFragment;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    AvatarConstructorFragment avatarConstructorFragment = this.this$0;
                    avatarConstructorFragment.setProgressToExpand(avatarConstructorFragment.expandWithKeyboard ? 1.0f : 0.0f, false);
                    avatarConstructorFragment.expandWithKeyboard = false;
                    break;
                default:
                    super.onAnimationEnd(animator);
                    this.this$0.colorPickerInAnimatoin = false;
                    break;
            }
        }
    }

    public final class BackgroundGradient {
        public int color1;
        public int color2;
        public int color3;
        public int color4;
        public boolean premium;
        public int stableId;

        public final BackgroundGradient copy() {
            BackgroundGradient backgroundGradient = new BackgroundGradient();
            backgroundGradient.color1 = this.color1;
            backgroundGradient.color2 = this.color2;
            backgroundGradient.color3 = this.color3;
            backgroundGradient.color4 = this.color4;
            backgroundGradient.premium = this.premium;
            return backgroundGradient;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BackgroundGradient)) {
                return false;
            }
            BackgroundGradient backgroundGradient = (BackgroundGradient) obj;
            return this.color1 == backgroundGradient.color1 && this.color2 == backgroundGradient.color2 && this.color3 == backgroundGradient.color3 && this.color4 == backgroundGradient.color4;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.stableId), Integer.valueOf(this.color1), Integer.valueOf(this.color2), Integer.valueOf(this.color3), Integer.valueOf(this.color4));
        }
    }

    public final class BackgroundSelectView extends RecyclerListView {
        public final AppIconsSelectorCell.AnonymousClass1 adapter;
        public BackgroundGradient customSelectedGradient;
        public final ArrayList gradients;
        public int selectedItemId;
        public final int stableIdPointer;

        public BackgroundSelectView(Activity activity) {
            super(activity, null);
            this.gradients = new ArrayList();
            this.stableIdPointer = 200;
            this.selectedItemId = -1;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            linearLayoutManager.setOrientation(0);
            setLayoutManager(linearLayoutManager);
            int i = 0;
            while (true) {
                int[][] iArr = AvatarConstructorFragment.defaultColors;
                if (i >= 7) {
                    break;
                }
                BackgroundGradient backgroundGradient = new BackgroundGradient();
                int i2 = this.stableIdPointer;
                this.stableIdPointer = i2 + 1;
                backgroundGradient.stableId = i2;
                int[] iArr2 = iArr[i];
                backgroundGradient.color1 = iArr2[0];
                backgroundGradient.color2 = iArr2[1];
                backgroundGradient.color3 = iArr2[2];
                backgroundGradient.color4 = iArr2[3];
                this.gradients.add(backgroundGradient);
                i++;
            }
            int i3 = 0;
            while (true) {
                int[][] iArr3 = AvatarConstructorFragment.premiumColors;
                if (i3 >= 30) {
                    setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    setClipToPadding(false);
                    this.useLayoutPositionOnClick = true;
                    setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 11));
                    AppIconsSelectorCell.AnonymousClass1 anonymousClass1 = new AppIconsSelectorCell.AnonymousClass1(this, 2);
                    this.adapter = anonymousClass1;
                    setAdapter(anonymousClass1);
                    setOverScrollMode(1);
                    return;
                }
                BackgroundGradient backgroundGradient2 = new BackgroundGradient();
                int i4 = this.stableIdPointer;
                this.stableIdPointer = i4 + 1;
                backgroundGradient2.stableId = i4;
                int[] iArr4 = iArr3[i3];
                backgroundGradient2.color1 = iArr4[0];
                backgroundGradient2.color2 = iArr4[1];
                backgroundGradient2.color3 = 0;
                backgroundGradient2.color4 = 0;
                backgroundGradient2.premium = true;
                this.gradients.add(backgroundGradient2);
                i3++;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i) / this.adapter.getItemCount();
            AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
            avatarConstructorFragment.gradientBackgroundItemWidth = size;
            if (size < AndroidUtilities.dp(39.0f)) {
                avatarConstructorFragment.gradientBackgroundItemWidth = AndroidUtilities.dp(39.0f);
            } else if (avatarConstructorFragment.gradientBackgroundItemWidth > AndroidUtilities.dp(150.0f)) {
                avatarConstructorFragment.gradientBackgroundItemWidth = AndroidUtilities.dp(48.0f);
            }
            super.onMeasure(i, i2);
        }

        public final void selectGradient(BackgroundGradient backgroundGradient) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.gradients;
                if (i >= arrayList.size()) {
                    this.customSelectedGradient = backgroundGradient;
                    this.selectedItemId = 1;
                    break;
                } else {
                    if (((BackgroundGradient) arrayList.get(i)).equals(backgroundGradient)) {
                        this.selectedItemId = ((BackgroundGradient) arrayList.get(i)).stableId;
                        break;
                    }
                    i++;
                }
            }
            this.adapter.mObservable.notifyChanged();
        }
    }

    public abstract class ContainerLayout extends SizeNotifierFrameLayout {
        public final Version.ECB nestedScrollingParentHelper;

        public ContainerLayout(Context context) {
            super(context, null);
            this.nestedScrollingParentHelper = new Version.ECB();
        }

        @Override
        public final int getNestedScrollAxes() {
            Version.ECB ecb = this.nestedScrollingParentHelper;
            return ecb.dataCodewords | ecb.count;
        }

        @Override
        public final boolean onNestedFling(View view, float f, float f2, boolean z) {
            return false;
        }

        @Override
        public final boolean onNestedPreFling(View view, float f, float f2) {
            return false;
        }

        @Override
        public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
            AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
            if (avatarConstructorFragment.keyboardVisibleProgress > 0.0f || avatarConstructorFragment.isLandscapeMode || i2 <= 0 || avatarConstructorFragment.progressToExpand <= 0.0f) {
                return;
            }
            avatarConstructorFragment.cancelExpandAnimator();
            avatarConstructorFragment.setProgressToExpand(Utilities.clamp(avatarConstructorFragment.progressToExpand - (i2 / avatarConstructorFragment.expandedHeight), 1.0f, 0.0f), true);
            iArr[1] = i2;
        }

        @Override
        public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
            AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
            if (avatarConstructorFragment.keyboardVisibleProgress > 0.0f || avatarConstructorFragment.isLandscapeMode || i4 == 0) {
                return;
            }
            avatarConstructorFragment.cancelExpandAnimator();
            avatarConstructorFragment.setProgressToExpand(Utilities.clamp(avatarConstructorFragment.progressToExpand - (i4 / avatarConstructorFragment.expandedHeight), 1.0f, 0.0f), true);
        }

        @Override
        public final void onNestedScrollAccepted(View view, View view2, int i) {
            this.nestedScrollingParentHelper.count = i;
            AvatarConstructorFragment.this.cancelExpandAnimator();
        }

        @Override
        public final boolean onStartNestedScroll(View view, View view2, int i) {
            AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
            return avatarConstructorFragment.keyboardVisibleProgress <= 0.0f && !avatarConstructorFragment.isLandscapeMode;
        }

        @Override
        public final void onStopNestedScroll(View view) {
            this.nestedScrollingParentHelper.count = 0;
            AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
            avatarConstructorFragment.setExpanded(avatarConstructorFragment.progressToExpand > 0.5f, false, false);
        }
    }

    public final class GradientSelectorView extends View {
        public Drawable addIcon;
        public BackgroundGradient backgroundGradient;
        public Paint defaultPaint;
        public final GradientTools gradientTools;
        public boolean isCustom;
        public boolean isLocked;
        public Drawable lockIcon;
        public boolean lockIconIsEmptyCustom;
        public Paint optionsPaint;
        public final AnimatedFloat progressToSelect;
        public boolean selected;

        public GradientSelectorView(Context context) {
            super(context);
            AnimatedFloat animatedFloat = new AnimatedFloat(400L, AndroidUtilities.overshootInterpolator);
            this.progressToSelect = animatedFloat;
            this.gradientTools = new GradientTools();
            animatedFloat.parent = this;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Paint paint;
            super.onDraw(canvas);
            float f = this.selected ? 1.0f : 0.0f;
            AnimatedFloat animatedFloat = this.progressToSelect;
            animatedFloat.set(f, false);
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            BackgroundGradient backgroundGradient = this.backgroundGradient;
            if (backgroundGradient != null) {
                GradientTools gradientTools = this.gradientTools;
                gradientTools.setColors(backgroundGradient.color1, backgroundGradient.color2, backgroundGradient.color3, backgroundGradient.color4);
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                gradientTools.setBounds(rectF);
                paint = gradientTools.paint;
            } else {
                if (this.defaultPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.defaultPaint = paint2;
                    paint2.setColor(Theme.getColor(null, Theme.key_chat_emojiPanelBackground, false));
                }
                paint = this.defaultPaint;
            }
            if (animatedFloat.value == 0.0f) {
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(15.0f), paint);
            } else {
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dpf2(13.5f), paint);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(measuredWidth, measuredHeight, DiffUtil.m(1.0f, animatedFloat.value, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f)), paint);
            }
            if (this.isLocked) {
                if (this.lockIcon != null) {
                    if (this.lockIconIsEmptyCustom != (this.isCustom && this.backgroundGradient == null)) {
                        this.lockIcon = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                        boolean z = !this.isCustom && this.backgroundGradient == null;
                        this.lockIconIsEmptyCustom = z;
                        this.lockIcon.setColorFilter(new PorterDuffColorFilter(z ? Theme.getColor(null, Theme.key_chat_emojiSearchIcon, false) : -1, PorterDuff.Mode.SRC_IN));
                    }
                } else {
                    this.lockIcon = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    if (this.isCustom) {
                    }
                    this.lockIconIsEmptyCustom = z;
                    this.lockIcon.setColorFilter(new PorterDuffColorFilter(z ? Theme.getColor(null, Theme.key_chat_emojiSearchIcon, false) : -1, PorterDuff.Mode.SRC_IN));
                }
                Drawable drawable = this.lockIcon;
                drawable.setBounds((int) (measuredWidth - (drawable.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.lockIcon.getIntrinsicHeight() / 2.0f)), (int) ((this.lockIcon.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.lockIcon.getIntrinsicHeight() / 2.0f) + measuredHeight));
                float fLerp = AndroidUtilities.lerp(1.05f, 0.92f, animatedFloat.value);
                canvas.save();
                canvas.scale(fLerp, fLerp, measuredWidth, measuredHeight);
                this.lockIcon.draw(canvas);
                canvas.restore();
                return;
            }
            if (this.isCustom) {
                if (this.backgroundGradient == null) {
                    if (this.addIcon == null) {
                        Drawable drawable2 = getContext().getDrawable(R.drawable.msg_filled_plus);
                        this.addIcon = drawable2;
                        drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_emojiSearchIcon, false), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = this.addIcon;
                    drawable3.setBounds((int) (measuredWidth - (drawable3.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.addIcon.getIntrinsicHeight() / 2.0f)), (int) ((this.addIcon.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.addIcon.getIntrinsicHeight() / 2.0f) + measuredHeight));
                    this.addIcon.draw(canvas);
                    return;
                }
                if (this.optionsPaint == null) {
                    Paint paint3 = new Paint(1);
                    this.optionsPaint = paint3;
                    paint3.setColor(-1);
                }
                this.optionsPaint.setAlpha(Math.round(Utilities.clamp(animatedFloat.value, 1.0f, 0.0f) * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(1.5f), this.optionsPaint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(5.0f) * animatedFloat.value), measuredHeight, AndroidUtilities.dp(1.5f), this.optionsPaint);
                canvas.drawCircle((AndroidUtilities.dp(5.0f) * animatedFloat.value) + measuredWidth, measuredHeight, AndroidUtilities.dp(1.5f), this.optionsPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AvatarConstructorFragment.this.gradientBackgroundItemWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }
    }

    public abstract class PreviewView extends FrameLayout {
        public BackgroundGradient backgroundGradient;
        public final UserCell.AnonymousClass2 backupImageView;
        public float changeBackgroundProgress;
        public final PorterDuffColorFilter colorFilter;
        public float cx;
        public float cy;
        public TLRPC.Document document;
        public long documentId;
        public final AnimatedFloat expandProgress;
        public boolean expanded;
        public final GradientTools gradientTools;
        public boolean isCustomGradient;
        public final GradientTools outGradientTools;
        public float overrideExpandProgress;
        public float size;

        public PreviewView(Activity activity) {
            super(activity);
            this.gradientTools = new GradientTools();
            this.outGradientTools = new GradientTools();
            this.changeBackgroundProgress = 1.0f;
            this.colorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.expandProgress = new AnimatedFloat(200L, this, CubicBezierInterpolator.EASE_OUT);
            this.overrideExpandProgress = -1.0f;
            UserCell.AnonymousClass2 anonymousClass2 = new UserCell.AnonymousClass2(this, activity, 6);
            this.backupImageView = anonymousClass2;
            anonymousClass2.getImageReceiver().setAutoRepeatCount(1);
            anonymousClass2.getImageReceiver().setAspectFit(true);
            setClipChildren(false);
            addView(anonymousClass2, LayoutHelper.createFrame(70, 70, 17));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            PreviewView previewView;
            Canvas canvas2;
            int iDp;
            float fLerp;
            UserCell.AnonymousClass2 anonymousClass2;
            AnimatedEmojiDrawable animatedEmojiDrawable;
            PhotoViewer.AnonymousClass11 anonymousClass11;
            this.cx = getMeasuredWidth() / 2.0f;
            this.cy = getMeasuredHeight() / 2.0f;
            AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
            float measuredWidth = avatarConstructorFragment.isLandscapeMode ? getMeasuredWidth() * 0.3f : AndroidUtilities.dp(50.0f);
            float f = this.expanded ? 1.0f : 0.0f;
            AnimatedFloat animatedFloat = this.expandProgress;
            animatedFloat.set(f, false);
            float f2 = this.overrideExpandProgress;
            if (f2 >= 0.0f) {
                animatedFloat.set(f2, true);
            }
            float fLerp2 = AndroidUtilities.lerp(measuredWidth, getMeasuredWidth() / 2.0f, animatedFloat.value);
            this.size = fLerp2;
            this.size = AndroidUtilities.lerp(fLerp2, AndroidUtilities.dp(21.0f), avatarConstructorFragment.keyboardVisibleProgress);
            this.cx = AndroidUtilities.lerp(this.cx, (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(21.0f), avatarConstructorFragment.keyboardVisibleProgress);
            canvas.save();
            int i = avatarConstructorFragment.expandedHeight - avatarConstructorFragment.collapsedHeight;
            canvas.clipRect(0.0f, (-i) / 2.0f, getMeasuredWidth(), ((i / 2.0f) * avatarConstructorFragment.progressToExpand) + getMeasuredHeight());
            BackgroundGradient backgroundGradient = this.backgroundGradient;
            if (backgroundGradient != null) {
                GradientTools gradientTools = this.gradientTools;
                gradientTools.setColors(backgroundGradient.color1, backgroundGradient.color2, backgroundGradient.color3, backgroundGradient.color4);
                float f3 = this.cx;
                float f4 = this.size;
                float f5 = f3 - f4;
                float f6 = this.cy;
                float f7 = f6 - f4;
                float f8 = f3 + f4;
                float f9 = f6 + f4;
                gradientTools.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f5, f7, f8, f9);
                gradientTools.setBounds(rectF);
                if (this.changeBackgroundProgress != 1.0f) {
                    GradientTools gradientTools2 = this.outGradientTools;
                    float f10 = this.cx;
                    float f11 = this.size;
                    float f12 = this.cy;
                    gradientTools2.getClass();
                    rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
                    gradientTools2.setBounds(rectF);
                    gradientTools2.paint.setAlpha(255);
                    previewView = this;
                    previewView.drawBackround(canvas, this.cx, this.cy, measuredWidth, this.size, gradientTools2.paint);
                    gradientTools.paint.setAlpha((int) (previewView.changeBackgroundProgress * 255.0f));
                    previewView.drawBackround(canvas, previewView.cx, previewView.cy, measuredWidth, previewView.size, gradientTools.paint);
                    float f13 = previewView.changeBackgroundProgress + 0.064f;
                    previewView.changeBackgroundProgress = f13;
                    if (f13 > 1.0f) {
                        canvas = canvas;
                        previewView.changeBackgroundProgress = 1.0f;
                    }
                    canvas = canvas;
                    invalidate();
                } else {
                    previewView = this;
                    gradientTools.paint.setAlpha(255);
                    canvas2 = canvas;
                    previewView.drawBackround(canvas2, previewView.cx, previewView.cy, measuredWidth, previewView.size, gradientTools.paint);
                }
                if (avatarConstructorFragment.isLandscapeMode) {
                    iDp = (int) (measuredWidth * 2.0f * 0.7f);
                } else {
                    iDp = AndroidUtilities.dp(70.0f);
                }
                fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(iDp, (int) (getMeasuredWidth() * 0.7f), animatedFloat.value), (int) (AndroidUtilities.dp(42.0f) * 0.7f), avatarConstructorFragment.keyboardVisibleProgress) / 2.0f;
                anonymousClass2 = previewView.backupImageView;
                animatedEmojiDrawable = anonymousClass2.animatedEmojiDrawable;
                if (animatedEmojiDrawable != null) {
                    ImageReceiver imageReceiver = anonymousClass2.imageReceiver;
                    float f14 = previewView.cx - fLerp;
                    float f15 = previewView.cy - fLerp;
                    float f16 = fLerp * 2.0f;
                    imageReceiver.setImageCoords(f14, f15, f16, f16);
                    anonymousClass2.imageReceiver.setRoundRadius((int) (f16 * 0.13f));
                    anonymousClass2.imageReceiver.draw(canvas2);
                    return;
                }
                anonymousClass11 = animatedEmojiDrawable.imageReceiver;
                if (anonymousClass11 != null) {
                    anonymousClass11.setRoundRadius((int) (2.0f * fLerp * 0.13f));
                }
                AnimatedEmojiDrawable animatedEmojiDrawable2 = anonymousClass2.animatedEmojiDrawable;
                float f17 = previewView.cx;
                float f18 = previewView.cy;
                animatedEmojiDrawable2.setBounds((int) (f17 - fLerp), (int) (f18 - fLerp), (int) (f17 + fLerp), (int) (f18 + fLerp));
                anonymousClass2.animatedEmojiDrawable.setColorFilter(previewView.colorFilter);
                anonymousClass2.animatedEmojiDrawable.draw(canvas2);
            }
            previewView = this;
            canvas2 = canvas;
            if (avatarConstructorFragment.isLandscapeMode) {
                iDp = (int) (measuredWidth * 2.0f * 0.7f);
            } else {
                iDp = AndroidUtilities.dp(70.0f);
            }
            fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(iDp, (int) (getMeasuredWidth() * 0.7f), animatedFloat.value), (int) (AndroidUtilities.dp(42.0f) * 0.7f), avatarConstructorFragment.keyboardVisibleProgress) / 2.0f;
            anonymousClass2 = previewView.backupImageView;
            animatedEmojiDrawable = anonymousClass2.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                ImageReceiver imageReceiver2 = anonymousClass2.imageReceiver;
                float f19 = previewView.cx - fLerp;
                float f110 = previewView.cy - fLerp;
                float f111 = fLerp * 2.0f;
                imageReceiver2.setImageCoords(f19, f110, f111, f111);
                anonymousClass2.imageReceiver.setRoundRadius((int) (f111 * 0.13f));
                anonymousClass2.imageReceiver.draw(canvas2);
                return;
            }
            anonymousClass11 = animatedEmojiDrawable.imageReceiver;
            if (anonymousClass11 != null) {
                anonymousClass11.setRoundRadius((int) (2.0f * fLerp * 0.13f));
            }
            AnimatedEmojiDrawable animatedEmojiDrawable3 = anonymousClass2.animatedEmojiDrawable;
            float f112 = previewView.cx;
            float f113 = previewView.cy;
            animatedEmojiDrawable3.setBounds((int) (f112 - fLerp), (int) (f113 - fLerp), (int) (f112 + fLerp), (int) (f113 + fLerp));
            anonymousClass2.animatedEmojiDrawable.setColorFilter(previewView.colorFilter);
            anonymousClass2.animatedEmojiDrawable.draw(canvas2);
        }

        public final void drawBackround(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
            float f5 = this.expandProgress.value;
            if (f5 == 0.0f) {
                canvas.drawCircle(f, f2, f4, paint);
                return;
            }
            float fLerp = AndroidUtilities.lerp(f3, 0.0f, f5);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f - f4, f2 - f4, f + f4, f2 + f4);
            canvas.drawRoundRect(rectF, fLerp, fLerp, paint);
        }

        public long getDuration() {
            UserCell.AnonymousClass2 anonymousClass2 = this.backupImageView;
            ImageReceiver imageReceiver = anonymousClass2.getImageReceiver();
            AnimatedEmojiDrawable animatedEmojiDrawable = anonymousClass2.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                imageReceiver = animatedEmojiDrawable.imageReceiver;
            }
            if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
                return 5000L;
            }
            return imageReceiver.getLottieAnimation().getDuration();
        }

        public ImageReceiver getImageReceiver() {
            UserCell.AnonymousClass2 anonymousClass2 = this.backupImageView;
            ImageReceiver imageReceiver = anonymousClass2.getImageReceiver();
            AnimatedEmojiDrawable animatedEmojiDrawable = anonymousClass2.animatedEmojiDrawable;
            if (animatedEmojiDrawable == null) {
                return imageReceiver;
            }
            PhotoViewer.AnonymousClass11 anonymousClass11 = animatedEmojiDrawable.imageReceiver;
            animatedEmojiDrawable.setColorFilter(this.colorFilter);
            return anonymousClass11;
        }

        @Override
        public void invalidate() {
            super.invalidate();
            AvatarConstructorFragment.this.fragmentView.invalidate();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            if (AvatarConstructorFragment.this.isLandscapeMode) {
                super.onMeasure(i, i2);
            } else {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
            }
        }

        public void setExpanded(boolean z) {
            PhotoViewer.AnonymousClass11 anonymousClass11;
            if (this.expanded == z) {
                return;
            }
            this.expanded = z;
            if (z) {
                UserCell.AnonymousClass2 anonymousClass2 = this.backupImageView;
                AnimatedEmojiDrawable animatedEmojiDrawable = anonymousClass2.animatedEmojiDrawable;
                if (animatedEmojiDrawable != null && (anonymousClass11 = animatedEmojiDrawable.imageReceiver) != null) {
                    anonymousClass11.startAnimation();
                }
                anonymousClass2.imageReceiver.startAnimation();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            invalidate();
        }

        public final void setGradient(BackgroundGradient backgroundGradient, boolean z) {
            BackgroundGradient backgroundGradient2 = this.backgroundGradient;
            if (backgroundGradient2 != null) {
                this.outGradientTools.setColors(backgroundGradient2.color1, backgroundGradient2.color2, backgroundGradient2.color3, backgroundGradient2.color4);
                this.changeBackgroundProgress = 0.0f;
                AvatarConstructorFragment.this.wasChanged = true;
            }
            this.backgroundGradient = backgroundGradient;
            this.isCustomGradient = z;
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            invalidate();
        }
    }

    public AvatarConstructorFragment(ImageUpdater imageUpdater, ImageUpdater.AvatarFor avatarFor) {
        super(null);
        this.actionBarPaint = new Paint();
        this.finishOnDone = true;
        this.isLightInternal = false;
        this.progressToLightStatusBar = 0.0f;
        this.imageUpdater = imageUpdater;
        this.avatarFor = avatarFor;
    }

    public final void cancelExpandAnimator() {
        ValueAnimator valueAnimator = this.expandAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.expandAnimator.cancel();
            this.expandAnimator = null;
        }
    }

    @Override
    public final View createView(Context context) {
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setTitleColor(Theme.getColor(null, i, false));
        this.actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_listSelector, false), false);
        zzkt.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        final int i2 = 0;
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick(this) {
            public final AvatarConstructorFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onItemClick(int i3) {
                switch (i2) {
                    case 0:
                        if (i3 == -1) {
                            this.this$0.discardEditor();
                        }
                        break;
                    default:
                        AvatarConstructorFragment avatarConstructorFragment = this.this$0;
                        if (i3 == -1) {
                            avatarConstructorFragment.discardEditor();
                        }
                        if (i3 == 1) {
                            avatarConstructorFragment.onDonePressed$1();
                        }
                        break;
                }
            }
        });
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        ActionBar actionBar2 = new ActionBar(getParentActivity(), null);
        this.overlayActionBar = actionBar2;
        actionBar2.setCastShadows(false);
        this.overlayActionBar.setAddToContainer(false);
        this.overlayActionBar.setOccupyStatusBar(true);
        this.overlayActionBar.setClipChildren(false);
        int alphaComponent = ColorUtils.setAlphaComponent(-1, 60);
        this.overlayActionBar.setItemsColor(-1, false);
        zzkt.m(this.overlayActionBar);
        this.overlayActionBar.setAllowOverlayTitle(false);
        this.overlayActionBar.setItemsBackgroundColor(alphaComponent, false);
        ActionBarMenu actionBarMenuCreateMenu = this.overlayActionBar.createMenu();
        actionBarMenuCreateMenu.setClipChildren(false);
        ImageUpdater.AvatarFor avatarFor = this.avatarFor;
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(1, (avatarFor == null || avatarFor.type != 2) ? LocaleController.getString(R.string.SetPhoto) : LocaleController.getString(R.string.SuggestPhoto));
        this.setPhotoItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setBackground(Theme.createSelectorDrawable(alphaComponent, 3, -1));
        final int i3 = 1;
        this.overlayActionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick(this) {
            public final AvatarConstructorFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onItemClick(int i4) {
                switch (i3) {
                    case 0:
                        if (i4 == -1) {
                            this.this$0.discardEditor();
                        }
                        break;
                    default:
                        AvatarConstructorFragment avatarConstructorFragment = this.this$0;
                        if (i4 == -1) {
                            avatarConstructorFragment.discardEditor();
                        }
                        if (i4 == 1) {
                            avatarConstructorFragment.onDonePressed$1();
                        }
                        break;
                }
            }
        });
        this.linearLayout = new PhotoViewer.AnonymousClass35(this, getParentActivity(), 3);
        ?? r7 = new ContainerLayout(context) {
            public boolean isScrolling;
            public boolean maybeScroll;
            public float scrollFromY;
            public float startFromProgressToExpand;

            @Override
            public final void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                int iSave = canvas.save();
                super.dispatchDraw(canvas);
                AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
                if (!avatarConstructorFragment.isLandscapeMode) {
                    if (!avatarConstructorFragment.drawForBlur) {
                        canvas.save();
                        float x = avatarConstructorFragment.previewView.getX() + avatarConstructorFragment.linearLayout.getX();
                        float y = avatarConstructorFragment.previewView.getY() + avatarConstructorFragment.linearLayout.getY();
                        int i4 = avatarConstructorFragment.expandedHeight - avatarConstructorFragment.collapsedHeight;
                        float fLerp = AndroidUtilities.lerp(y, AndroidUtilities.statusBarHeight + ((ActionBar.getCurrentActionBarHeight() - avatarConstructorFragment.collapsedHeight) >> 1), avatarConstructorFragment.keyboardVisibleProgress);
                        canvas.translate(x, fLerp);
                        avatarConstructorFragment.previewView.draw(canvas);
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f = i4 / 2.0f;
                        rectF.set(x, fLerp - (avatarConstructorFragment.progressToExpand * f), avatarConstructorFragment.previewView.getMeasuredWidth() + x, (f * avatarConstructorFragment.progressToExpand) + avatarConstructorFragment.previewView.getMeasuredHeight() + fLerp);
                        AnonymousClass5 anonymousClass5 = avatarConstructorFragment.previewView;
                        float f2 = x + anonymousClass5.cx;
                        float f3 = fLerp + anonymousClass5.cy;
                        CanvasButton canvasButton = avatarConstructorFragment.avatarClickableArea;
                        float f4 = anonymousClass5.size;
                        canvasButton.getClass();
                        rectF.set((int) (f2 - f4), (int) (f3 - f4), (int) (f2 + f4), (int) (f3 + f4));
                        canvasButton.pathCreated = false;
                        canvasButton.usingRectCount = 0;
                        canvasButton.addRect(rectF);
                        canvas.restore();
                    }
                    canvas.restoreToCount(iSave);
                    float alpha = (1.0f - (avatarConstructorFragment.colorPickerPreviewView.getVisibility() == 0 ? avatarConstructorFragment.colorPickerPreviewView.getAlpha() : 0.0f)) * avatarConstructorFragment.previewView.expandProgress.value;
                    if (alpha != 0.0f) {
                        avatarConstructorFragment.overlayActionBar.setVisibility(0);
                        int iSave2 = canvas.save();
                        canvas.translate(avatarConstructorFragment.overlayActionBar.getX(), avatarConstructorFragment.overlayActionBar.getY());
                        if (alpha != 1.0f) {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, avatarConstructorFragment.overlayActionBar.getMeasuredWidth(), avatarConstructorFragment.overlayActionBar.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                        } else {
                            canvas2 = canvas;
                        }
                        avatarConstructorFragment.overlayActionBar.draw(canvas2);
                        canvas2.restoreToCount(iSave2);
                    } else {
                        avatarConstructorFragment.overlayActionBar.setVisibility(8);
                    }
                }
                if (avatarConstructorFragment.colorPickerInAnimatoin) {
                    invalidate();
                }
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                Canvas canvas2;
                AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
                if (view == avatarConstructorFragment.overlayActionBar) {
                    return true;
                }
                if (view != ((BaseFragment) avatarConstructorFragment).actionBar || avatarConstructorFragment.keyboardVisibleProgress <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    Paint paint = avatarConstructorFragment.actionBarPaint;
                    paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    paint.setAlpha((int) (avatarConstructorFragment.keyboardVisibleProgress * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                    ((ActionBarLayout) avatarConstructorFragment.getParentLayout()).drawHeaderShadow(canvas2, (int) (avatarConstructorFragment.keyboardVisibleProgress * 255.0f), view.getMeasuredHeight());
                }
                return super.drawChild(canvas2, view, j);
            }

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (AvatarConstructorFragment.this.keyboardVisibleProgress == 0.0f) {
                    return false;
                }
                return onTouchEvent(motionEvent);
            }

            @Override
            public final void onMeasure(int i4, int i5) {
                measureKeyboardHeight();
                int i6 = 0;
                boolean z = View.MeasureSpec.getSize(i4) > View.MeasureSpec.getSize(i5) + this.keyboardHeight;
                final AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
                final float translationY = 0.0f;
                if (z != avatarConstructorFragment.isLandscapeMode) {
                    avatarConstructorFragment.isLandscapeMode = z;
                    AndroidUtilities.removeFromParent(avatarConstructorFragment.previewView);
                    AndroidUtilities.requestAdjustNothing(avatarConstructorFragment.getParentActivity(), avatarConstructorFragment.getClassGuid());
                    if (avatarConstructorFragment.isLandscapeMode) {
                        avatarConstructorFragment.setProgressToExpand(0.0f, false);
                        avatarConstructorFragment.previewView.setExpanded(false);
                        addView(avatarConstructorFragment.previewView, 0, LayoutHelper.createFrame(-1.0f, -1));
                    } else {
                        avatarConstructorFragment.linearLayout.addView(avatarConstructorFragment.previewView, 0, LayoutHelper.createFrame(-2.0f, -1));
                    }
                    AndroidUtilities.requestAdjustResize(avatarConstructorFragment.getParentActivity(), avatarConstructorFragment.getClassGuid());
                }
                if (avatarConstructorFragment.isLandscapeMode) {
                    int size = (int) (View.MeasureSpec.getSize(i4) * 0.45f);
                    int size2 = (int) (View.MeasureSpec.getSize(i4) * 0.55f);
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.linearLayout.getLayoutParams()).bottomMargin = 0;
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.linearLayout.getLayoutParams()).leftMargin = size;
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.previewView.getLayoutParams()).rightMargin = size2;
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.button.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size2;
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.chooseBackgroundHint.getLayoutParams()).topMargin = 0;
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.chooseEmojiHint.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
                } else {
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.linearLayout.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.linearLayout.getLayoutParams()).leftMargin = 0;
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.previewView.getLayoutParams()).rightMargin = 0;
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.button.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.chooseBackgroundHint.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.chooseEmojiHint.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
                }
                boolean z2 = avatarConstructorFragment.keyboardVisible;
                boolean z3 = this.keyboardHeight >= AndroidUtilities.dp(20.0f);
                avatarConstructorFragment.keyboardVisible = z3;
                if (z2 != z3) {
                    super.onMeasure(i4, i5);
                    int iDp = avatarConstructorFragment.keyboardVisible ? AndroidUtilities.dp(8.0f) + ((BaseFragment) avatarConstructorFragment).actionBar.getMeasuredHeight() + (-avatarConstructorFragment.selectAnimatedEmojiDialog.getTop()) : 0;
                    PhotoViewer.AnonymousClass35 anonymousClass35 = avatarConstructorFragment.linearLayout;
                    anonymousClass35.setTranslationY((anonymousClass35.getTranslationY() + ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.linearLayout.getLayoutParams()).topMargin) - iDp);
                    ((ViewGroup.MarginLayoutParams) avatarConstructorFragment.linearLayout.getLayoutParams()).topMargin = iDp;
                    final boolean z4 = avatarConstructorFragment.keyboardVisible;
                    if (!avatarConstructorFragment.isLandscapeMode) {
                        avatarConstructorFragment.keyboardVisibilityAnimator = ValueAnimator.ofFloat(avatarConstructorFragment.keyboardVisibleProgress, z4 ? 1.0f : 0.0f);
                        final float translationY2 = ((avatarConstructorFragment.expandedHeight - avatarConstructorFragment.collapsedHeight) - AndroidUtilities.statusBarHeight) * avatarConstructorFragment.progressToExpand;
                        if (z4) {
                            avatarConstructorFragment.previewView.setExpanded(false);
                            translationY2 = avatarConstructorFragment.linearLayout.getTranslationY();
                        } else {
                            translationY = avatarConstructorFragment.linearLayout.getTranslationY();
                        }
                        if (!avatarConstructorFragment.expandWithKeyboard || z4) {
                            avatarConstructorFragment.expandWithKeyboard = false;
                        } else {
                            avatarConstructorFragment.previewView.setExpanded(true);
                        }
                        avatarConstructorFragment.keyboardVisibilityAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                AvatarConstructorFragment avatarConstructorFragment2 = AvatarConstructorFragment.this;
                                avatarConstructorFragment2.keyboardVisibleProgress = fFloatValue;
                                float fLerp = AndroidUtilities.lerp(translationY2, translationY, fFloatValue);
                                ((BaseFragment) avatarConstructorFragment2).actionBar.getTitleTextView().setAlpha(avatarConstructorFragment2.keyboardVisibleProgress);
                                if (avatarConstructorFragment2.expandWithKeyboard && !z4) {
                                    avatarConstructorFragment2.setProgressToExpand(1.0f - avatarConstructorFragment2.keyboardVisibleProgress, false);
                                }
                                avatarConstructorFragment2.linearLayout.setTranslationY(fLerp);
                                avatarConstructorFragment2.button.setTranslationY(fLerp);
                                avatarConstructorFragment2.fragmentView.invalidate();
                                ((BaseFragment) avatarConstructorFragment2).actionBar.invalidate();
                            }
                        });
                        avatarConstructorFragment.keyboardVisibilityAnimator.addListener(new AnonymousClass9(avatarConstructorFragment, i6));
                        avatarConstructorFragment.keyboardVisibilityAnimator.setDuration(250L);
                        avatarConstructorFragment.keyboardVisibilityAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                        avatarConstructorFragment.keyboardVisibilityAnimator.start();
                    }
                }
                super.onMeasure(i4, i5);
                avatarConstructorFragment.collapsedHeight = avatarConstructorFragment.previewView.getMeasuredHeight();
                avatarConstructorFragment.expandedHeight = avatarConstructorFragment.previewView.getMeasuredWidth();
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                boolean z;
                AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
                if (!avatarConstructorFragment.avatarClickableArea.checkTouchEvent(motionEvent)) {
                    if (!avatarConstructorFragment.isLandscapeMode) {
                        if (motionEvent.getAction() == 0) {
                            AnonymousClass7 anonymousClass7 = avatarConstructorFragment.selectAnimatedEmojiDialog;
                            Rect rect = AndroidUtilities.rectTmp2;
                            anonymousClass7.getHitRect(rect);
                            rect.offset(0, (int) avatarConstructorFragment.linearLayout.getY());
                            if (avatarConstructorFragment.keyboardVisibleProgress == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                this.maybeScroll = true;
                                motionEvent.getX();
                                this.scrollFromY = motionEvent.getY();
                            }
                        } else if (motionEvent.getAction() == 2 && ((z = this.maybeScroll) || this.isScrolling)) {
                            if (!z) {
                                avatarConstructorFragment.setProgressToExpand(Utilities.clamp(((-(this.scrollFromY - motionEvent.getY())) / avatarConstructorFragment.expandedHeight) + this.startFromProgressToExpand, 1.0f, 0.0f), true);
                            } else if (Math.abs(this.scrollFromY - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                                this.maybeScroll = false;
                                this.isScrolling = true;
                                this.startFromProgressToExpand = avatarConstructorFragment.progressToExpand;
                                motionEvent.getX();
                                this.scrollFromY = motionEvent.getY();
                            }
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            if (this.isScrolling) {
                                avatarConstructorFragment.setExpanded(avatarConstructorFragment.progressToExpand > 0.5f, false, false);
                            }
                            this.maybeScroll = false;
                            this.isScrolling = false;
                        }
                    }
                    if (!this.isScrolling && !super.onTouchEvent(motionEvent) && !this.maybeScroll) {
                        return false;
                    }
                }
                return true;
            }
        };
        r7.setFitsSystemWindows(true);
        r7.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.linearLayout.setClipChildren(false);
        this.linearLayout.setClipToPadding(false);
        this.linearLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.linearLayout.setOrientation(1);
        PhotoViewer.AnonymousClass35 anonymousClass35 = this.linearLayout;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(this, getParentActivity(), r7);
        this.previewView = anonymousClass5;
        anonymousClass35.addView(anonymousClass5);
        TextView textView = new TextView(getParentActivity());
        this.chooseBackgroundHint = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.chooseBackgroundHint;
        int i4 = Theme.key_windowBackgroundWhiteGrayText;
        textView2.setTextColor(Theme.getColor(null, i4, false));
        this.chooseBackgroundHint.setTextSize(1, 14.0f);
        this.chooseBackgroundHint.setGravity(17);
        this.linearLayout.addView(this.chooseBackgroundHint, LayoutHelper.createLinear(-1, -2, 0, 21, 10, 21, 10));
        GroupCreateActivity.AnonymousClass7 anonymousClass7 = new GroupCreateActivity.AnonymousClass7(this, getParentActivity());
        BackgroundSelectView backgroundSelectView = new BackgroundSelectView(getParentActivity());
        this.backgroundSelectView = backgroundSelectView;
        anonymousClass7.addView(backgroundSelectView);
        this.linearLayout.addView(anonymousClass7, LayoutHelper.createLinear(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.chooseEmojiHint = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.chooseEmojiHint.setTextColor(Theme.getColor(null, i4, false));
        this.chooseEmojiHint.setTextSize(1, 14.0f);
        this.chooseEmojiHint.setGravity(17);
        this.linearLayout.addView(this.chooseEmojiHint, LayoutHelper.createLinear(-1, -2, 0, 21, 18, 21, 10));
        ?? r3 = new SelectAnimatedEmojiDialog(this, getParentActivity(), getThemedColor(i)) {
            public boolean firstLayout = true;

            @Override
            public final void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                long jLongValue;
                boolean z = this.forUser;
                AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
                TLRPC.TL_emojiList tL_emojiList = z ? MediaDataController.getInstance(((BaseFragment) avatarConstructorFragment).currentAccount).profileAvatarConstructorDefault : MediaDataController.getInstance(((BaseFragment) avatarConstructorFragment).currentAccount).groupAvatarConstructorDefault;
                if (tL_emojiList != null) {
                    if (document != null) {
                        jLongValue = document.id;
                    } else {
                        jLongValue = l != null ? l.longValue() : 0L;
                    }
                    tL_emojiList.document_id.contains(Long.valueOf(jLongValue));
                }
                avatarConstructorFragment.setPreview(l != null ? l.longValue() : 0L, document);
            }

            @Override
            public final void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                super.onLayout(z, i5, i6, i7, i8);
                if (this.firstLayout) {
                    this.firstLayout = false;
                    onShow(null);
                }
            }
        };
        this.selectAnimatedEmojiDialog = r3;
        r3.forUser = true;
        r3.setAnimationsEnabled(this.fragmentBeginToShow);
        setClipChildren(false);
        this.linearLayout.addView(this.selectAnimatedEmojiDialog, LayoutHelper.createLinear(-1, -1, 0, 12, 0, 12, 12));
        this.linearLayout.setClipChildren(false);
        r7.addView(this.linearLayout, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.colorPickerPreviewView = view;
        view.setVisibility(8);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourceProvider, true);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setRoundRadius(24);
        this.button.text.setHacks(false, false);
        int i5 = this.imageUpdater.setForType;
        if (i5 == 1) {
            this.buttonText = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i5 == 3) {
            this.buttonText = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i5 == 2) {
            this.buttonText = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (avatarFor == null || avatarFor.type != 2) {
            this.buttonText = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        } else {
            this.buttonText = LocaleController.getString(R.string.SuggestPhoto);
        }
        this.buttonText = new SpannableStringBuilder(this.buttonText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.buttonText);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.lockedButtonText = spannableStringBuilder;
        this.buttonIsLocked = false;
        this.button.setText(this.buttonText, false, true);
        this.button.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 6));
        this.bottomBulletinContainer = new FrameLayout(context);
        r7.addView(this.button, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        r7.addView(this.bottomBulletinContainer, LayoutHelper.createFrame(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        r7.addView(this.actionBar);
        r7.addView(this.overlayActionBar);
        r7.addView(this.colorPickerPreviewView, LayoutHelper.createFrame(-1.0f, -1));
        CanvasButton canvasButton = new CanvasButton(r7);
        this.avatarClickableArea = canvasButton;
        canvasButton.delegate = new AvatarConstructorFragment$$ExternalSyntheticLambda2(this, 0);
        this.fragmentView = r7;
        return r7;
    }

    public final void discardEditor() {
        if (getParentActivity() == null) {
            return;
        }
        if (!this.wasChanged) {
            finishFragment();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.message = string;
        alertDialog.title = LocaleController.getString(R.string.DiscardChanges);
        builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new AvatarConstructorFragment$$ExternalSyntheticLambda3(this, 1));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog);
        alertDialog.redPositive();
    }

    @Override
    public final boolean isLightStatusBar() {
        boolean z;
        AnonymousClass5 anonymousClass5 = this.previewView;
        if (anonymousClass5 != null && (anonymousClass5.expanded || (anonymousClass5.overrideExpandProgress >= 0.0f && anonymousClass5.backgroundGradient != null))) {
            BackgroundGradient backgroundGradient = anonymousClass5.backgroundGradient;
            int iBlendARGB = backgroundGradient.color1;
            int i = backgroundGradient.color2;
            if (i != 0) {
                iBlendARGB = ColorUtils.blendARGB(0.5f, iBlendARGB, i);
            }
            int i2 = backgroundGradient.color3;
            if (i2 != 0) {
                iBlendARGB = ColorUtils.blendARGB(0.5f, iBlendARGB, i2);
            }
            int i3 = backgroundGradient.color4;
            if (i3 != 0) {
                iBlendARGB = ColorUtils.blendARGB(0.5f, iBlendARGB, i3);
            }
            if (AndroidUtilities.computePerceivedBrightness(iBlendARGB) > 0.721f) {
                z = true;
            } else {
                z = false;
            }
        } else if (AndroidUtilities.computePerceivedBrightness(Theme.getColor(null, Theme.key_windowBackgroundGray, false)) > 0.721f) {
            z = true;
        } else {
            z = false;
        }
        if (this.isLightInternal != z) {
            this.isLightInternal = z;
            if (this.actionBar.getAlpha() == 0.0f) {
                float f = z ? 0.0f : 1.0f;
                if (this.progressToLightStatusBar != f) {
                    this.progressToLightStatusBar = f;
                    int iBlendARGB2 = ColorUtils.blendARGB(f, -16777216, -1);
                    int alphaComponent = ColorUtils.setAlphaComponent(iBlendARGB2, 60);
                    this.overlayActionBar.setItemsColor(iBlendARGB2, false);
                    this.setPhotoItem.setBackground(Theme.createSelectorDrawable(alphaComponent, 3, -1));
                }
            } else {
                ValueAnimator valueAnimator = this.lightProgressAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.lightProgressAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progressToLightStatusBar, z ? 0.0f : 1.0f);
                this.lightProgressAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 21));
                this.lightProgressAnimator.setDuration(150L).start();
            }
        }
        AnonymousClass11 anonymousClass11 = this.bottomSheet;
        if (anonymousClass11 != null) {
            AndroidUtilities.setLightStatusBar(anonymousClass11, z);
        }
        return z;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!this.wasChanged) {
            return super.onBackPressed(z);
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.message = string;
            alertDialog.title = LocaleController.getString(R.string.DiscardChanges);
            builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new AvatarConstructorFragment$$ExternalSyntheticLambda3(this, 0));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog);
            alertDialog.redPositive();
        }
        return false;
    }

    public final void onDonePressed$1() {
        TLRPC.Document document;
        MediaController.PhotoEntry photoEntry;
        TLRPC.Document documentFindDocument;
        AnonymousClass5 anonymousClass5;
        BackgroundGradient backgroundGradient;
        if (this.previewView.getImageReceiver() == null || !this.previewView.getImageReceiver().hasImageLoaded()) {
            return;
        }
        if (!UserConfig.getInstance(this.currentAccount).isPremium() && (((backgroundGradient = (anonymousClass5 = this.previewView).backgroundGradient) != null && backgroundGradient.premium) || anonymousClass5.isCustomGradient)) {
            new BulletinFactory(this.bottomBulletinContainer, this.resourceProvider).createSimpleBulletinWithIconSize(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.PremiumAvatarToast), new AvatarConstructorFragment$$ExternalSyntheticLambda2(this, 1))).show();
            return;
        }
        ChatActivity$$ExternalSyntheticLambda189 chatActivity$$ExternalSyntheticLambda189 = this.delegate;
        if (chatActivity$$ExternalSyntheticLambda189 != null) {
            AnonymousClass5 anonymousClass6 = this.previewView;
            BackgroundGradient backgroundGradient2 = anonymousClass6.backgroundGradient;
            long j = anonymousClass6.documentId;
            document = anonymousClass6.document;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) chatActivity$$ExternalSyntheticLambda189.f$0;
            chatAttachAlertPhotoLayout.getClass();
            HashMap map = ChatAttachAlertPhotoLayout.selectedPhotos;
            map.clear();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            GradientTools gradientTools = new GradientTools();
            if (backgroundGradient2 != null) {
                gradientTools.setColors(backgroundGradient2.color1, backgroundGradient2.color2, backgroundGradient2.color3, backgroundGradient2.color4);
            } else {
                int[] iArr = defaultColors[0];
                gradientTools.setColors(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 800.0f, 800.0f);
            gradientTools.setBounds(rectF);
            canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, gradientTools.paint);
            File file = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "avatar_background.png");
            try {
                file.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int i = (int) 120.00001f;
            int i2 = (int) 560.0f;
            ImageReceiver imageReceiver = anonymousClass6.getImageReceiver();
            if (imageReceiver.getAnimation() != null) {
                Bitmap firstFrame = imageReceiver.getAnimation().getFirstFrame();
                ImageReceiver imageReceiver2 = new ImageReceiver();
                imageReceiver2.setImageBitmap(firstFrame);
                float f = i;
                float f2 = i2;
                imageReceiver2.setImageCoords(f, f, f2, f2);
                imageReceiver2.setRoundRadius((int) (f2 * 0.13f));
                imageReceiver2.draw(canvas);
                imageReceiver2.clearImage();
                firstFrame.recycle();
                file = file;
            } else {
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                }
                float f3 = i;
                float f4 = i2;
                imageReceiver.setImageCoords(f3, f3, f4, f4);
                imageReceiver.setRoundRadius((int) (f4 * 0.13f));
                imageReceiver.draw(canvas);
            }
            File file2 = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "avatar_background.png");
            try {
                file2.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                fileOutputStream2.write(byteArray2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            if (anonymousClass6.getImageReceiver().getAnimation() == null && anonymousClass6.getImageReceiver().getLottieAnimation() == null) {
                photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file2.getPath(), 0, false, 0, 0, 0L);
            } else {
                photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, false, 0, 0, 0L);
                photoEntry.thumbPath = file2.getPath();
                if (anonymousClass6.documentId != 0) {
                    TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                    tL_videoSizeEmojiMarkup.emoji_id = anonymousClass6.documentId;
                    tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(anonymousClass6.backgroundGradient.color1));
                    int i3 = anonymousClass6.backgroundGradient.color2;
                    if (i3 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i3));
                    }
                    int i4 = anonymousClass6.backgroundGradient.color3;
                    if (i4 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i4));
                    }
                    int i5 = anonymousClass6.backgroundGradient.color4;
                    if (i5 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i5));
                    }
                    photoEntry.emojiMarkup = tL_videoSizeEmojiMarkup;
                } else if (anonymousClass6.document != null) {
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                    TLRPC.Document document2 = anonymousClass6.document;
                    tL_videoSizeStickerMarkup.sticker_id = document2.id;
                    tL_videoSizeStickerMarkup.stickerset = MessageObject.getInputStickerSet(document2);
                    tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(anonymousClass6.backgroundGradient.color1));
                    int i6 = anonymousClass6.backgroundGradient.color2;
                    if (i6 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i6));
                    }
                    int i7 = anonymousClass6.backgroundGradient.color3;
                    if (i7 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i7));
                    }
                    int i8 = anonymousClass6.backgroundGradient.color4;
                    if (i8 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i8));
                    }
                    photoEntry.emojiMarkup = tL_videoSizeStickerMarkup;
                }
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                photoEntry.editedInfo = videoEditedInfo;
                videoEditedInfo.originalPath = file.getPath();
                VideoEditedInfo videoEditedInfo2 = photoEntry.editedInfo;
                videoEditedInfo2.resultWidth = 800;
                videoEditedInfo2.resultHeight = 800;
                videoEditedInfo2.originalWidth = 800;
                videoEditedInfo2.originalHeight = 800;
                videoEditedInfo2.isPhoto = true;
                videoEditedInfo2.bitrate = -1;
                videoEditedInfo2.muted = true;
                videoEditedInfo2.startTime = 0L;
                videoEditedInfo2.start = 0L;
                videoEditedInfo2.endTime = anonymousClass6.getDuration();
                VideoEditedInfo videoEditedInfo3 = photoEntry.editedInfo;
                videoEditedInfo3.framerate = 30;
                videoEditedInfo3.avatarStartTime = 0L;
                long j2 = videoEditedInfo3.endTime;
                videoEditedInfo3.estimatedSize = (int) ((j2 / 1000.0f) * 115200.0f);
                videoEditedInfo3.estimatedDuration = j2;
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                if (document == 0) {
                    documentFindDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j);
                }
                if (documentFindDocument != null) {
                    documentFindDocument = document;
                    mediaEntity.viewWidth = i2;
                    mediaEntity.viewHeight = i2;
                    mediaEntity.width = 0.7f;
                    mediaEntity.height = 0.7f;
                    mediaEntity.x = 0.15f;
                    mediaEntity.y = 0.15f;
                    mediaEntity.document = documentFindDocument;
                    mediaEntity.parentObject = null;
                    mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(documentFindDocument, true).getAbsolutePath();
                    mediaEntity.roundRadius = 0.13f;
                    if (MessageObject.isAnimatedStickerDocument(documentFindDocument, true) || MessageObject.isVideoStickerDocument(documentFindDocument)) {
                        mediaEntity.subType = (byte) (mediaEntity.subType | (MessageObject.isAnimatedStickerDocument(documentFindDocument, true) ? (byte) 1 : (byte) 4));
                    }
                    if (MessageObject.isTextColorEmoji(documentFindDocument)) {
                        mediaEntity.color = -1;
                        mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                    }
                    photoEntry.editedInfo.mediaEntities = new ArrayList<>();
                    photoEntry.editedInfo.mediaEntities.add(mediaEntity);
                }
            }
            map.put(-1, photoEntry);
            ChatAttachAlertPhotoLayout.selectedPhotosOrder.add(-1);
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            chatAttachAlert.delegate.didPressedButton(7, true, false, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
            AvatarConstructorFragment avatarConstructorFragment = (AvatarConstructorFragment) chatActivity$$ExternalSyntheticLambda189.f$1;
            if (!avatarConstructorFragment.finishOnDone) {
                BaseFragment baseFragment = chatAttachAlert.baseFragment;
                if (baseFragment != null) {
                    baseFragment.removeSelfFromStack();
                }
                avatarConstructorFragment.finishFragment();
            }
        }
        documentFindDocument = document;
        if (this.finishOnDone) {
            finishFragment();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), getClassGuid());
    }

    public final void setExpanded(boolean z, boolean z2, boolean z3) {
        if (this.isLandscapeMode) {
            return;
        }
        cancelExpandAnimator();
        this.expandAnimator = ValueAnimator.ofFloat(this.progressToExpand, z ? 1.0f : 0.0f);
        if (z2) {
            this.previewView.overrideExpandProgress = this.progressToExpand;
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        this.expandAnimator.addUpdateListener(new SecretVoicePlayer$$ExternalSyntheticLambda1(4, this, z2));
        this.expandAnimator.addListener(new LoginActivity.AnonymousClass8(this, z, z2, 3));
        if (z3) {
            this.expandAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.expandAnimator.setDuration(350L);
            this.expandAnimator.setStartDelay(150L);
        } else {
            this.expandAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.expandAnimator.setDuration(250L);
        }
        this.expandAnimator.start();
    }

    public final void setPreview(long j, TLRPC.Document document) {
        AnonymousClass5 anonymousClass5 = this.previewView;
        anonymousClass5.documentId = j;
        anonymousClass5.document = document;
        UserCell.AnonymousClass2 anonymousClass2 = anonymousClass5.backupImageView;
        if (j == 0) {
            anonymousClass2.setAnimatedEmojiDrawable(null);
            this.previewView.backupImageView.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f), 0L, "tgs", document, 0);
        } else {
            anonymousClass2.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(14, this.currentAccount, j));
            this.previewView.backupImageView.getImageReceiver().clearImage();
        }
        if (this.previewView.getImageReceiver() != null && this.previewView.getImageReceiver().getAnimation() != null) {
            this.previewView.getImageReceiver().getAnimation().seekTo(0L, true, false);
        }
        if (this.previewView.getImageReceiver() != null && this.previewView.getImageReceiver().getLottieAnimation() != null) {
            this.previewView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, true);
        }
        this.wasChanged = true;
        updateButton$7();
    }

    public final void setProgressToExpand(float f, boolean z) {
        this.progressToExpand = f;
        float f2 = ((this.expandedHeight - this.collapsedHeight) - AndroidUtilities.statusBarHeight) * f;
        if (this.keyboardVisibleProgress == 0.0f) {
            this.linearLayout.setTranslationY(f2);
            this.button.setTranslationY(f2);
        }
        this.previewView.setTranslationY(((-(this.expandedHeight - this.collapsedHeight)) / 2.0f) * f);
        this.fragmentView.invalidate();
        if (z) {
            this.previewView.setExpanded(f > 0.5f);
        }
    }

    public final void startFrom(AvatarConstructorPreviewCell avatarConstructorPreviewCell) {
        BackgroundGradient backgroundGradient = avatarConstructorPreviewCell.getBackgroundGradient();
        AnonymousClass5 anonymousClass5 = this.previewView;
        if (anonymousClass5 == null) {
            return;
        }
        anonymousClass5.setGradient(backgroundGradient, false);
        updateButton$7();
        if (avatarConstructorPreviewCell.getAnimatedEmoji() != null) {
            long documentId = avatarConstructorPreviewCell.getAnimatedEmoji().getDocumentId();
            AnonymousClass5 anonymousClass6 = this.previewView;
            anonymousClass6.documentId = documentId;
            anonymousClass6.backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(14, this.currentAccount, documentId));
        }
        this.backgroundSelectView.selectGradient(backgroundGradient);
        setForUser(false);
    }

    public final void updateButton$7() {
        AnonymousClass5 anonymousClass5;
        BackgroundGradient backgroundGradient;
        boolean z = !UserConfig.getInstance(this.currentAccount).isPremium() && (((backgroundGradient = (anonymousClass5 = this.previewView).backgroundGradient) != null && backgroundGradient.premium) || anonymousClass5.isCustomGradient);
        if (this.buttonIsLocked != z) {
            ButtonWithCounterView buttonWithCounterView = this.button;
            this.buttonIsLocked = z;
            buttonWithCounterView.setText(z ? this.lockedButtonText : this.buttonText, true, true);
        }
    }

    public final void startFrom(long j) {
        AnonymousClass5 anonymousClass5 = this.previewView;
        if (anonymousClass5 == null) {
            return;
        }
        BackgroundGradient backgroundGradient = new BackgroundGradient();
        int[] iArr = defaultColors[0];
        backgroundGradient.color1 = iArr[0];
        backgroundGradient.color2 = iArr[1];
        backgroundGradient.color3 = iArr[2];
        backgroundGradient.color4 = iArr[3];
        anonymousClass5.setGradient(backgroundGradient, false);
        updateButton$7();
        AnonymousClass5 anonymousClass6 = this.previewView;
        anonymousClass6.documentId = j;
        anonymousClass6.backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(14, this.currentAccount, j));
        this.backgroundSelectView.selectGradient(backgroundGradient);
        setForUser(false);
    }

    public final void startFrom(TLRPC.VideoSize videoSize) {
        BackgroundGradient backgroundGradient = new BackgroundGradient();
        backgroundGradient.color1 = ColorUtils.setAlphaComponent(videoSize.background_colors.get(0).intValue(), 255);
        backgroundGradient.color2 = videoSize.background_colors.size() > 1 ? ColorUtils.setAlphaComponent(videoSize.background_colors.get(1).intValue(), 255) : 0;
        backgroundGradient.color3 = videoSize.background_colors.size() > 2 ? ColorUtils.setAlphaComponent(videoSize.background_colors.get(2).intValue(), 255) : 0;
        backgroundGradient.color4 = videoSize.background_colors.size() > 3 ? ColorUtils.setAlphaComponent(videoSize.background_colors.get(3).intValue(), 255) : 0;
        this.previewView.setGradient(backgroundGradient, false);
        updateButton$7();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            setPreview(((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i = 0; i < stickerSet.documents.size(); i++) {
                    if (stickerSet.documents.get(i).id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i);
                    }
                }
            }
            setPreview(0L, document);
        }
        this.backgroundSelectView.selectGradient(backgroundGradient);
        setForUser(true);
    }
}
