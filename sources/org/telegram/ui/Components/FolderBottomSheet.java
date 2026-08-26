package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.MainTabsActivity;

public class FolderBottomSheet extends BottomSheetWithRecyclerListView {
    private int alreadyHeaderRow;
    private ArrayList<Long> alreadyJoined;
    private ArrayList<TLRPC.Peer> alreadyPeers;
    private int alreadySectionRow;
    private int alreadyUsersEndRow;
    private int alreadyUsersStartRow;
    private FrameLayout bulletinContainer;
    private Button button;
    private View buttonShadow;
    private boolean deleting;
    private CharSequence escapedTitle;
    private int filterId;
    private HeaderCell headerCell;
    private int headerRow;
    private TL_chatlists.chatlist_ChatlistInvite invite;
    private long lastClicked;
    private long lastClickedDialogId;
    private Utilities.Callback<Boolean> onDone;
    private ArrayList<TLRPC.Peer> peers;
    private int reqId;
    private int rowsCount;
    private int sectionRow;
    private ArrayList<Long> selectedPeers;
    private int shiftDp;
    private String slug;
    private boolean success;
    private CharSequence title;
    private TitleCell titleCell;
    private ArrayList<TLRPC.MessageEntity> titleEntities;
    private boolean titleNoanimate;
    private int titleRow;
    private TL_chatlists.TL_chatlists_chatlistUpdates updates;
    private int usersEndRow;
    private int usersSectionRow;
    private int usersStartRow;

    public static class Button extends FrameLayout {
        private ShapeDrawable background;
        float countAlpha;
        AnimatedFloat countAlphaAnimated;
        private ValueAnimator countAnimator;
        private float countScale;
        AnimatedTextView.AnimatedTextDrawable countText;
        private boolean enabled;
        private ValueAnimator enabledAnimator;
        private float enabledT;
        private int lastCount;
        private boolean loading;
        private ValueAnimator loadingAnimator;
        private CircularProgressDrawable loadingDrawable;
        private float loadingT;
        Paint paint;
        private View rippleView;
        AnimatedTextView.AnimatedTextDrawable text;

        public Button(Context context, String str) {
            super(context);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.countAlphaAnimated = new AnimatedFloat(350L, cubicBezierInterpolator);
            this.loadingT = 0.0f;
            this.countScale = 1.0f;
            this.enabledT = 1.0f;
            this.enabled = true;
            View view = new View(context);
            this.rippleView = view;
            int i = Theme.key_featuredStickers_addButton;
            view.setBackground(Theme.AdaptiveRipple.createRect(new float[]{8.0f}, 0, Theme.AdaptiveRipple.calcRippleColor(Theme.getColor(null, i, false))));
            addView(this.rippleView, LayoutHelper.createFrame(-1, -1.0f));
            ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(null, i, false));
            this.background = shapeDrawableCreateRoundRectDrawable;
            setBackground(shapeDrawableCreateRoundRectDrawable);
            Paint paint = new Paint(1);
            this.paint = paint;
            int i2 = Theme.key_featuredStickers_buttonText;
            paint.setColor(Theme.getColor(null, i2, false));
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, false);
            this.text = animatedTextDrawable;
            animatedTextDrawable.setAnimationProperties(0.3f, 0L, 250L, cubicBezierInterpolator);
            this.text.setCallback(this);
            this.text.setTextSize(AndroidUtilities.dp(14.0f));
            this.text.setTypeface(AndroidUtilities.bold());
            this.text.setTextColor(Theme.getColor(null, i2, false));
            this.text.setText(str);
            this.text.setGravity(1);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, false, true);
            this.countText = animatedTextDrawable2;
            animatedTextDrawable2.setAnimationProperties(0.3f, 0L, 250L, cubicBezierInterpolator);
            this.countText.setCallback(this);
            this.countText.setTextSize(AndroidUtilities.dp(12.0f));
            this.countText.setTypeface(AndroidUtilities.bold());
            this.countText.setTextColor(Theme.getColor(null, i, false));
            this.countText.setText("");
            this.countText.setGravity(1);
            setWillNotDraw(false);
        }

        private void animateCount() {
            int i = 2;
            ValueAnimator valueAnimator = this.countAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.countAnimator = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.countAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new FolderBottomSheet$Button$$ExternalSyntheticLambda0(this, i));
            this.countAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    Button.this.countScale = 1.0f;
                    Button.this.invalidate();
                }
            });
            zzkk.m(2.0f, this.countAnimator);
            this.countAnimator.setDuration(200L);
            this.countAnimator.start();
        }

        public void lambda$animateCount$1(ValueAnimator valueAnimator) {
            this.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            invalidate();
        }

        public void lambda$setEnabled$2(ValueAnimator valueAnimator) {
            this.enabledT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public void lambda$setLoading$0(ValueAnimator valueAnimator) {
            this.loadingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            return false;
        }

        public TextPaint getTextPaint() {
            return this.text.getPaint();
        }

        public boolean isLoading() {
            return this.loading;
        }

        @Override
        public void onDraw(Canvas canvas) {
            this.rippleView.draw(canvas);
            boolean z = false;
            if (this.loadingT > 0.0f) {
                if (this.loadingDrawable == null) {
                    this.loadingDrawable = new CircularProgressDrawable(this.text.getTextColor());
                }
                int iDp = (int) ((1.0f - this.loadingT) * AndroidUtilities.dp(24.0f));
                this.loadingDrawable.setBounds(0, iDp, getWidth(), getHeight() + iDp);
                this.loadingDrawable.setAlpha((int) (this.loadingT * 255.0f));
                this.loadingDrawable.draw(canvas);
                invalidate();
            }
            float f = this.loadingT;
            if (f < 1.0f) {
                if (f != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, (int) (this.loadingT * AndroidUtilities.dp(-24.0f)));
                    canvas.scale(1.0f, 1.0f - (this.loadingT * 0.4f));
                    z = true;
                }
                float currentWidth = this.text.getCurrentWidth();
                float f2 = this.countAlphaAnimated.set(this.countAlpha);
                float currentWidth2 = ((this.countText.getCurrentWidth() + AndroidUtilities.dp(15.66f)) * f2) + currentWidth;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((int) (((getMeasuredWidth() - currentWidth2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - this.text.getHeight()) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) AacUtil.m(getMeasuredWidth() - currentWidth2, getWidth(), 2.0f, currentWidth), (int) (((this.text.getHeight() + getMeasuredHeight()) / 2.0f) - AndroidUtilities.dp(1.0f)));
                this.text.setAlpha((int) (AndroidUtilities.lerp(0.5f, 1.0f, this.enabledT) * (1.0f - this.loadingT) * 255.0f));
                this.text.setBounds(rect);
                this.text.draw(canvas);
                rect.set((int) (ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredWidth(), currentWidth2, 2.0f, currentWidth) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), this.countText.getCurrentWidth()) + ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredWidth(), currentWidth2, 2.0f, currentWidth) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                if (this.countScale != 1.0f) {
                    canvas.save();
                    float f3 = this.countScale;
                    canvas.scale(f3, f3, rect.centerX(), rect.centerY());
                }
                this.paint.setAlpha((int) ((1.0f - this.loadingT) * 255.0f * f2 * f2));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.paint);
                rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
                this.countText.setAlpha((int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.loadingT, 255.0f, f2));
                this.countText.setBounds(rect);
                this.countText.draw(canvas);
                if (this.countScale != 1.0f) {
                    canvas.restore();
                }
                if (z) {
                    canvas.restore();
                }
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.text.getText());
            if (this.lastCount > 0) {
                str = ", " + LocaleController.formatPluralString("Chats", this.lastCount, new Object[0]);
            } else {
                str = "";
            }
            sb.append(str);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }

        public void setCount(int i, boolean z) {
            int i2;
            if (z) {
                this.countText.cancelAnimation();
            }
            if (z && i != (i2 = this.lastCount) && i > 0 && i2 > 0) {
                animateCount();
            }
            this.lastCount = i;
            this.countAlpha = i != 0 ? 1.0f : 0.0f;
            this.countText.setText("" + i, z);
            invalidate();
        }

        public void setEmojiCacheType(int i) {
            this.text.setEmojiCacheType(i);
        }

        @Override
        public void setEnabled(boolean z) {
            int i = 1;
            if (this.enabled != z) {
                ValueAnimator valueAnimator = this.enabledAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.enabledAnimator = null;
                }
                float f = this.enabledT;
                this.enabled = z;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                this.enabledAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new FolderBottomSheet$Button$$ExternalSyntheticLambda0(this, i));
                this.enabledAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                    }
                });
                this.enabledAnimator.start();
            }
        }

        public void setLoading(final boolean z) {
            int i = 0;
            if (this.loading != z) {
                ValueAnimator valueAnimator = this.loadingAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.loadingAnimator = null;
                }
                float f = this.loadingT;
                this.loading = z;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                this.loadingAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new FolderBottomSheet$Button$$ExternalSyntheticLambda0(this, i));
                this.loadingAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Button.this.loadingT = z ? 1.0f : 0.0f;
                        Button.this.invalidate();
                    }
                });
                this.loadingAnimator.setDuration(320L);
                this.loadingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.loadingAnimator.start();
            }
        }

        public void setText(CharSequence charSequence, boolean z) {
            if (z) {
                this.text.cancelAnimation();
            }
            this.text.setText(charSequence, z);
            invalidate();
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            return this.text == drawable || this.countText == drawable || super.verifyDrawable(drawable);
        }
    }

    public static class HeaderCell extends FrameLayout {
        public AnimatedTextView actionTextView;
        public AnimatedTextView textView;

        public HeaderCell(Context context) {
            super(context);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, false);
            this.textView = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            this.textView.setTypeface(AndroidUtilities.bold());
            AnimatedTextView animatedTextView2 = this.textView;
            int i = Theme.key_windowBackgroundWhiteBlueHeader;
            animatedTextView2.setTextColor(Theme.getColor(null, i, false));
            this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(this.textView, LayoutHelper.createFrame(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
            AnimatedTextView animatedTextView3 = new AnimatedTextView(context, true, true, true);
            this.actionTextView = animatedTextView3;
            animatedTextView3.setAnimationProperties(0.45f, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.actionTextView.setTextSize(AndroidUtilities.dp(15.0f));
            this.actionTextView.setTextColor(Theme.getColor(null, i, false));
            this.actionTextView.setGravity(LocaleController.isRTL ? 3 : 5);
            addView(this.actionTextView, LayoutHelper.createFrame(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            new ViewCompat.AnonymousClass1(2131296684, Boolean.class, 0, 28, 2).set(this, Boolean.TRUE);
        }

        public static void lambda$setAction$0(Runnable runnable, View view) {
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setText(this.textView.getText());
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void setAction(CharSequence charSequence, Runnable runnable) {
            this.actionTextView.setText(charSequence, !LocaleController.isRTL);
            this.actionTextView.setOnClickListener(new ArchiveHelp$$ExternalSyntheticLambda0(2, runnable));
        }

        public void setText(CharSequence charSequence, boolean z) {
            if (z) {
                this.textView.cancelAnimation();
            }
            this.textView.setText(charSequence, z && !LocaleController.isRTL);
        }
    }

    public class TitleCell extends FrameLayout {
        private boolean already;
        private FoldersPreview preview;
        private AnimatedEmojiSpan.TextViewEmojis subtitleTextView;
        private CharSequence title;
        private AnimatedEmojiSpan.TextViewEmojis titleTextView;

        public class FoldersPreview extends View {
            AnimatedTextView.AnimatedTextDrawable countText;
            Text leftFolder;
            Text leftFolder2;
            LinearGradient leftGradient;
            Matrix leftMatrix;
            Paint leftPaint;
            Text middleFolder;
            TextPaint paint;
            Path path;
            float[] radii;
            Text rightFolder;
            Text rightFolder2;
            LinearGradient rightGradient;
            Matrix rightMatrix;
            Paint rightPaint;
            Paint selectedPaint;
            TextPaint selectedTextPaint;

            public FoldersPreview(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ArrayList<TLRPC.MessageEntity> arrayList, boolean z, CharSequence charSequence4, CharSequence charSequence5) {
                super(context);
                this.paint = new TextPaint(1);
                this.selectedTextPaint = new TextPaint(1);
                this.selectedPaint = new Paint(1);
                this.path = new Path();
                this.radii = new float[8];
                this.leftPaint = new Paint(1);
                this.rightPaint = new Paint(1);
                this.leftMatrix = new Matrix();
                this.rightMatrix = new Matrix();
                TextPaint textPaint = this.paint;
                int i = Theme.key_profile_tabText;
                textPaint.setColor(Theme.multAlpha(0.8f, Theme.getColor(null, i, false)));
                this.paint.setTextSize(AndroidUtilities.dp(15.33f));
                this.paint.setTypeface(AndroidUtilities.bold());
                TextPaint textPaint2 = this.selectedTextPaint;
                int i2 = Theme.key_windowBackgroundWhiteBlueText2;
                textPaint2.setColor(Theme.getColor(null, i2, false));
                this.selectedTextPaint.setTextSize(AndroidUtilities.dp(17.0f));
                this.selectedTextPaint.setTypeface(AndroidUtilities.bold());
                this.selectedPaint.setColor(Theme.getColor(null, Theme.key_featuredStickers_unread, false));
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
                this.countText = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.3f, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.countText.setCallback(this);
                this.countText.setTextSize(AndroidUtilities.dp(11.66f));
                this.countText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                this.countText.setTypeface(AndroidUtilities.bold());
                this.countText.setGravity(1);
                int iMultAlpha = Theme.multAlpha(0.8f, Theme.getColor(null, i, false));
                int color = Theme.getColor(null, i2, false);
                if (charSequence != null) {
                    this.leftFolder2 = new Text(normalizeTitle(charSequence), 15.33f, AndroidUtilities.bold()).supportAnimatedEmojis(this).setColor(iMultAlpha);
                }
                if (charSequence2 != null) {
                    this.leftFolder = new Text(normalizeTitle(charSequence2), 15.33f, AndroidUtilities.bold()).supportAnimatedEmojis(this).setColor(iMultAlpha);
                }
                CharSequence charSequenceNormalizeTitle = normalizeTitle(charSequence3);
                Text color2 = new Text(charSequenceNormalizeTitle, 15.33f, AndroidUtilities.bold()).supportAnimatedEmojis(this).setColor(color);
                this.middleFolder = color2;
                this.middleFolder.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(charSequenceNormalizeTitle, color2.getFontMetricsInt(), false), arrayList, this.middleFolder.getFontMetricsInt()));
                this.middleFolder.setEmojiCacheType(z ? 26 : 0);
                if (charSequence4 != null) {
                    this.rightFolder = new Text(normalizeTitle(charSequence4), 15.33f, AndroidUtilities.bold()).supportAnimatedEmojis(this).setColor(iMultAlpha);
                }
                if (charSequence5 != null) {
                    this.rightFolder2 = new Text(normalizeTitle(charSequence5), 15.33f, AndroidUtilities.bold()).supportAnimatedEmojis(this).setColor(iMultAlpha);
                }
                float[] fArr = this.radii;
                float fDp = AndroidUtilities.dp(3.0f);
                fArr[3] = fDp;
                fArr[2] = fDp;
                fArr[1] = fDp;
                fArr[0] = fDp;
                float[] fArr2 = this.radii;
                float fDp2 = AndroidUtilities.dp(1.0f);
                fArr2[7] = fDp2;
                fArr2[6] = fDp2;
                fArr2[5] = fDp2;
                fArr2[4] = fDp2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
                this.leftGradient = linearGradient;
                this.leftPaint.setShader(linearGradient);
                Paint paint = this.leftPaint;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
                this.rightGradient = linearGradient2;
                this.rightPaint.setShader(linearGradient2);
                this.rightPaint.setXfermode(new PorterDuffXfermode(mode));
            }

            private boolean isCountEmpty() {
                return this.countText.getText() == null || this.countText.getText().length() == 0;
            }

            private CharSequence normalizeTitle(CharSequence charSequence) {
                return (charSequence == null || "ALL_CHATS".equals(charSequence.toString())) ? LocaleController.getString(R.string.FilterAllChats) : charSequence;
            }

            @Override
            public void onDraw(Canvas canvas) {
                float f;
                float f2;
                float currentWidth;
                float currentWidth2;
                super.onDraw(canvas);
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                if (this.middleFolder != null) {
                    canvas.save();
                    float currentWidth3 = this.middleFolder.getCurrentWidth();
                    if (isCountEmpty()) {
                        currentWidth2 = 0.0f;
                    } else {
                        currentWidth2 = this.countText.getCurrentWidth() + AndroidUtilities.dp(15.32f);
                    }
                    f2 = currentWidth3 + currentWidth2;
                    f = measuredWidth - (f2 / 2.0f);
                    canvas.translate(f, measuredHeight - (this.middleFolder.getHeight() / 2.0f));
                    this.middleFolder.draw(canvas);
                    canvas.restore();
                } else {
                    f = measuredWidth;
                    f2 = 0.0f;
                }
                if (!isCountEmpty()) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set((int) (this.middleFolder.getCurrentWidth() + f + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (this.countText.getCurrentWidth() + this.middleFolder.getCurrentWidth() + f + AndroidUtilities.dp(15.32f)), (int) (AndroidUtilities.dp(9.0f) + measuredHeight));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(rect);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), this.selectedPaint);
                    rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
                    this.countText.setBounds(rect);
                    this.countText.draw(canvas);
                }
                float fDp = AndroidUtilities.dp(30.0f);
                float currentWidth4 = (f - fDp) - this.leftFolder.getCurrentWidth();
                if (this.leftFolder2 == null || this.leftFolder.getCurrentWidth() >= AndroidUtilities.dp(64.0f)) {
                    currentWidth = currentWidth4;
                } else {
                    currentWidth = currentWidth4 - (this.leftFolder2.getCurrentWidth() + fDp);
                    canvas.save();
                    canvas.translate(currentWidth, (measuredHeight - (this.leftFolder2.getHeight() / 2.0f)) + AndroidUtilities.dp(1.0f));
                    this.leftFolder2.draw(canvas);
                    canvas.restore();
                }
                if (this.leftFolder != null) {
                    canvas.save();
                    canvas.translate(currentWidth4, (measuredHeight - (this.leftFolder.getHeight() / 2.0f)) + AndroidUtilities.dp(1.0f));
                    this.leftFolder.draw(canvas);
                    canvas.restore();
                }
                float currentWidth5 = f + f2;
                if (this.rightFolder != null) {
                    canvas.save();
                    canvas.translate(currentWidth5 + fDp, (measuredHeight - (this.rightFolder.getHeight() / 2.0f)) + AndroidUtilities.dp(1.0f));
                    this.rightFolder.draw(canvas);
                    canvas.restore();
                    currentWidth5 += this.rightFolder.getCurrentWidth() + fDp;
                }
                if (this.rightFolder2 != null && this.rightFolder.getCurrentWidth() < AndroidUtilities.dp(64.0f)) {
                    canvas.save();
                    canvas.translate(currentWidth5 + fDp, (measuredHeight - (this.rightFolder2.getHeight() / 2.0f)) + AndroidUtilities.dp(1.0f));
                    this.rightFolder2.draw(canvas);
                    canvas.restore();
                    currentWidth5 += this.rightFolder2.getCurrentWidth() + fDp;
                }
                float height = (this.middleFolder.getHeight() / 2.0f) + measuredHeight + AndroidUtilities.dp(12.0f);
                canvas.drawRect(0.0f, height, getMeasuredWidth(), height + 1.0f, this.paint);
                this.path.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f3 = f2 / 2.0f;
                float f4 = f3 + measuredWidth;
                rectF2.set((measuredWidth - f3) - AndroidUtilities.dp(4.0f), height - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f4, height);
                this.path.addRoundRect(rectF2, this.radii, Path.Direction.CW);
                canvas.drawPath(this.path, this.selectedPaint);
                canvas.save();
                float fMax = Math.max(AndroidUtilities.dp(8.0f), currentWidth);
                this.leftMatrix.reset();
                this.leftMatrix.postTranslate(Math.min(f, fMax + AndroidUtilities.dp(8.0f)), 0.0f);
                this.leftGradient.setLocalMatrix(this.leftMatrix);
                float fMin = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), currentWidth5);
                this.rightMatrix.reset();
                this.rightMatrix.postTranslate(Math.max(f4, fMin - AndroidUtilities.dp(88.0f)), 0.0f);
                this.rightGradient.setLocalMatrix(this.rightMatrix);
                canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.leftPaint);
                canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.rightPaint);
                canvas.restore();
                canvas.restore();
            }

            public void setCount(int i, boolean z) {
                if (z) {
                    this.countText.cancelAnimation();
                }
                this.countText.setText(i > 0 ? DiffUtil.m(i, "+") : "", z);
                invalidate();
            }

            @Override
            public boolean verifyDrawable(Drawable drawable) {
                return drawable == this.countText || super.verifyDrawable(drawable);
            }
        }

        public TitleCell(Context context, boolean z, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, boolean z2) {
            super(context);
            this.already = z;
            FoldersPreview foldersPreview = new FoldersPreview(context, null, LocaleController.getString(R.string.FolderLinkPreviewLeft), charSequence == null ? "" : new SpannableStringBuilder(charSequence), arrayList, z2, LocaleController.getString(R.string.FolderLinkPreviewRight), null);
            this.preview = foldersPreview;
            addView(foldersPreview, LayoutHelper.createFrame(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
            this.titleTextView = textViewEmojis;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textViewEmojis.setTextColor(Theme.getColor(null, i, false));
            this.titleTextView.setTextSize(1, 20.0f);
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setGravity(17);
            this.titleTextView.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), this.titleTextView.getPaint().getFontMetricsInt(), false, 0.8f);
            this.title = charSequenceReplaceEmoji;
            this.title = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, arrayList, this.titleTextView.getPaint().getFontMetricsInt(), false, 0.8f, 0);
            this.titleTextView.setText(FolderBottomSheet.this.getTitle());
            this.titleTextView.setCacheType(z2 ? 26 : 0);
            this.titleTextView.setEmojiColor(Theme.getColor(Theme.key_featuredStickers_addButton, ((BottomSheet) FolderBottomSheet.this).resourcesProvider));
            addView(this.titleTextView, LayoutHelper.createFrame(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis2 = new AnimatedEmojiSpan.TextViewEmojis(context);
            this.subtitleTextView = textViewEmojis2;
            textViewEmojis2.setTextColor(Theme.getColor(null, i, false));
            this.subtitleTextView.setTextSize(1, 14.0f);
            this.subtitleTextView.setLines(2);
            this.subtitleTextView.setGravity(17);
            this.subtitleTextView.setLineSpacing(0.0f, 1.15f);
            addView(this.subtitleTextView, LayoutHelper.createFrame(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
            setSelectedCount(0, false);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
        }

        public void setSelectedCount(int i, boolean z) {
            if (FolderBottomSheet.this.deleting) {
                this.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, this.title)));
                return;
            }
            if (!this.already) {
                if (FolderBottomSheet.this.peers == null || FolderBottomSheet.this.peers.isEmpty()) {
                    this.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, this.title)));
                    return;
                } else {
                    this.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, this.title)));
                    return;
                }
            }
            this.preview.setCount(FolderBottomSheet.this.peers != null ? FolderBottomSheet.this.peers.size() : 0, false);
            if (FolderBottomSheet.this.peers == null || FolderBottomSheet.this.peers.isEmpty()) {
                this.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, this.title)));
            } else {
                this.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", FolderBottomSheet.this.peers != null ? FolderBottomSheet.this.peers.size() : 0, this.title)));
            }
        }
    }

    public FolderBottomSheet(BaseFragment baseFragment, int i, List<Long> list) {
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        super(baseFragment, false, false);
        this.filterId = -1;
        this.title = "";
        this.titleEntities = new ArrayList<>();
        this.escapedTitle = "";
        this.alreadyJoined = new ArrayList<>();
        this.selectedPeers = new ArrayList<>();
        this.reqId = -1;
        this.shiftDp = -5;
        this.filterId = i;
        this.deleting = true;
        this.peers = new ArrayList<>();
        this.selectedPeers.clear();
        if (list != null) {
            this.selectedPeers.addAll(list);
        }
        ArrayList<MessagesController.DialogFilter> arrayList = baseFragment.getMessagesController().dialogFilters;
        if (arrayList == null) {
            dialogFilter = null;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                dialogFilter = null;
                break;
            } else {
                if (arrayList.get(i2).id == i) {
                    dialogFilter = arrayList.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (dialogFilter != null) {
            this.title = dialogFilter.name;
            this.titleEntities = dialogFilter.entities;
            this.titleNoanimate = dialogFilter.title_noanimate;
            for (int i3 = 0; i3 < this.selectedPeers.size(); i3++) {
                TLRPC.Peer peer = baseFragment.getMessagesController().getPeer(this.selectedPeers.get(i3).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.peers.add(peer);
                }
            }
            for (int i4 = 0; i4 < dialogFilter.alwaysShow.size(); i4++) {
                Long l = dialogFilter.alwaysShow.get(i4);
                long jLongValue = l.longValue();
                if (!this.selectedPeers.contains(l)) {
                    TLRPC.Peer peer2 = baseFragment.getMessagesController().getPeer(jLongValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = baseFragment.getMessagesController().getChat(Long.valueOf(-jLongValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.peers.add(peer2);
                    }
                }
            }
        }
        init();
    }

    private void announceSelection(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.selectedPeers.size(), new Object[0]));
        if (!z || this.headerCell == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.headerCell.actionTextView.getText());
        }
        sb.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb.toString());
    }

    private void deselectAll(HeaderCell headerCell, boolean z) {
        this.selectedPeers.clear();
        this.selectedPeers.addAll(this.alreadyJoined);
        if (!z) {
            for (int i = 0; i < this.peers.size(); i++) {
                long peerDialogId = DialogObject.getPeerDialogId(this.peers.get(i));
                if (!this.selectedPeers.contains(Long.valueOf(peerDialogId))) {
                    this.selectedPeers.add(Long.valueOf(peerDialogId));
                }
            }
        }
        updateCount(true);
        headerCell.setAction(LocaleController.getString(z ? R.string.SelectAll : R.string.DeselectAll), new MediaActivity$$ExternalSyntheticLambda0(this, headerCell, z, 4));
        announceSelection(true);
        for (int i2 = 0; i2 < this.recyclerListView.getChildCount(); i2++) {
            View childAt = this.recyclerListView.getChildAt(i2);
            if (childAt instanceof GroupCreateUserCell) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ArrayList<Long> arrayList = this.selectedPeers;
                    Long l = (Long) tag;
                    l.getClass();
                    ((GroupCreateUserCell) childAt).setChecked(arrayList.contains(l), true);
                }
            }
        }
    }

    private void init() {
        long j;
        boolean zIsNotInChat;
        boolean z;
        this.escapedTitle = AndroidUtilities.replaceCharSequence("*", this.title, "✱");
        if (this.peers != null) {
            for (int i = 0; i < this.peers.size(); i++) {
                TLRPC.Peer peer = this.peers.get(i);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j = peer.user_id;
                    } else {
                        if (peer instanceof TLRPC.TL_peerChat) {
                            j = -peer.chat_id;
                            zIsNotInChat = ChatObject.isNotInChat(getBaseFragment().getMessagesController().getChat(Long.valueOf(-j)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j = -peer.channel_id;
                            zIsNotInChat = ChatObject.isNotInChat(getBaseFragment().getMessagesController().getChat(Long.valueOf(-j)));
                        } else {
                            j = 0;
                        }
                        z = !zIsNotInChat;
                        if (j == 0 && !this.deleting) {
                            if (z) {
                                this.alreadyJoined.add(Long.valueOf(j));
                            }
                            this.selectedPeers.add(Long.valueOf(j));
                        }
                    }
                    z = false;
                    if (j == 0) {
                    }
                }
            }
        }
        this.rowsCount = 1;
        this.titleRow = 0;
        ArrayList<TLRPC.Peer> arrayList = this.peers;
        if (arrayList == null || arrayList.isEmpty()) {
            this.sectionRow = -1;
            this.headerRow = -1;
            this.usersStartRow = -1;
            this.usersEndRow = -1;
        } else {
            int i2 = this.rowsCount;
            int i3 = i2 + 1;
            this.sectionRow = i2;
            int i4 = i2 + 2;
            this.rowsCount = i4;
            this.headerRow = i3;
            this.usersStartRow = i4;
            int size = this.peers.size() + i4;
            this.rowsCount = size;
            this.usersEndRow = size;
        }
        int i5 = this.rowsCount;
        this.rowsCount = i5 + 1;
        this.usersSectionRow = i5;
        ArrayList<TLRPC.Peer> arrayList2 = this.alreadyPeers;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.alreadyHeaderRow = -1;
            this.alreadyUsersStartRow = -1;
            this.alreadyUsersEndRow = -1;
            this.alreadySectionRow = -1;
        } else {
            int i6 = this.rowsCount;
            int i7 = i6 + 1;
            this.rowsCount = i7;
            this.alreadyHeaderRow = i6;
            this.alreadyUsersStartRow = i7;
            int size2 = this.alreadyPeers.size() + i7;
            this.alreadyUsersEndRow = size2;
            this.rowsCount = size2 + 1;
            this.alreadySectionRow = size2;
        }
        Button button = new Button(getContext(), "");
        this.button = button;
        button.setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 21));
        this.containerView.addView(this.button, LayoutHelper.createFrame(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view = new View(getContext());
        this.buttonShadow = view;
        view.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.containerView.addView(this.buttonShadow, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.recyclerListView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.button != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.bulletinContainer = frameLayout;
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        fixNavigationBar(Theme.getColor(null, Theme.key_dialogBackground, false));
        updateCount(false);
        this.actionBar.setTitle(getTitle());
    }

    public void lambda$deselectAll$21(HeaderCell headerCell, boolean z) {
        deselectAll(headerCell, !z);
    }

    public void lambda$init$5(View view) {
        onJoinButtonClicked();
    }

    public void lambda$onJoinButtonClicked$10(TLObject tLObject, Pair pair) {
        this.reqId = getBaseFragment().getConnectionsManager().sendRequest(tLObject, new ShareAlert$$ExternalSyntheticLambda13(8, this, pair));
    }

    public void lambda$onJoinButtonClicked$11(ArrayList arrayList, BaseFragment baseFragment) {
        if (this.updates != null || (this.invite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
            BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.folder_in, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, this.escapedTitle)), arrayList.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", this.alreadyJoined.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList.size(), new Object[0])).setDuration(5000).show();
        } else {
            BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, this.escapedTitle)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList.size(), new Object[0])).setDuration(5000).show();
        }
    }

    public static void lambda$onJoinButtonClicked$12(Utilities.Callback callback, INavigationLayout iNavigationLayout, Integer num) {
        callback.run(((ActionBarLayout) iNavigationLayout).getLastFragment());
    }

    public static void lambda$onJoinButtonClicked$14(DialogsActivity dialogsActivity, Integer num, Utilities.Callback callback, BaseFragment baseFragment) {
        dialogsActivity.scrollToFolder(num.intValue());
        AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda7(25, callback, baseFragment), 200L);
    }

    public static void lambda$onJoinButtonClicked$15(INavigationLayout iNavigationLayout, Utilities.Callback callback, Integer num) {
        List<BaseFragment> fragmentStack = ((ActionBarLayout) iNavigationLayout).getFragmentStack();
        boolean z = true;
        BaseFragment baseFragment = null;
        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
            baseFragment = fragmentStack.get(size);
            if ((baseFragment instanceof DialogsActivity) || (baseFragment instanceof MainTabsActivity)) {
                break;
            }
            if (z) {
                baseFragment.finishFragment();
                z = false;
            } else {
                baseFragment.removeSelfFromStack();
            }
        }
        BaseFragment baseFragment2 = baseFragment;
        BaseFragment dialogsActivity = baseFragment2 instanceof MainTabsActivity ? ((MainTabsActivity) baseFragment2).getDialogsActivity() : baseFragment2;
        if (!(dialogsActivity instanceof DialogsActivity)) {
            callback.run(baseFragment2);
            return;
        }
        DialogsActivity dialogsActivity2 = (DialogsActivity) dialogsActivity;
        dialogsActivity2.closeSearching();
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda1(10, dialogsActivity2, num, callback, baseFragment2), 80L);
    }

    public void lambda$onJoinButtonClicked$16(Utilities.Callback callback, int i, Boolean bool) {
        this.success = bool.booleanValue();
        lambda$showGiftOfferSheet$15();
        callback.run(Integer.valueOf(i));
    }

    public void lambda$onJoinButtonClicked$17(TLRPC.TL_error tL_error, TLObject tLObject, final Utilities.Callback callback) {
        final int i = -1;
        this.reqId = -1;
        if (!FilterCreateActivity.processErrors(tL_error, getBaseFragment(), BulletinFactory.of(getBaseFragment())) || tLObject == null) {
            this.button.setLoading(false);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            if (arrayList.isEmpty()) {
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateDialogFilter) {
                    i = ((TL_update.TL_updateDialogFilter) update).id;
                }
            } else {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (arrayList.get(i2) instanceof TL_update.TL_updateDialogFilter) {
                        i = ((TL_update.TL_updateDialogFilter) arrayList.get(i2)).id;
                        break;
                    }
                }
            }
        }
        if (this.invite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            getBaseFragment().getMessagesController().loadRemoteFilters(true, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$onJoinButtonClicked$16(callback, i, (Boolean) obj);
                }
            });
            return;
        }
        if (this.updates != null) {
            getBaseFragment().getMessagesController().checkChatlistFolderUpdate(this.filterId, true);
        }
        this.success = true;
        lambda$showGiftOfferSheet$15();
        callback.run(Integer.valueOf(i));
    }

    public void lambda$onJoinButtonClicked$18(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda1(11, this, tL_error, tLObject, callback));
    }

    public void lambda$onJoinButtonClicked$6(BaseFragment baseFragment, ArrayList arrayList) {
        this.reqId = -1;
        BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatString(R.string.FolderLinkDeletedTitle, this.title), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", arrayList.size(), new Object[0])).setDuration(5000).show();
        this.success = true;
        lambda$showGiftOfferSheet$15();
        getBaseFragment().getMessagesController().invalidateChatlistFolderUpdate(this.filterId);
    }

    public void lambda$onJoinButtonClicked$7(BaseFragment baseFragment, ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda1(this, baseFragment, arrayList, 24));
    }

    public void lambda$onJoinButtonClicked$8(Pair pair) {
        this.reqId = -1;
        ((Runnable) pair.first).run();
    }

    public void lambda$onJoinButtonClicked$9(Pair pair, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda7(26, this, pair));
    }

    public void lambda$onViewCreated$19(View view, int i) {
        int i2;
        String str;
        if (!(view instanceof GroupCreateUserCell) || (i2 = (i - 1) - this.usersStartRow) < 0 || i2 >= this.peers.size()) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(this.peers.get(i2));
        if (!this.selectedPeers.contains(Long.valueOf(peerDialogId))) {
            this.selectedPeers.add(Long.valueOf(peerDialogId));
            ((GroupCreateUserCell) view).setChecked(true, true);
        } else {
            if (this.alreadyJoined.contains(Long.valueOf(peerDialogId))) {
                int i3 = -this.shiftDp;
                this.shiftDp = i3;
                AndroidUtilities.shakeViewSpring(view, i3);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ArrayList arrayList = new ArrayList();
                if (peerDialogId >= 0) {
                    arrayList.add(getBaseFragment().getMessagesController().getUser(Long.valueOf(peerDialogId)));
                    str = "beep boop.";
                } else {
                    TLRPC.Chat chat = getBaseFragment().getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    String string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FolderLinkAlreadySubscribed) : LocaleController.getString(R.string.FolderLinkAlreadyJoined);
                    arrayList.add(chat);
                    str = string;
                }
                if (this.lastClickedDialogId != peerDialogId || System.currentTimeMillis() - this.lastClicked > 1500) {
                    this.lastClickedDialogId = peerDialogId;
                    this.lastClicked = System.currentTimeMillis();
                    BulletinFactory.of(this.bulletinContainer, null).createChatsBulletin(arrayList, str, null).setDuration(1500).show();
                    return;
                }
                return;
            }
            this.selectedPeers.remove(Long.valueOf(peerDialogId));
            ((GroupCreateUserCell) view).setChecked(false, true);
        }
        updateCount(true);
        updateHeaderCell(true);
        announceSelection(false);
    }

    public static void lambda$showForDeletion$0(BaseFragment baseFragment, TLObject tLObject, int i, Utilities.Callback callback) {
        FolderBottomSheet folderBottomSheet;
        if (baseFragment.getParentActivity() == null) {
            return;
        }
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < vector.objects.size(); i2++) {
                try {
                    arrayList.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i2))));
                } catch (Exception unused) {
                }
            }
            folderBottomSheet = new FolderBottomSheet(baseFragment, i, arrayList);
        } else {
            folderBottomSheet = new FolderBottomSheet(baseFragment, i, (List<Long>) null);
        }
        folderBottomSheet.setOnDone(callback);
        baseFragment.showDialog(folderBottomSheet);
    }

    public static void lambda$showForDeletion$1(BaseFragment baseFragment, int i, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ShareTopView$$ExternalSyntheticLambda3(baseFragment, tLObject, i, callback, 7));
    }

    public static void lambda$showForDeletion$2(int i, BaseFragment baseFragment, Utilities.Callback callback) {
        TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = i;
        baseFragment.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new ShareTopView$$ExternalSyntheticLambda0(baseFragment, i, callback, 1));
    }

    public static void lambda$showForDeletion$3(Utilities.Callback callback, AlertDialog alertDialog, int i) {
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }

    public void lambda$updateHeaderCell$20(boolean z) {
        deselectAll(this.headerCell, z);
    }

    private void onJoinButtonClicked() {
        TLObject tLObject;
        Button button = this.button;
        if (button == null || !button.isLoading()) {
            ArrayList<TLRPC.Peer> arrayList = this.peers;
            if (arrayList == null) {
                lambda$showGiftOfferSheet$15();
                return;
            }
            if (arrayList.isEmpty() && !this.deleting) {
                lambda$showGiftOfferSheet$15();
                return;
            }
            if (this.selectedPeers.isEmpty() && (this.invite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                Button button2 = this.button;
                int i = -this.shiftDp;
                this.shiftDp = i;
                AndroidUtilities.shakeViewSpring(button2, i);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < this.peers.size(); i2++) {
                long peerDialogId = DialogObject.getPeerDialogId(this.peers.get(i2));
                if (this.selectedPeers.contains(Long.valueOf(peerDialogId))) {
                    arrayList2.add(getBaseFragment().getMessagesController().getInputPeer(peerDialogId));
                }
            }
            UndoView undoView = null;
            if (this.deleting) {
                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = this.filterId;
                tL_chatlists_leaveChatlist.peers.addAll(arrayList2);
                tLObject = tL_chatlists_leaveChatlist;
            } else if (this.updates != null) {
                if (arrayList2.isEmpty()) {
                    TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                    TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                    tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                    tL_inputChatlistDialogFilter2.filter_id = this.filterId;
                    getBaseFragment().getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                    getBaseFragment().getMessagesController().invalidateChatlistFolderUpdate(this.filterId);
                    lambda$showGiftOfferSheet$15();
                    return;
                }
                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                tL_inputChatlistDialogFilter3.filter_id = this.filterId;
                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList2);
                tLObject = tL_chatlists_joinChatlistUpdates;
            } else {
                if ((this.invite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList2.isEmpty()) {
                    lambda$showGiftOfferSheet$15();
                    return;
                }
                TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                tL_chatlists_joinChatlistInvite.slug = this.slug;
                tL_chatlists_joinChatlistInvite.peers.addAll(arrayList2);
                tLObject = tL_chatlists_joinChatlistInvite;
            }
            INavigationLayout parentLayout = getBaseFragment().getParentLayout();
            if (!this.deleting) {
                if (parentLayout != null) {
                    ScrimOptions$$ExternalSyntheticLambda8 scrimOptions$$ExternalSyntheticLambda8 = new ScrimOptions$$ExternalSyntheticLambda8(11, this, arrayList2);
                    FolderBottomSheet$$ExternalSyntheticLambda12 folderBottomSheet$$ExternalSyntheticLambda12 = this.updates != null ? new FolderBottomSheet$$ExternalSyntheticLambda12(scrimOptions$$ExternalSyntheticLambda8, parentLayout) : new FolderBottomSheet$$ExternalSyntheticLambda12(parentLayout, scrimOptions$$ExternalSyntheticLambda8);
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        if (!this.alreadyJoined.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList2.get(i3))))) {
                            boolean[] zArr = new boolean[1];
                            getBaseFragment().getMessagesController().ensureFolderDialogExists(1, zArr);
                            if (!zArr[0]) {
                                break;
                            }
                            getBaseFragment().getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                            break;
                        }
                    }
                    this.button.setLoading(true);
                    this.reqId = getBaseFragment().getConnectionsManager().sendRequest(tLObject, new ShareAlert$$ExternalSyntheticLambda13(7, this, folderBottomSheet$$ExternalSyntheticLambda12));
                    return;
                }
                return;
            }
            if (parentLayout != null) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout;
                BaseFragment lastFragment = actionBarLayout.getLastFragment();
                if (lastFragment instanceof ChatActivity) {
                    undoView = ((ChatActivity) lastFragment).getUndoView();
                } else if (lastFragment instanceof DialogsActivity) {
                    undoView = ((DialogsActivity) lastFragment).getUndoView();
                } else if (lastFragment instanceof FiltersSetupActivity) {
                    undoView = ((FiltersSetupActivity) lastFragment).getUndoView();
                } else if (lastFragment instanceof FilterCreateActivity) {
                    List<BaseFragment> fragmentStack = actionBarLayout.getFragmentStack();
                    if (fragmentStack.size() >= 2 && (RendererCapabilities.CC.m(2, fragmentStack) instanceof FiltersSetupActivity)) {
                        FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) RendererCapabilities.CC.m(2, fragmentStack);
                        lastFragment.finishFragment();
                        undoView = filtersSetupActivity.getUndoView();
                    }
                }
                UndoView undoView2 = undoView;
                if (undoView2 == null) {
                    this.button.setLoading(true);
                    this.reqId = getBaseFragment().getConnectionsManager().sendRequest(tLObject, new StickersAlert$$ExternalSyntheticLambda28(this, lastFragment, arrayList2, 3));
                    return;
                }
                ArrayList<Long> arrayList3 = new ArrayList<>();
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    arrayList3.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList2.get(i4))));
                }
                Pair<Runnable, Runnable> pairRemoveFolderTemporarily = getBaseFragment().getMessagesController().removeFolderTemporarily(this.filterId, arrayList3);
                undoView2.showWithAction(0L, 88, this.title, Integer.valueOf(arrayList2.size()), new ImageUpdater$$ExternalSyntheticLambda1(this, tLObject, pairRemoveFolderTemporarily, 23), (Runnable) pairRemoveFolderTemporarily.second);
                this.success = true;
                lambda$showGiftOfferSheet$15();
                getBaseFragment().getMessagesController().invalidateChatlistFolderUpdate(this.filterId);
            }
        }
    }

    public static void showForDeletion(BaseFragment baseFragment, int i, Utilities.Callback<Boolean> callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = baseFragment.getMessagesController().dialogFilters;
        if (arrayList == null) {
            dialogFilter = null;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                dialogFilter = null;
                break;
            } else {
                if (arrayList.get(i2).id == i) {
                    dialogFilter = arrayList.get(i2);
                    break;
                }
                i2++;
            }
        }
        SlotsDrawable$$ExternalSyntheticLambda9 slotsDrawable$$ExternalSyntheticLambda9 = new SlotsDrawable$$ExternalSyntheticLambda9(i, baseFragment, callback, 14);
        if (dialogFilter == null || !dialogFilter.isMyChatlist()) {
            slotsDrawable$$ExternalSyntheticLambda9.run();
            return;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(baseFragment.getContext(), 0, null).setTitle(LocaleController.getString(R.string.FilterDelete)).setMessage(LocaleController.getString(R.string.FilterDeleteAlertLinks)).setNegativeButton(LocaleController.getString(R.string.Cancel), new FolderBottomSheet$$ExternalSyntheticLambda6(callback)).setPositiveButton(LocaleController.getString(R.string.Delete), new ColorPicker$$ExternalSyntheticLambda5(slotsDrawable$$ExternalSyntheticLambda9, 3)).create();
        baseFragment.showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public void updateHeaderCell(boolean z) {
        HeaderCell headerCell = this.headerCell;
        if (headerCell == null) {
            return;
        }
        if (this.deleting) {
            headerCell.setText(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", this.peers.size(), new Object[0]), false);
        } else {
            headerCell.setText(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", this.peers.size(), new Object[0]), false);
        }
        ArrayList<TLRPC.Peer> arrayList = this.peers;
        if (arrayList == null || arrayList.size() - this.alreadyJoined.size() <= 1) {
            this.headerCell.setAction("", null);
        } else {
            boolean z2 = this.selectedPeers.size() >= this.peers.size() - this.alreadyJoined.size();
            this.headerCell.setAction(LocaleController.getString(z2 ? R.string.DeselectAll : R.string.SelectAll), new MediaActivity$$ExternalSyntheticLambda5(this, z2, 7));
        }
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new RecyclerListView.SelectionAdapter() {
            private static final int VIEW_TYPE_HEADER = 3;
            private static final int VIEW_TYPE_HINT = 1;
            private static final int VIEW_TYPE_TITLE = 0;
            private static final int VIEW_TYPE_USER = 2;

            @Override
            public int getItemCount() {
                return FolderBottomSheet.this.rowsCount;
            }

            @Override
            public int getItemViewType(int i) {
                if (i == FolderBottomSheet.this.titleRow) {
                    return 0;
                }
                if (i == FolderBottomSheet.this.sectionRow || i == FolderBottomSheet.this.usersSectionRow || i == FolderBottomSheet.this.alreadySectionRow) {
                    return 1;
                }
                return (i == FolderBottomSheet.this.headerRow || i == FolderBottomSheet.this.alreadyHeaderRow) ? 3 : 2;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 2 && viewHolder.getAdapterPosition() >= FolderBottomSheet.this.usersStartRow && viewHolder.getAdapterPosition() <= FolderBottomSheet.this.usersEndRow;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                TLRPC.Peer peer;
                long j;
                String userName;
                String string;
                String string2;
                TLRPC.Chat chat;
                int itemViewType = viewHolder.getItemViewType();
                Object obj = null;
                if (itemViewType != 2) {
                    if (itemViewType == 3) {
                        HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                        if (i == FolderBottomSheet.this.alreadyHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                            headerCell.setAction("", null);
                            return;
                        } else {
                            FolderBottomSheet.this.headerCell = headerCell;
                            FolderBottomSheet.this.updateHeaderCell(false);
                            return;
                        }
                    }
                    if (itemViewType != 1) {
                        if (itemViewType == 0) {
                            FolderBottomSheet.this.titleCell = (TitleCell) viewHolder.itemView;
                            FolderBottomSheet.this.updateCount(false);
                            return;
                        }
                        return;
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    textInfoPrivacyCell.setForeground(Theme.getThemedDrawableByKey(FolderBottomSheet.this.getContext(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    if (i == FolderBottomSheet.this.alreadySectionRow || i == FolderBottomSheet.this.sectionRow || FolderBottomSheet.this.peers == null || FolderBottomSheet.this.peers.isEmpty()) {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText("");
                        return;
                    }
                    textInfoPrivacyCell.setFixedSize(0);
                    if (FolderBottomSheet.this.deleting) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.FolderLinkHint));
                        return;
                    }
                }
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
                if (i < FolderBottomSheet.this.usersStartRow || i > FolderBottomSheet.this.usersEndRow) {
                    if (i < FolderBottomSheet.this.alreadyUsersStartRow || i > FolderBottomSheet.this.alreadyUsersEndRow || FolderBottomSheet.this.alreadyPeers == null) {
                        peer = null;
                    } else {
                        peer = (TLRPC.Peer) FolderBottomSheet.this.alreadyPeers.get(i - FolderBottomSheet.this.alreadyUsersStartRow);
                    }
                } else if (FolderBottomSheet.this.peers != null) {
                    peer = (TLRPC.Peer) FolderBottomSheet.this.peers.get(i - FolderBottomSheet.this.usersStartRow);
                } else {
                    peer = null;
                }
                if (peer == null) {
                    j = 0;
                    userName = null;
                    string = null;
                } else if (peer instanceof TLRPC.TL_peerUser) {
                    j = peer.user_id;
                    TLRPC.User user = FolderBottomSheet.this.getBaseFragment().getMessagesController().getUser(Long.valueOf(peer.user_id));
                    userName = UserObject.getUserName(user);
                    if (user == null || !user.bot) {
                        string = LocaleController.getString(R.string.FilterInviteUser);
                        obj = user;
                    } else {
                        string = LocaleController.getString(R.string.FilterInviteBot);
                        obj = user;
                    }
                } else {
                    if (peer instanceof TLRPC.TL_peerChat) {
                        j = -peer.chat_id;
                        chat = FolderBottomSheet.this.getBaseFragment().getMessagesController().getChat(Long.valueOf(peer.chat_id));
                    } else if (peer instanceof TLRPC.TL_peerChannel) {
                        j = -peer.channel_id;
                        chat = FolderBottomSheet.this.getBaseFragment().getMessagesController().getChat(Long.valueOf(peer.channel_id));
                    } else {
                        j = 0;
                        userName = null;
                        string = null;
                    }
                    string = null;
                    obj = chat;
                    userName = null;
                }
                if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                    String str = chat2.title;
                    if (chat2.participants_count != 0) {
                        string2 = ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count) : LocaleController.formatPluralStringComma("Members", chat2.participants_count);
                    } else {
                        string2 = ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.getString(R.string.ChannelPublic) : LocaleController.getString(R.string.MegaPublic);
                    }
                    string = string2;
                    userName = str;
                }
                groupCreateUserCell.setTag(Long.valueOf(j));
                groupCreateUserCell.getCheckBox().getCheckBoxBase().setAlpha(FolderBottomSheet.this.alreadyJoined.contains(Long.valueOf(j)) ? 0.5f : 1.0f);
                groupCreateUserCell.setChecked(FolderBottomSheet.this.selectedPeers.contains(Long.valueOf(j)), false);
                groupCreateUserCell.setObject(obj, userName, string);
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View headerCell;
                if (i == 0) {
                    FolderBottomSheet folderBottomSheet = FolderBottomSheet.this;
                    FolderBottomSheet folderBottomSheet2 = FolderBottomSheet.this;
                    headerCell = folderBottomSheet.titleCell = folderBottomSheet2.new TitleCell(folderBottomSheet2.getContext(), (FolderBottomSheet.this.invite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || FolderBottomSheet.this.updates != null, FolderBottomSheet.this.escapedTitle, FolderBottomSheet.this.titleEntities, FolderBottomSheet.this.titleNoanimate);
                } else if (i == 1) {
                    headerCell = new TextInfoPrivacyCell(FolderBottomSheet.this.getContext(), 24, null);
                    headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                } else if (i == 2) {
                    GroupCreateUserCell groupCreateUserCell = new GroupCreateUserCell(1, 0, FolderBottomSheet.this.getContext(), null, false, false);
                    groupCreateUserCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    headerCell = groupCreateUserCell;
                } else if (i == 3) {
                    headerCell = new HeaderCell(FolderBottomSheet.this.getContext());
                    headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                } else {
                    headerCell = null;
                }
                return new RecyclerListView.Holder(headerCell);
            }
        };
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        if (this.reqId >= 0) {
            getBaseFragment().getConnectionsManager().cancelRequest(this.reqId, true);
        }
        Utilities.Callback<Boolean> callback = this.onDone;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.success));
            this.onDone = null;
        }
    }

    @Override
    public CharSequence getTitle() {
        if (this.deleting) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.invite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList<TLRPC.Peer> arrayList = this.peers;
        return (arrayList == null || arrayList.isEmpty()) ? LocaleController.getString(R.string.FolderLinkTitleAlready) : LocaleController.getString(R.string.FolderLinkTitleAddChats);
    }

    @Override
    public void onViewCreated(FrameLayout frameLayout) {
        super.onViewCreated(frameLayout);
        this.recyclerListView.setOverScrollMode(2);
        this.recyclerListView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.button != null ? 68.0f : 0.0f));
        this.recyclerListView.setOnItemClickListener(new StarAppsSheet$$ExternalSyntheticLambda0(this, 9));
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public void setOnDone(Utilities.Callback<Boolean> callback) {
        this.onDone = callback;
    }

    public void updateCount(boolean z) {
        int size = this.selectedPeers.size();
        Button button = this.button;
        if (button != null) {
            if (this.deleting) {
                button.setText(LocaleController.getString(size > 0 ? R.string.FolderLinkButtonRemoveChats : R.string.FolderLinkButtonRemove), z);
            } else {
                ArrayList<TLRPC.Peer> arrayList = this.peers;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.button.setText(LocaleController.getString(R.string.OK), z);
                } else if (this.invite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                    this.button.setText(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.title, this.button.getTextPaint().getFontMetricsInt(), false), this.titleEntities, this.button.getTextPaint().getFontMetricsInt())), z);
                    this.button.setEmojiCacheType(this.titleNoanimate ? 26 : 0);
                } else {
                    this.button.setText(size > 0 ? LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]) : LocaleController.getString(R.string.FolderLinkButtonNone), z);
                }
            }
            this.button.setCount(size, z);
            if (this.invite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.button.setEnabled(true ^ this.selectedPeers.isEmpty());
            }
        }
        TitleCell titleCell = this.titleCell;
        if (titleCell != null) {
            titleCell.setSelectedCount(size, z);
        }
    }

    public FolderBottomSheet(BaseFragment baseFragment, int i, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(baseFragment, false, false);
        this.filterId = -1;
        this.title = "";
        this.titleEntities = new ArrayList<>();
        this.escapedTitle = "";
        this.alreadyJoined = new ArrayList<>();
        ArrayList<Long> arrayList = new ArrayList<>();
        this.selectedPeers = arrayList;
        this.reqId = -1;
        this.shiftDp = -5;
        this.filterId = i;
        this.updates = tL_chatlists_chatlistUpdates;
        arrayList.clear();
        this.peers = tL_chatlists_chatlistUpdates.missing_peers;
        ArrayList<MessagesController.DialogFilter> arrayList2 = baseFragment.getMessagesController().dialogFilters;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (arrayList2.get(i2).id == i) {
                    this.title = arrayList2.get(i2).name;
                    break;
                }
            }
        }
        init();
    }

    public FolderBottomSheet(BaseFragment baseFragment, String str, TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite) {
        super(baseFragment, false, false);
        this.filterId = -1;
        this.title = "";
        this.titleEntities = new ArrayList<>();
        this.escapedTitle = "";
        this.alreadyJoined = new ArrayList<>();
        ArrayList<Long> arrayList = new ArrayList<>();
        this.selectedPeers = arrayList;
        this.reqId = -1;
        this.shiftDp = -5;
        this.slug = str;
        this.invite = chatlist_chatlistinvite;
        arrayList.clear();
        if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite.title;
            this.title = tL_textWithEntities.text;
            this.titleEntities = tL_textWithEntities.entities;
            this.titleNoanimate = tL_chatlists_chatlistInvite.title_noanimate;
            this.peers = tL_chatlists_chatlistInvite.peers;
        } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
            TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
            this.peers = tL_chatlists_chatlistInviteAlready.missing_peers;
            this.alreadyPeers = tL_chatlists_chatlistInviteAlready.already_peers;
            this.filterId = tL_chatlists_chatlistInviteAlready.filter_id;
            ArrayList<MessagesController.DialogFilter> arrayList2 = baseFragment.getMessagesController().dialogFilters;
            if (arrayList2 != null) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    MessagesController.DialogFilter dialogFilter = arrayList2.get(i);
                    if (dialogFilter.id == this.filterId) {
                        this.title = dialogFilter.name;
                        this.titleEntities = dialogFilter.entities;
                        this.titleNoanimate = dialogFilter.title_noanimate;
                        break;
                    }
                }
            }
        }
        init();
    }
}
