package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.android.billingclient.api.AccountIdentifiers;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import com.google.android.gms.internal.mlkit_vision_label.zzdq;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BatchParticlesDrawHelper;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CompatDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EffectsTextView;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Shaker;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.blur3.utils.NinePatchBuilder$NinePathRenderer;
import org.telegram.ui.ComposeDrawable$$ExternalSyntheticLambda0;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda42;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda174;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda177;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda14;
import org.telegram.ui.QrActivity$5$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.StarGiftPatterns;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.bots.AffiliateProgramFragment;

public final class GiftSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public int TAB_ALL;
    public int TAB_COLLECTIBLES;
    public int TAB_MY_GIFTS;
    public UniversalAdapter adapter;
    public final StarsIntroActivity.StarsBalanceView balanceView;
    public boolean birthday;
    public final Utilities.Callback closeParentSheet;
    public final int currentAccount;
    public final long dialogId;
    public final AnonymousClass6 itemAnimator;
    public final ExtendedGridLayoutManager layoutManager;
    public final StarsController.GiftsList myGifts;
    public final String name;
    public ArrayList options;
    public final FrameLayout premiumHeaderView;
    public final ArrayList premiumTiers;
    public int selectedTab;
    public final boolean self;
    public boolean shownCollectiblesInfo;
    public final LinearLayout starsHeaderView;
    public final AnonymousClass3 subtitleCollectiblesStarsView;
    public final AnonymousClass2 subtitleStarsView;
    public final AnonymousClass1 topView;
    public TLRPC.DisallowedGiftsSettings userSettings;

    public final class AnonymousClass1 extends FrameLayout {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
        }
    }

    public final class AnonymousClass2 extends LinkSpanDrawable.LinksTextView {
        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (getAlpha() < 0.95f) {
                return false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public final class AnonymousClass3 extends LinkSpanDrawable.LinksTextView {
        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (getAlpha() < 0.95f) {
                return false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public final class AnonymousClass6 extends DefaultItemAnimator {
        @Override
        public final float animateByScale(View view) {
            return 0.3f;
        }
    }

    public final class AnonymousClass8 extends StarGiftSheet {
        public AnonymousClass8(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
            super(i, context, resourcesProvider, j, null);
        }

        @Override
        public final BulletinFactory getBulletinFactory() {
            GiftSheet giftSheet = GiftSheet.this;
            return new BulletinFactory(giftSheet.container, giftSheet.resourcesProvider);
        }
    }

    public final class CardBackground extends Drawable {
        public static SharedBackgroundDrawables staticSharedBackgroundDrawables = new SharedBackgroundDrawables();
        public final AnimatedFloat animatedSelected;
        public TL_stars.starGiftAttributeBackdrop backdrop;
        public final Path clipPath;
        public RadialGradient gradient;
        public final Matrix gradientMatrix;
        public int gradientRadius;
        public Bitmap lastDrawnBitmap;
        public Paint lastDrawnBitmapPaint;
        public int lastDrawnColor;
        public boolean lastNeedShadow;
        public final Paint paint;
        public final AnonymousClass1 pattern;
        public long patternDocumentId;
        public float r;
        public final RectF rect;
        public final Theme.ResourcesProvider resourcesProvider;
        public boolean selected;
        public Integer selectedColor;
        public int selectedColorKey;
        public final Paint selectedPaint;
        public int selectionStyle;
        public int[] strokeColors;
        public LinearGradient strokeGradient;
        public final Matrix strokeGradientMatrix;
        public final Paint strokePaint;
        public final ViewGroup view;
        public boolean withPadding;
        public final boolean withShadow;

        public CardBackground(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, boolean z) {
            Paint paint = new Paint(1);
            this.paint = paint;
            Paint paint2 = new Paint(1);
            this.strokePaint = paint2;
            this.rect = new RectF();
            this.clipPath = new Path();
            this.gradientMatrix = new Matrix();
            new Path();
            this.strokeGradientMatrix = new Matrix();
            Paint paint3 = new Paint(1);
            this.selectedPaint = paint3;
            this.animatedSelected = new AnimatedFloat(new ComposeDrawable$$ExternalSyntheticLambda0(this, 29), 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.r = AndroidUtilities.dp(11.0f);
            this.withPadding = true;
            this.selectionStyle = 0;
            int i = Theme.key_windowBackgroundWhite;
            this.selectedColorKey = i;
            this.view = viewGroup;
            this.resourcesProvider = resourcesProvider;
            ?? r5 = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(viewGroup, AndroidUtilities.dp(28.0f)) {
                @Override
                public final void invalidate() {
                    super.invalidate();
                    Drawable drawable = CardBackground.this;
                    if (drawable.getCallback() != null) {
                        drawable.getCallback().invalidateDrawable(drawable);
                    }
                }
            };
            this.pattern = r5;
            viewGroup.addOnAttachStateChangeListener(new AvatarSpan.AnonymousClass1(this, 10));
            if (viewGroup.isAttachedToWindow()) {
                r5.attach();
            }
            this.withShadow = z;
            paint.setColor(Theme.getColor(i, resourcesProvider));
            if (this.lastNeedShadow != z) {
                this.lastNeedShadow = z;
                if (z) {
                    paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), Theme.getColor(Theme.key_dialogCardShadow, resourcesProvider));
                } else {
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
            }
            Paint.Style style = Paint.Style.STROKE;
            paint3.setStyle(style);
            paint2.setStyle(style);
        }

        @Override
        public final void draw(Canvas canvas) {
            draw(canvas, 0.0f);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final boolean getPadding(Rect rect) {
            rect.set(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
            return true;
        }

        public final void invalidate() {
            this.view.invalidate();
            if (getCallback() != null) {
                getCallback().invalidateDrawable(this);
            }
        }

        @Override
        public final void setAlpha(int i) {
        }

        public final void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
            if (this.backdrop != stargiftattributebackdrop) {
                this.gradient = null;
            }
            this.backdrop = stargiftattributebackdrop;
            invalidate();
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final void setPattern(TL_stars.starGiftAttributePattern stargiftattributepattern) {
            this.patternDocumentId = 0L;
            AnonymousClass1 anonymousClass1 = this.pattern;
            if (stargiftattributepattern == null) {
                anonymousClass1.set((Drawable) null, false);
                return;
            }
            anonymousClass1.set(stargiftattributepattern.document, anonymousClass1.cacheType, false);
            TLRPC.Document document = stargiftattributepattern.document;
            if (document != null) {
                this.patternDocumentId = document.id;
            }
        }

        public final void setSelected(boolean z, boolean z2) {
            if (this.selected == z) {
                return;
            }
            this.selected = z;
            if (!z2) {
                this.animatedSelected.force(z);
            }
            invalidate();
        }

        public final void setStrokeColors(int[] iArr) {
            if (this.strokeColors == iArr) {
                return;
            }
            this.strokeColors = iArr;
            this.strokeGradient = null;
            invalidate();
        }

        public final void draw(Canvas canvas, float f) {
            float f2;
            char c;
            int i;
            float f3;
            Bitmap bitmap;
            Bitmap bitmap2;
            NinePatchDrawable ninePatchDrawable;
            Canvas canvas2 = canvas;
            Rect bounds = getBounds();
            float f4 = this.animatedSelected.set(this.selected);
            RectF rectF = this.rect;
            rectF.set(bounds);
            if (this.withPadding) {
                rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
            }
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop;
            Paint paint = this.paint;
            if (stargiftattributebackdrop != null) {
                int iLerp = AndroidUtilities.lerp(Math.min(bounds.width(), bounds.height()), Math.max(bounds.width(), bounds.height()), 0.35f) / 2;
                if (this.gradient == null || this.gradientRadius != iLerp) {
                    this.gradientRadius = iLerp;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.backdrop;
                    int i2 = stargiftattributebackdrop2.center_color | (-16777216);
                    this.gradient = new RadialGradient(0.0f, 0.0f, iLerp, new int[]{i2, i2, stargiftattributebackdrop2.edge_color | (-16777216)}, new float[]{0.0f, 0.0f, 1.0f}, Shader.TileMode.CLAMP);
                }
                Matrix matrix = this.gradientMatrix;
                matrix.reset();
                matrix.postTranslate(bounds.centerX(), Math.min(AndroidUtilities.dp(50.0f), bounds.centerY()));
                this.gradient.setLocalMatrix(matrix);
                paint.setShader(this.gradient);
            } else {
                paint.setShader(null);
            }
            int i3 = Theme.key_dialogCardShadow;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            final int color = Theme.getColor(i3, resourcesProvider);
            int i4 = Theme.key_windowBackgroundWhite;
            final int color2 = Theme.getColor(i4, resourcesProvider);
            final int i5 = 0;
            boolean z = this.r == ((float) AndroidUtilities.dp(11.0f)) && color == Theme.getColor(null, i3, false) && color2 == Theme.getColor(null, i4, false);
            boolean z2 = this.withShadow;
            boolean z3 = z2 && !z;
            if (this.lastNeedShadow != z3) {
                this.lastNeedShadow = z3;
                if (z3) {
                    paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), Theme.getColor(i3, resourcesProvider));
                } else {
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
            }
            if (z) {
                if (staticSharedBackgroundDrawables == null) {
                    staticSharedBackgroundDrawables = new SharedBackgroundDrawables();
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                if (this.backdrop != null) {
                    if (z2) {
                        SharedBackgroundDrawables sharedBackgroundDrawables = staticSharedBackgroundDrawables;
                        if (sharedBackgroundDrawables.shadowNinePatch == null || sharedBackgroundDrawables.lastShadowColor != color) {
                            sharedBackgroundDrawables.lastShadowColor = color;
                            final float fDp = AndroidUtilities.dp(1.66f);
                            final float fDp2 = AndroidUtilities.dp(0.33f);
                            f2 = 0.0f;
                            sharedBackgroundDrawables.shadowNinePatch = zzdq.createNinePatch(sharedBackgroundDrawables.shadowNinePatchBitmap, sharedBackgroundDrawables.radii, fDp, fDp2, 0, new NinePatchBuilder$NinePathRenderer() {
                                @Override
                                public final void draw(Canvas canvas3, RectF rectF2, float[] fArr) {
                                    Path path = new Path();
                                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                                    Paint paint2 = new Paint(1);
                                    paint2.setStyle(Paint.Style.FILL);
                                    paint2.setColor(i5);
                                    float f5 = fDp;
                                    if (f5 > 0.0f) {
                                        paint2.setShadowLayer(f5, 0.0f, fDp2, color);
                                    }
                                    canvas3.drawPath(path, paint2);
                                    if (f5 > 0.0f) {
                                        paint2.clearShadowLayer();
                                        canvas3.drawPath(path, paint2);
                                    }
                                }
                            });
                        } else {
                            f2 = 0.0f;
                        }
                        NinePatchDrawable ninePatchDrawable2 = sharedBackgroundDrawables.shadowNinePatch;
                        Rect rect2 = DrawableUtils.tmpRect;
                        if (ninePatchDrawable2.getPadding(rect2)) {
                            ninePatchDrawable2.setBounds(rect.left - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
                        } else {
                            ninePatchDrawable2.setBounds(rect);
                        }
                        ninePatchDrawable2.draw(canvas2);
                    } else {
                        f2 = 0.0f;
                    }
                    float f5 = this.r;
                    canvas2.drawRoundRect(rectF, f5, f5, paint);
                } else {
                    f2 = 0.0f;
                    if (z2) {
                        SharedBackgroundDrawables sharedBackgroundDrawables2 = staticSharedBackgroundDrawables;
                        if (sharedBackgroundDrawables2.filledWithShadowNinePatch == null || (sharedBackgroundDrawables2.lastFillingWithShadowFillingColor != color2 && sharedBackgroundDrawables2.lastFillingWithShadowShadowColor != color)) {
                            sharedBackgroundDrawables2.lastFillingWithShadowFillingColor = color2;
                            sharedBackgroundDrawables2.lastFillingWithShadowShadowColor = color;
                            final float fDp3 = AndroidUtilities.dp(1.66f);
                            final float fDp4 = AndroidUtilities.dp(0.33f);
                            sharedBackgroundDrawables2.filledWithShadowNinePatch = zzdq.createNinePatch(sharedBackgroundDrawables2.filledWithShadowNinePatchBitmap, sharedBackgroundDrawables2.radii, fDp3, fDp4, color2, new NinePatchBuilder$NinePathRenderer() {
                                @Override
                                public final void draw(Canvas canvas3, RectF rectF2, float[] fArr) {
                                    Path path = new Path();
                                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                                    Paint paint2 = new Paint(1);
                                    paint2.setStyle(Paint.Style.FILL);
                                    paint2.setColor(color2);
                                    float f6 = fDp3;
                                    if (f6 > 0.0f) {
                                        paint2.setShadowLayer(f6, 0.0f, fDp4, color);
                                    }
                                    canvas3.drawPath(path, paint2);
                                    if (f6 > 0.0f) {
                                        paint2.clearShadowLayer();
                                        canvas3.drawPath(path, paint2);
                                    }
                                }
                            });
                        }
                        ninePatchDrawable = sharedBackgroundDrawables2.filledWithShadowNinePatch;
                    } else {
                        SharedBackgroundDrawables sharedBackgroundDrawables3 = staticSharedBackgroundDrawables;
                        if (sharedBackgroundDrawables3.filledNinePatch == null || sharedBackgroundDrawables3.lastFillingColor != color2) {
                            sharedBackgroundDrawables3.lastFillingColor = color2;
                            final float f6 = 0.0f;
                            final float f7 = 0.0f;
                            sharedBackgroundDrawables3.filledNinePatch = zzdq.createNinePatch(sharedBackgroundDrawables3.filledNinePatchBitmap, sharedBackgroundDrawables3.radii, 0.0f, 0.0f, color2, new NinePatchBuilder$NinePathRenderer() {
                                @Override
                                public final void draw(Canvas canvas3, RectF rectF2, float[] fArr) {
                                    Path path = new Path();
                                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                                    Paint paint2 = new Paint(1);
                                    paint2.setStyle(Paint.Style.FILL);
                                    paint2.setColor(color2);
                                    float f8 = f6;
                                    if (f8 > 0.0f) {
                                        paint2.setShadowLayer(f8, 0.0f, f7, i5);
                                    }
                                    canvas3.drawPath(path, paint2);
                                    if (f8 > 0.0f) {
                                        paint2.clearShadowLayer();
                                        canvas3.drawPath(path, paint2);
                                    }
                                }
                            });
                        }
                        ninePatchDrawable = sharedBackgroundDrawables3.filledNinePatch;
                    }
                    Rect rect3 = DrawableUtils.tmpRect;
                    if (ninePatchDrawable.getPadding(rect3)) {
                        ninePatchDrawable.setBounds(rect.left - rect3.left, rect.top - rect3.top, rect.right + rect3.right, rect.bottom + rect3.bottom);
                    } else {
                        ninePatchDrawable.setBounds(rect);
                    }
                    ninePatchDrawable.draw(canvas2);
                }
            } else {
                f2 = 0.0f;
                float f8 = this.r;
                canvas2.drawRoundRect(rectF, f8, f8, paint);
            }
            int[] iArr = this.strokeColors;
            AnonymousClass1 anonymousClass1 = this.pattern;
            boolean z4 = (iArr == null && (this.backdrop == null || anonymousClass1.isEmpty())) ? false : true;
            if (z4) {
                canvas2.save();
                Path path = this.clipPath;
                path.rewind();
                float f9 = this.r;
                path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
                canvas2.clipPath(path);
            }
            if (this.strokeColors != null) {
                if (this.strokeGradient == null) {
                    this.strokeGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, this.strokeColors, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                }
                Matrix matrix2 = this.strokeGradientMatrix;
                matrix2.reset();
                matrix2.postTranslate(bounds.left, bounds.top);
                matrix2.postRotate((float) ((Math.atan2(bounds.height(), bounds.width()) / 3.141592653589793d) * 180.0d));
                c = 0;
                float fSqrt = ((float) Math.sqrt(Math.pow(bounds.height(), 2.0d) + Math.pow(bounds.width(), 2.0d))) / 100.0f;
                matrix2.postScale(fSqrt, fSqrt);
                this.strokeGradient.setLocalMatrix(matrix2);
                Paint paint2 = this.strokePaint;
                paint2.setShader(this.strokeGradient);
                paint2.setStrokeWidth(AndroidUtilities.dp(4.66f));
                float f10 = this.r;
                canvas2.drawRoundRect(rectF, f10, f10, paint2);
            } else {
                c = 0;
            }
            if (this.backdrop == null || anonymousClass1.isEmpty()) {
                i = 1;
            } else {
                int i6 = this.backdrop.pattern_color | (-16777216);
                canvas2.save();
                canvas2.translate(bounds.centerX(), bounds.centerY());
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 29) {
                    Drawable drawable = anonymousClass1.drawables[c];
                    if (drawable != null && anonymousClass1.changeProgress.value == 1.0f && (drawable instanceof AnimatedEmojiDrawable)) {
                        AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) drawable;
                        PhotoViewer.AnonymousClass11 anonymousClass11 = animatedEmojiDrawable.imageReceiver;
                        long documentId = animatedEmojiDrawable.getDocumentId();
                        if (anonymousClass11 != null) {
                            f3 = -31.0f;
                            if (documentId != this.patternDocumentId || (bitmap = anonymousClass11.getBitmap()) == null) {
                            }
                        } else {
                            f3 = -31.0f;
                        }
                        bitmap = null;
                    } else {
                        f3 = -31.0f;
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        if (this.lastDrawnBitmap != bitmap || this.lastDrawnBitmapPaint == null) {
                            this.lastDrawnBitmap = bitmap;
                            this.lastDrawnBitmapPaint = BatchParticlesDrawHelper.createBatchParticlesPaint(bitmap);
                            c = 1;
                        }
                        if (this.lastDrawnColor != i6 || c != 0) {
                            this.lastDrawnColor = i6;
                            if (i7 >= 29) {
                                this.lastDrawnBitmapPaint.setColorFilter(new BlendModeColorFilter(i6, BlendMode.SRC_IN));
                            } else {
                                this.lastDrawnBitmapPaint.setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        if (f < 1.0f) {
                            bitmap2 = bitmap;
                            i = 1;
                            StarGiftPatterns.drawPatternBatch(canvas2, 2, this.lastDrawnBitmapPaint, bitmap2, bounds.width(), bounds.height(), 1.0f - f);
                        } else {
                            bitmap2 = bitmap;
                            i = 1;
                        }
                        if (f > f2) {
                            canvas2.translate(0.0f, AndroidUtilities.dp(f3));
                            StarGiftPatterns.drawPatternBatch(canvas2, 0, this.lastDrawnBitmapPaint, bitmap2, bounds.width(), bounds.height(), f);
                        }
                        canvas2 = canvas;
                    }
                    canvas2.restore();
                } else {
                    f3 = -31.0f;
                }
                i = 1;
                anonymousClass1.setColor(Integer.valueOf(i6));
                if (f < 1.0f) {
                    canvas2 = canvas;
                    StarGiftPatterns.drawPattern(canvas2, 2, this.pattern, bounds.width(), bounds.height(), 1.0f - f, 1.0f);
                } else {
                    canvas2 = canvas;
                }
                if (f > 0.0f) {
                    canvas2.translate(0.0f, AndroidUtilities.dp(f3));
                    StarGiftPatterns.drawPattern(canvas2, 0, this.pattern, bounds.width(), bounds.height(), f, 1.0f);
                }
                canvas2.restore();
            }
            if (z4) {
                canvas2.restore();
            }
            if (f4 > 0.0f) {
                int i8 = this.selectionStyle;
                Paint paint3 = this.selectedPaint;
                if (i8 == 0) {
                    Integer num = this.selectedColor;
                    paint3.setColor(num != null ? num.intValue() : Theme.getColor(this.selectedColorKey, resourcesProvider));
                    paint3.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(1.667f), f4));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(rectF);
                    float fLerp = AndroidUtilities.lerp(-AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(3.33f), f4);
                    rectF2.inset(fLerp, fLerp);
                    float fLerp2 = AndroidUtilities.lerp(this.r, AndroidUtilities.dpf2(7.33f), f4);
                    canvas2.drawRoundRect(rectF2, fLerp2, fLerp2, paint3);
                    return;
                }
                if (i8 == i) {
                    Integer num2 = this.selectedColor;
                    paint3.setColor(num2 != null ? num2.intValue() : Theme.getColor(this.selectedColorKey, resourcesProvider));
                    paint3.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f), f4));
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(rectF);
                    float fLerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f) / 2.0f, f4);
                    rectF3.inset(fLerp3, fLerp3);
                    float fLerp4 = AndroidUtilities.lerp(this.r, AndroidUtilities.dpf2(10.0f), f4);
                    canvas2.drawRoundRect(rectF3, fLerp4, fLerp4, paint3);
                }
            }
        }
    }

    public final class Ribbon extends View {
        public String currentText;
        public final RibbonDrawable drawable;

        public Ribbon(Context context) {
            super(context);
            RibbonDrawable ribbonDrawable = new RibbonDrawable(this);
            this.drawable = ribbonDrawable;
            ribbonDrawable.setCallback(this);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            int width = getWidth();
            int height = getHeight();
            RibbonDrawable ribbonDrawable = this.drawable;
            ribbonDrawable.setBounds(0, 0, width, height);
            ribbonDrawable.draw(canvas);
        }

        public CharSequence getText() {
            return this.currentText;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        }

        public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
            this.drawable.setBackdrop(stargiftattributebackdrop, false, false);
            invalidate();
        }

        public void setColor(int i) {
            RibbonDrawable ribbonDrawable = this.drawable;
            ribbonDrawable.paint.setShader(null);
            ribbonDrawable.paint.setColor(i);
        }

        public final void setColors(int i, int i2) {
            this.drawable.paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }

        public void setStrokeColor(int i) {
            this.drawable.strokePaint.setColor(i);
        }

        public final void setText(String str, boolean z) {
            this.currentText = str;
            this.drawable.setText(z ? 10 : 11, str, z);
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return this.drawable == drawable || super.verifyDrawable(drawable);
        }
    }

    public final class RibbonDrawable extends CompatDrawable {
        public boolean left;
        public StarsReactionsSheet.Particles particles;
        public final Path path;
        public final float scale;
        public final Paint strokePaint;
        public Text text;
        public int textColor;

        public RibbonDrawable(View view) {
            super(view);
            Path path = new Path();
            this.path = path;
            Paint paint = new Paint(1);
            this.strokePaint = paint;
            this.textColor = -1;
            this.scale = 1.0f;
            fillRibbonPath(path, 1.0f, false);
            this.paint.setColor(-698031);
            this.paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
            paint.setColor(0);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
        }

        public static void fillRibbonPath(Path path, float f, final boolean z) {
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    Float f2 = (Float) obj;
                    return Float.valueOf(z ? 48.0f - f2.floatValue() : f2.floatValue());
                }
            };
            path.rewind();
            float f2 = f * 24.5f;
            path.moveTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(46.83f))).floatValue() * f), AndroidUtilities.dp(f2));
            path.lineTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(23.5f))).floatValue() * f), AndroidUtilities.dp(1.17f * f));
            path.cubicTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(22.75f))).floatValue() * f), AndroidUtilities.dp(0.42f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(21.73f))).floatValue() * f), 0.0f, AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(20.68f))).floatValue() * f), 0.0f);
            float f3 = f * 0.05f;
            path.cubicTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(19.62f))).floatValue() * f), 0.0f, AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(2.73f))).floatValue() * f), AndroidUtilities.dp(f3), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(1.55f))).floatValue() * f), AndroidUtilities.dp(f3));
            path.cubicTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(0.36f))).floatValue() * f), AndroidUtilities.dp(f3), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(-0.23f))).floatValue() * f), AndroidUtilities.dp(1.4885f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(0.6f))).floatValue() * f), AndroidUtilities.dp(2.32f * f));
            path.lineTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(45.72f))).floatValue() * f), AndroidUtilities.dp(47.44f * f));
            path.cubicTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(46.56f))).floatValue() * f), AndroidUtilities.dp(48.28f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(48.0f))).floatValue() * f), AndroidUtilities.dp(47.68f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(48.0f))).floatValue() * f), AndroidUtilities.dp(46.5f * f));
            path.cubicTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(48.0f))).floatValue() * f), AndroidUtilities.dp(45.31f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(48.0f))).floatValue() * f), AndroidUtilities.dp(28.38f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(48.0f))).floatValue() * f), AndroidUtilities.dp(27.32f * f));
            path.cubicTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(48.0f))).floatValue() * f), AndroidUtilities.dp(26.26f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(47.5f))).floatValue() * f), AndroidUtilities.dp(25.24f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(46.82f))).floatValue() * f), AndroidUtilities.dp(f2));
            path.close();
        }

        @Override
        public final void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(getBounds().right - AndroidUtilities.dp(48.0f), getBounds().top);
            Paint paint = this.strokePaint;
            int alpha = paint.getAlpha();
            Path path = this.path;
            if (alpha > 0) {
                paint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
                canvas.drawPath(path, paint);
            }
            canvas.drawPath(path, this.paint);
            if (this.particles != null) {
                canvas.clipPath(path);
                StarsReactionsSheet.Particles particles = this.particles;
                float f = 0;
                particles.bounds.set(f, f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                particles.removeParticlesOutside();
                this.particles.process();
                this.particles.draw(canvas, -1, 1.0f);
                invalidateSelf();
            }
            if (this.text != null) {
                canvas.save();
                canvas.rotate(this.left ? -45.0f : 45.0f, (getBounds().width() / 2.0f) + AndroidUtilities.dp(this.left ? -7.0f : 6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.left ? 5.0f : 6.0f));
                float fMin = Math.min(1.0f, AndroidUtilities.dp(40.0f) / this.text.width);
                canvas.scale(fMin, fMin, (getBounds().width() / 2.0f) + AndroidUtilities.dp(this.left ? -7.0f : 6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.left ? 5.0f : 6.0f));
                this.text.draw(((getBounds().width() / 2.0f) + AndroidUtilities.dp(this.left ? -7.0f : 6.0f)) - (this.text.getWidth() / 2.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.left ? 4.0f : 5.0f), 1.0f, this.textColor, canvas);
                canvas.restore();
            }
            canvas.restore();
        }

        public final void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z, boolean z2) {
            Paint paint = this.paint;
            if (stargiftattributebackdrop == null) {
                paint.setShader(null);
            } else {
                boolean z3 = this.left ? !z : z;
                paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{Theme.adaptHSV(z3 ? 0.07f : 0.05f, (z3 ? -0.15f : -0.1f) - (z2 ? 0.125f : 0.0f), stargiftattributebackdrop.center_color | (-16777216)), Theme.adaptHSV(z3 ? 0.07f : 0.05f, (z3 ? -0.15f : -0.1f) - (z2 ? 0.125f : 0.0f), stargiftattributebackdrop.edge_color | (-16777216))}, new float[]{z3 ? 1.0f : 0.0f, z3 ? 0.0f : 1.0f}, Shader.TileMode.CLAMP));
            }
        }

        public final void setText(int i, String str, boolean z) {
            this.text = new Text(str, i, z ? AndroidUtilities.bold() : null);
        }
    }

    public final class SharedBackgroundDrawables {
        public NinePatchDrawable filledNinePatch;
        public NinePatchDrawable filledWithShadowNinePatch;
        public int lastFillingColor;
        public int lastFillingWithShadowFillingColor;
        public int lastFillingWithShadowShadowColor;
        public int lastShadowColor;
        public final float[] radii;
        public NinePatchDrawable shadowNinePatch;
        public final Bitmap[] shadowNinePatchBitmap = new Bitmap[1];
        public final Bitmap[] filledNinePatchBitmap = new Bitmap[1];
        public final Bitmap[] filledWithShadowNinePatchBitmap = new Bitmap[1];

        public SharedBackgroundDrawables() {
            float[] fArr = new float[8];
            this.radii = fArr;
            Arrays.fill(fArr, AndroidUtilities.dp(11.0f));
        }
    }

    public final class StarsBackground extends Drawable {
        public final Paint backgroundPaint;
        public IntroActivity$$ExternalSyntheticLambda6 invalidateRunnable;
        public boolean isAttached;
        public PollItemMenu$$ExternalSyntheticLambda14 liteModeCallback;
        public final StarsReactionsSheet.Particles particles;
        public boolean particlesAllowed;
        public final int particlesColor;
        public final RectF rectF = new RectF();
        public final Path path = new Path();

        public StarsBackground(int i, int i2) {
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            this.particlesColor = i;
            paint.setColor(i2);
            if (Build.VERSION.SDK_INT >= 29) {
                this.particles = new StarsReactionsSheet.Particles(1, 25);
            } else {
                this.particles = null;
            }
        }

        public final void checkParticlesAllowed() {
            boolean z = this.particles != null && this.isAttached && LiteMode.isEnabled(131072);
            if (this.particlesAllowed == z) {
                return;
            }
            this.particlesAllowed = z;
            if (z) {
                Choreographer60FpsContent choreographer60FpsContent = Choreographer60FpsContent.getInstance();
                IntroActivity$$ExternalSyntheticLambda6 introActivity$$ExternalSyntheticLambda6 = new IntroActivity$$ExternalSyntheticLambda6(this, 1);
                this.invalidateRunnable = introActivity$$ExternalSyntheticLambda6;
                choreographer60FpsContent.addFrameCallback(15, introActivity$$ExternalSyntheticLambda6);
            } else {
                Choreographer60FpsContent.getInstance().removeFrameCallback(this.invalidateRunnable);
            }
            invalidateSelf();
        }

        @Override
        public final void draw(Canvas canvas) {
            Path path = this.path;
            canvas.drawPath(path, this.backgroundPaint);
            StarsReactionsSheet.Particles particles = this.particles;
            if (particles != null) {
                if (this.particlesAllowed || !this.isAttached) {
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.invalidateRunnable == null) {
                        particles.process();
                    }
                    particles.draw(canvas, this.particlesColor, 1.0f);
                    canvas.restore();
                    if (this.invalidateRunnable == null) {
                        invalidateSelf();
                    }
                }
            }
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            float fMin = Math.min(rect.width(), rect.height()) / 2.0f;
            RectF rectF = this.rectF;
            rectF.set(rect);
            Path path = this.path;
            path.rewind();
            path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
            StarsReactionsSheet.Particles particles = this.particles;
            if (particles != null) {
                particles.bounds.set(rectF);
                particles.removeParticlesOutside();
            }
        }

        @Override
        public final void setAlpha(int i) {
            this.backgroundPaint.setAlpha(i);
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            this.backgroundPaint.setColorFilter(colorFilter);
        }
    }

    public final class StarsBackgroundView extends View {
        public StarsBackground currentBackground;

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            StarsBackground starsBackground = this.currentBackground;
            if (starsBackground == null || starsBackground.isAttached) {
                return;
            }
            starsBackground.isAttached = true;
            starsBackground.checkParticlesAllowed();
            PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14 = new PollItemMenu$$ExternalSyntheticLambda14(starsBackground, 12);
            starsBackground.liteModeCallback = pollItemMenu$$ExternalSyntheticLambda14;
            LiteMode.addOnPowerSaverAppliedListener(pollItemMenu$$ExternalSyntheticLambda14);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            StarsBackground starsBackground = this.currentBackground;
            if (starsBackground == null || !starsBackground.isAttached) {
                return;
            }
            starsBackground.isAttached = false;
            starsBackground.checkParticlesAllowed();
            LiteMode.removeOnPowerSaverAppliedListener(starsBackground.liteModeCallback);
        }

        @Override
        public final void setBackground(Drawable drawable) {
            if (this.currentBackground != null) {
                if (isAttachedToWindow()) {
                    StarsBackground starsBackground = this.currentBackground;
                    if (starsBackground.isAttached) {
                        starsBackground.isAttached = false;
                        starsBackground.checkParticlesAllowed();
                        LiteMode.removeOnPowerSaverAppliedListener(starsBackground.liteModeCallback);
                    }
                }
                this.currentBackground = null;
            }
            super.setBackground(drawable);
            if (drawable instanceof StarsBackground) {
                this.currentBackground = (StarsBackground) drawable;
                if (isAttachedToWindow()) {
                    StarsBackground starsBackground2 = this.currentBackground;
                    if (starsBackground2.isAttached) {
                        return;
                    }
                    starsBackground2.isAttached = true;
                    starsBackground2.checkParticlesAllowed();
                    PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14 = new PollItemMenu$$ExternalSyntheticLambda14(starsBackground2, 12);
                    starsBackground2.liteModeCallback = pollItemMenu$$ExternalSyntheticLambda14;
                    LiteMode.addOnPowerSaverAppliedListener(pollItemMenu$$ExternalSyntheticLambda14);
                }
            }
        }
    }

    public final class Tabs extends FrameLayout {
        public final AnimatedFloat animatedSelected;
        public final RectF ceiledRect;
        public final RectF flooredRect;
        public int lastId;
        public final PhotoViewer.AnonymousClass35 layout;
        public int selected;
        public final Paint selectedPaint;
        public final RectF selectedRect;
        public final ArrayList tabs;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((Tabs) view).set(uItem.id, (ArrayList) uItem.object, uItem.intValue, (Utilities.Callback) uItem.object2);
            }

            @Override
            public final boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.intValue == uItem2.intValue && uItem.object2 == uItem2.object2 && equals(uItem, uItem2);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Tabs(context, true);
            }

            @Override
            public final boolean equals(UItem uItem, UItem uItem2) {
                if (uItem.id == uItem2.id) {
                    ArrayList arrayList = (ArrayList) uItem.object;
                    ArrayList arrayList2 = (ArrayList) uItem2.object;
                    if (arrayList == arrayList2) {
                        return true;
                    }
                    if (arrayList == null && arrayList2 == null) {
                        return true;
                    }
                    if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i), (CharSequence) arrayList2.get(i))) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
        }

        public Tabs(Context context, boolean z) {
            super(context);
            this.tabs = new ArrayList();
            this.flooredRect = new RectF();
            this.ceiledRect = new RectF();
            this.selectedRect = new RectF();
            this.selectedPaint = new Paint(1);
            this.lastId = Integer.MIN_VALUE;
            PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, context, 10);
            this.layout = anonymousClass35;
            anonymousClass35.setClipToPadding(false);
            anonymousClass35.setClipChildren(false);
            anonymousClass35.setOrientation(0);
            anonymousClass35.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
            if (z) {
                addView(anonymousClass35, LayoutHelper.createFrame(-2, -1, 1));
            } else {
                anonymousClass35.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                horizontalScrollView.setHorizontalScrollBarEnabled(false);
                horizontalScrollView.setClipToPadding(false);
                horizontalScrollView.setClipChildren(false);
                horizontalScrollView.addView(anonymousClass35, LayoutHelper.createFrame(-2, -1, 119));
                addView(horizontalScrollView, LayoutHelper.createFrame(-1, -1, 119));
            }
            setHorizontalScrollBarEnabled(false);
            setClipToPadding(false);
            setClipChildren(false);
            this.animatedSelected = new AnimatedFloat(anonymousClass35, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public final void set(int i, ArrayList arrayList, int i2, Utilities.Callback callback) {
            boolean z = this.lastId == i;
            this.lastId = i;
            ArrayList arrayList2 = this.tabs;
            int size = arrayList2.size();
            int size2 = arrayList.size();
            PhotoViewer.AnonymousClass35 anonymousClass35 = this.layout;
            if (size != size2) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= arrayList2.size()) {
                        break;
                    }
                    CharSequence charSequence = i4 < arrayList.size() ? (CharSequence) arrayList.get(i4) : null;
                    if (charSequence == null) {
                        anonymousClass35.removeView((View) arrayList2.remove(i3));
                        i3--;
                    } else {
                        ((TextView) arrayList2.get(i3)).setText(charSequence);
                    }
                    i4++;
                    i3++;
                }
                while (i4 < arrayList.size()) {
                    LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext(), null);
                    linksTextView.setGravity(17);
                    linksTextView.setText((CharSequence) arrayList.get(i4));
                    linksTextView.setTypeface(AndroidUtilities.bold());
                    linksTextView.setTextColor(Theme.blendOver(Theme.getColor(null, Theme.key_dialogGiftsBackground, false), Theme.getColor(null, Theme.key_dialogGiftsTabText, false)));
                    linksTextView.setTextSize(1, 14.0f);
                    linksTextView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    linksTextView.setEllipsize(TextUtils.TruncateAt.END);
                    linksTextView.setSingleLine();
                    linksTextView.setMaxLines(1);
                    ScaleStateListAnimator.apply(linksTextView, 0.075f, 1.4f);
                    anonymousClass35.addView(linksTextView, LayoutHelper.createLinear(-2, 26));
                    arrayList2.add(linksTextView);
                    i4++;
                }
            }
            this.selected = i2;
            if (!z) {
                this.animatedSelected.set(i2, true);
            }
            anonymousClass35.invalidate();
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                ((TextView) arrayList2.get(i5)).setOnClickListener(new GiftSheet$Tabs$$ExternalSyntheticLambda0(i5, 0, callback));
            }
        }

        public final void updateColors() {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.tabs;
                if (i >= arrayList.size()) {
                    this.layout.invalidate();
                    return;
                } else {
                    ((TextView) arrayList.get(i)).setTextColor(Theme.blendOver(Theme.getColor(null, Theme.key_dialogGiftsBackground, false), Theme.getColor(null, Theme.key_dialogGiftsTabText, false)));
                    i++;
                }
            }
        }
    }

    public GiftSheet(LaunchActivity launchActivity, int i, long j) {
        this(launchActivity, i, j, null, null);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new GiftSheet$$ExternalSyntheticLambda8(this, 0), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i == NotificationCenter.billingProductDetailsUpdated) {
            updatePremiumTiers();
            return;
        }
        if (i == NotificationCenter.starGiftsLoaded) {
            UniversalAdapter universalAdapter2 = this.adapter;
            if (universalAdapter2 != null) {
                universalAdapter2.update(true);
                return;
            }
            return;
        }
        if (i != NotificationCenter.userInfoDidLoad) {
            if (i != NotificationCenter.starGiftSoldOut) {
                if (i == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.myGifts && (universalAdapter = this.adapter) != null) {
                    universalAdapter.update(true);
                    return;
                }
                return;
            }
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new BulletinFactory(this.container, this.resourcesProvider).createEmojiBulletin(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).show();
                UniversalAdapter universalAdapter3 = this.adapter;
                if (universalAdapter3 != null) {
                    universalAdapter3.update(true);
                    return;
                }
                return;
            }
            return;
        }
        if (isShown()) {
            long jLongValue = ((Long) objArr[0]).longValue();
            long j = this.dialogId;
            if (jLongValue == j && j > 0) {
                int i3 = this.currentAccount;
                TLRPC.UserFull userFull = MessagesController.getInstance(i3).getUserFull(j);
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j == UserConfig.getInstance(i3).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
                this.userSettings = disallowedGiftsSettings;
                if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                    lambda$showGiftOfferSheet$15();
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        BulletinFactory.of(safeLastFragment).createSimpleBulletinWithIconSize(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j)))).show();
                        return;
                    }
                    return;
                }
                UniversalAdapter universalAdapter4 = this.adapter;
                if (universalAdapter4 != null) {
                    universalAdapter4.update(true);
                }
            }
            ArrayList arrayList = this.premiumTiers;
            if (arrayList == null || arrayList.isEmpty()) {
                updatePremiumTiers();
                UniversalAdapter universalAdapter5 = this.adapter;
                if (universalAdapter5 != null) {
                    universalAdapter5.update(true);
                }
            }
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final CharSequence getTitle() {
        return this.self ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.name), null, false);
    }

    public final void lambda$new$17(AlertDialog alertDialog, TLObject tLObject, WearAuthSheet$$ExternalSyntheticLambda3 wearAuthSheet$$ExternalSyntheticLambda3, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            wearAuthSheet$$ExternalSyntheticLambda3.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                new BulletinFactory(this.container, this.resourcesProvider).showForError(false, tL_error);
                return;
            }
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        String string = LocaleController.getString(R.string.GiftLocked);
        AlertDialog alertDialog2 = builder.alertDialog;
        alertDialog2.title = string;
        alertDialog2.message = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        final AlertDialog alertDialogShow = builder.show();
        final EffectsTextView effectsTextView = alertDialogShow.messageTextView;
        if (effectsTextView != null) {
            effectsTextView.setOnLinkPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress() {
                @Override
                public final void run(ClickableSpan clickableSpan) {
                    GiftSheet giftSheet = this.f$0;
                    giftSheet.getClass();
                    alertDialogShow.dismiss();
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE);
                    }
                    giftSheet.lambda$showGiftOfferSheet$15();
                    clickableSpan.onClick(effectsTextView);
                }
            });
        }
    }

    public final void lambda$new$19(Context context, int i, Utilities.Callback callback, long j, int i2) {
        TL_stars.SavedStarGift savedStarGift;
        int i3 = 0;
        UItem item = this.adapter.getItem(i2 - 1);
        if (item != null && item.instanceOf(GiftCell.Factory.class)) {
            Object obj = item.object;
            if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                new SendGiftSheet(context, i, (GiftPremiumBottomSheet$GiftTier) obj, this.dialogId, new GiftSheet$$ExternalSyntheticLambda10(this, callback, 0)) {
                    @Override
                    public final BulletinFactory getParentBulletinFactory() {
                        GiftSheet giftSheet = GiftSheet.this;
                        return new BulletinFactory(giftSheet.container, giftSheet.resourcesProvider);
                    }
                }.show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                StarsController.GiftsList giftsList = this.myGifts;
                if (giftsList != null && this.selectedTab == this.TAB_MY_GIFTS) {
                    ArrayList arrayList = giftsList.gifts;
                    int size = arrayList.size();
                    while (true) {
                        if (i3 >= size) {
                            savedStarGift = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                        if (savedStarGift2.gift.id == starGift.id) {
                            savedStarGift = savedStarGift2;
                            break;
                        }
                    }
                    if (savedStarGift == null) {
                        return;
                    }
                    AnonymousClass8 anonymousClass8 = new AnonymousClass8(getContext(), i, UserConfig.getInstance(i).getClientUserId(), this.resourcesProvider);
                    anonymousClass8.set(savedStarGift, (StarsController.IGiftsList) null);
                    anonymousClass8.openTransferAlert(j, new PhotoViewer$$ExternalSyntheticLambda174(this, anonymousClass8, j, callback, 5));
                    return;
                }
                if (item.accent && starGift.availability_resale > 0) {
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                        bottomSheetParams.transitionFromLeft = true;
                        bottomSheetParams.occupyNavigationBar = true;
                        final ViewTreeObserver viewTreeObserver = this.container.getViewTreeObserver();
                        final GiftSheet$$ExternalSyntheticLambda12 giftSheet$$ExternalSyntheticLambda12 = new GiftSheet$$ExternalSyntheticLambda12();
                        ResaleGiftsFragment resaleGiftsFragment = new ResaleGiftsFragment(j, starGift.title, starGift.id, this.resourcesProvider) {
                            @Override
                            public final void onPause() {
                                super.onPause();
                                viewTreeObserver.removeOnPreDrawListener(giftSheet$$ExternalSyntheticLambda12);
                            }

                            @Override
                            public final void onResume() {
                                super.onResume();
                                viewTreeObserver.addOnPreDrawListener(giftSheet$$ExternalSyntheticLambda12);
                            }
                        };
                        resaleGiftsFragment.closeParentSheet = new OAuthSheet$$ExternalSyntheticLambda13(9, this, callback);
                        safeLastFragment.showAsSheet(resaleGiftsFragment, bottomSheetParams);
                    }
                } else {
                    if (starGift.auction) {
                        GiftAuctionController.getInstance(i).getOrRequestAuction(starGift.id, new AuctionJoinSheet$$ExternalSyntheticLambda0(context, this.resourcesProvider, i, j, new GiftSheet$$ExternalSyntheticLambda10(this, callback, 1)));
                        return;
                    }
                    if (!starGift.sold_out) {
                        if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                            new BulletinFactory(this.container, this.resourcesProvider).createSimpleMultiBulletin(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).show();
                            return;
                        }
                        WearAuthSheet$$ExternalSyntheticLambda3 wearAuthSheet$$ExternalSyntheticLambda3 = new WearAuthSheet$$ExternalSyntheticLambda3(this, context, i, starGift, callback, 21);
                        if (starGift.locked_until_date > ConnectionsManager.getInstance(i).getCurrentTime()) {
                            AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
                            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
                            TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                            checkcansendgift.gift_id = starGift.id;
                            ConnectionsManager.getInstance(i).sendRequest(checkcansendgift, new LoginActivity$$ExternalSyntheticLambda42(this, alertDialog, wearAuthSheet$$ExternalSyntheticLambda3, callback, 7));
                            return;
                        }
                        if (!starGift.require_premium || UserConfig.getInstance(i).isPremium()) {
                            wearAuthSheet$$ExternalSyntheticLambda3.run();
                            return;
                        }
                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment2 == null) {
                            return;
                        }
                        PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(safeLastFragment2, i, null, null, starGift, this.resourcesProvider);
                        BackupImageView backupImageView = new BackupImageView(getContext());
                        final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(backupImageView, false, AndroidUtilities.dp(160.0f), 4);
                        backupImageView.setImageDrawable(swapAnimatedEmojiDrawable);
                        backupImageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                            @Override
                            public final void onViewAttachedToWindow(View view) {
                                swapAnimatedEmojiDrawable.attach();
                            }

                            @Override
                            public final void onViewDetachedFromWindow(View view) {
                                swapAnimatedEmojiDrawable.detach();
                            }
                        });
                        swapAnimatedEmojiDrawable.set(starGift.getDocument(), swapAnimatedEmojiDrawable.cacheType, false);
                        premiumPreviewBottomSheet.overrideTitleIcon = backupImageView;
                        premiumPreviewBottomSheet.show();
                        swapAnimatedEmojiDrawable.play();
                        return;
                    }
                    Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                    if (context != null) {
                        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, false, false);
                        LinearLayout linearLayoutM = zzkf.m(context, 1);
                        linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        linearLayoutM.setClipChildren(false);
                        linearLayoutM.setClipToPadding(false);
                        BackupImageView backupImageView2 = new BackupImageView(context);
                        StarsIntroActivity.setGiftImage(backupImageView2.getImageReceiver(), starGift.getDocument(), 160);
                        linearLayoutM.addView(backupImageView2, LayoutHelper.createLinear(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        zzlj.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayoutM, textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4), context);
                        textViewM.setTextSize(1, 14.0f);
                        textViewM.setTypeface(AndroidUtilities.bold());
                        textViewM.setGravity(17);
                        textViewM.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
                        textViewM.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        linearLayoutM.addView(textViewM, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
                        TableView tableView = new TableView(context, resourcesProvider);
                        if (starGift.first_sale_date != 0) {
                            tableView.addRowDateTime(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            tableView.addRowDateTime(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        tableView.addRow(LocaleController.getString(R.string.Gift2SoldOutSheetValue), StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            StarsIntroActivity.addAvailabilityRow(tableView, i, starGift, resourcesProvider);
                        }
                        linearLayoutM.addView(tableView, LayoutHelper.createLinear(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
                        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false, true);
                        linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
                        bottomSheetM.customView = linearLayoutM;
                        BottomSheet[] bottomSheetArr = {bottomSheetM};
                        bottomSheetArr[0].useBackgroundTopPadding = false;
                        buttonWithCounterView.setOnClickListener(new AccountFrozenAlert$$ExternalSyntheticLambda3(bottomSheetArr, 7));
                        bottomSheetArr[0].fixNavigationBar();
                        BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(safeLastFragment3)) {
                            bottomSheetArr[0].makeAttached(safeLastFragment3);
                        }
                        bottomSheetArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final void show() {
        int i = this.currentAccount;
        if (MessagesController.getInstance(i).isFrozen()) {
            AccountFrozenAlert.show(i);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.userSettings;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletinWithIconSize(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.dialogId)))).show();
        }
    }

    public final void updatePremiumTiers() {
        ArrayList arrayList;
        int i;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList2 = this.premiumTiers;
        arrayList2.clear();
        if (arrayList2.isEmpty() && (arrayList = this.options) != null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = this.options.size() - 1;
            long pricePerMonth = 0;
            while (true) {
                i = 0;
                if (size < 0) {
                    break;
                }
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.options.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    ArrayList arrayList4 = this.options;
                    int size2 = arrayList4.size();
                    while (true) {
                        if (i >= size2) {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                        Object obj = arrayList4.get(i);
                        i++;
                        tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                        if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                            break;
                        }
                    }
                    GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = new GiftPremiumBottomSheet$GiftTier(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList2.add(giftPremiumBottomSheet$GiftTier);
                    if (BuildVars.useInvoiceBilling()) {
                        if (giftPremiumBottomSheet$GiftTier.getPricePerMonth() > pricePerMonth) {
                            pricePerMonth = giftPremiumBottomSheet$GiftTier.getPricePerMonth();
                        }
                    } else if (tL_premiumGiftCodeOption2.store_product != null && BillingController.getInstance().isReady()) {
                        AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
                        accountIdentifiers.zzb = "inapp";
                        accountIdentifiers.zza = tL_premiumGiftCodeOption2.store_product;
                        arrayList3.add(accountIdentifiers.build());
                    }
                }
                size--;
            }
            if (BuildVars.useInvoiceBilling()) {
                int size3 = arrayList2.size();
                while (i < size3) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ((GiftPremiumBottomSheet$GiftTier) obj2).pricePerMonthRegular = pricePerMonth;
                }
            } else if (!arrayList3.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList3, new VideoEditTextureView$$ExternalSyntheticLambda1(this, 26));
            }
        }
        if (arrayList2.isEmpty()) {
            BoostRepository.loadGiftOptions(this.currentAccount, null, new GiftSheet$$ExternalSyntheticLambda7(this, 0));
        }
    }

    public GiftSheet(final Context context, final int i, final long j, ArrayList arrayList, final Utilities.Callback callback) {
        super(context, null, false, false, false, null);
        this.premiumTiers = new ArrayList();
        this.TAB_ALL = -1;
        this.TAB_MY_GIFTS = -1;
        this.TAB_COLLECTIBLES = -1;
        new ArrayList();
        this.currentAccount = i;
        this.dialogId = j;
        int i2 = 0;
        boolean z = UserConfig.getInstance(i).getClientUserId() == j;
        this.self = z;
        this.options = arrayList;
        this.closeParentSheet = callback;
        int i3 = Theme.key_dialogGiftsBackground;
        setBackgroundColor(Theme.getColor(null, i3, false));
        fixNavigationBar(Theme.getColor(null, i3, false));
        this.myGifts = StarsController.getInstance(i, false).getProfileGiftsList(UserConfig.getInstance(i).getClientUserId(), true);
        StarsController.getInstance(i, false).loadStarGifts();
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setImportantForAccessibility(2);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        if (j > 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            this.name = UserObject.getForcedFirstName(user);
            avatarDrawable.setInfo(UserConfig.selectedAccount, user);
            backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
            backupImageView.onNewImageSet();
            TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(j);
            this.userSettings = (j == UserConfig.getInstance(i).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
            if (userFull == null) {
                MessagesController.getInstance(i).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            this.name = chat == null ? "" : chat.title;
            avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
            backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
            backupImageView.onNewImageSet();
        }
        this.topPadding = 0.1f;
        StarsIntroActivity.StarsBalanceView starsBalanceView = new StarsIntroActivity.StarsBalanceView(context, i, this.resourcesProvider);
        this.balanceView = starsBalanceView;
        ScaleStateListAnimator.apply(starsBalanceView, 0.1f, 1.5f);
        starsBalanceView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.premiumHeaderView = frameLayout;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        this.topView = anonymousClass1;
        anonymousClass1.setClipChildren(false);
        anonymousClass1.setClipToPadding(false);
        anonymousClass1.addView(new StarsIntroActivity.AnonymousClass4(context, 70, 0), LayoutHelper.createFrame(-1.0f, -1));
        backupImageView.setRoundRadius(AndroidUtilities.dp(42.0f));
        anonymousClass1.addView(backupImageView, LayoutHelper.createFrame(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        ScaleStateListAnimator.apply(backupImageView, 0.1f, 1.5f);
        backupImageView.setOnClickListener(new GiftSheet$$ExternalSyntheticLambda1(this, j, i2));
        anonymousClass1.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2, 55));
        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 20.0f);
        textViewM.setTypeface(AndroidUtilities.bold());
        int i4 = Theme.key_dialogTextBlack;
        textViewM.setTextColor(Theme.getColor(i4, this.resourcesProvider));
        textViewM.setGravity(17);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 1, 4, 0, 4, 0));
        textViewM.setMaxWidth(HintView2.cutInFancyHalf(textViewM.getText(), textViewM.getPaint()));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, this.resourcesProvider);
        int i5 = Theme.key_chat_messageLinkIn;
        linksTextView.setLinkTextColor(Theme.getColor(i5, this.resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setTextColor(Theme.getColor(i4, this.resourcesProvider));
        linksTextView.setGravity(17);
        linksTextView.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 1, 4, 4, 4, 12));
        textViewM.setText(LocaleController.getString(R.string.Gift2Premium));
        linksTextView.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.name)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new QrActivity$5$$ExternalSyntheticLambda1(13)), true)));
        linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.starsHeaderView = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(Theme.getColor(i4, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 4, 0, 4, 0));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, this.resourcesProvider);
        this.subtitleStarsView = anonymousClass2;
        anonymousClass2.setLinkTextColor(Theme.getColor(i5, this.resourcesProvider));
        anonymousClass2.setTextSize(1, 14.0f);
        anonymousClass2.setTextColor(Theme.getColor(i4, this.resourcesProvider));
        anonymousClass2.setGravity(17);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, this.resourcesProvider);
        this.subtitleCollectiblesStarsView = anonymousClass3;
        anonymousClass3.setLinkTextColor(Theme.getColor(i5, this.resourcesProvider));
        anonymousClass3.setTextSize(1, 14.0f);
        anonymousClass3.setTextColor(Theme.getColor(i4, this.resourcesProvider));
        anonymousClass3.setGravity(17);
        anonymousClass3.setAlpha(0.0f);
        anonymousClass3.setScaleX(0.85f);
        anonymousClass3.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(anonymousClass2, LayoutHelper.createFrame(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(anonymousClass3, LayoutHelper.createFrame(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(LocaleController.getString(j < 0 ? R.string.Gift2StarsChannel : z ? R.string.Gift2StarsSelf : R.string.Gift2Stars));
        if (z) {
            linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 4));
            LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, this.resourcesProvider);
            linksTextView2.setLinkTextColor(Theme.getColor(i5, this.resourcesProvider));
            linksTextView2.setTextSize(1, 14.0f);
            linksTextView2.setTextColor(Theme.getColor(i4, this.resourcesProvider));
            linksTextView2.setGravity(17);
            linearLayout2.addView(linksTextView2, LayoutHelper.createLinear(-2, -2, 1, 26, 4, 26, 6));
            anonymousClass2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            linksTextView2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else if (j < 0) {
            linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(anonymousClass2);
            anonymousClass2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.name)), anonymousClass2.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 1, 0, 9, 0, 6));
            StarsController.GiftsList profileGiftsList = StarsController.getInstance(i, false).getProfileGiftsList(j, true);
            final PhotoViewer$$ExternalSyntheticLambda177 photoViewer$$ExternalSyntheticLambda177 = new PhotoViewer$$ExternalSyntheticLambda177(this, profileGiftsList, j, callback, context, 7);
            photoViewer$$ExternalSyntheticLambda177.run();
            anonymousClass2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public final void onViewAttachedToWindow(View view) {
                    photoViewer$$ExternalSyntheticLambda177.run();
                }

                @Override
                public final void onViewDetachedFromWindow(View view) {
                }
            });
            if (profileGiftsList.gifts.size() < 3) {
                profileGiftsList.load();
            }
            NotificationCenter.getInstance(i).listen(anonymousClass2, NotificationCenter.starUserGiftsLoaded, new OAuthSheet$$ExternalSyntheticLambda13(10, profileGiftsList, photoViewer$$ExternalSyntheticLambda177));
        }
        ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(3, false);
        this.layoutManager = extendedGridLayoutManager;
        extendedGridLayoutManager.mSpanSizeLookup = new BaseMenuWrapper() {
            @Override
            public final int getSpanSize(int i6) {
                int i7;
                GiftSheet giftSheet = GiftSheet.this;
                UniversalAdapter universalAdapter = giftSheet.adapter;
                ExtendedGridLayoutManager extendedGridLayoutManager2 = giftSheet.layoutManager;
                if (universalAdapter == null || i6 == 0) {
                    return extendedGridLayoutManager2.mSpanCount;
                }
                UItem item = universalAdapter.getItem(i6 - 1);
                return (item == null || (i7 = item.spanCount) == -1) ? extendedGridLayoutManager2.mSpanCount : i7;
            }
        };
        this.recyclerListView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setClipChildren(false);
        this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
        this.recyclerListView.setSelectorType(9);
        this.recyclerListView.setSelectorDrawableColor(0);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6();
        this.itemAnimator = anonymousClass6;
        anonymousClass6.delayAnimations = false;
        anonymousClass6.mSupportsChangeAnimations = false;
        anonymousClass6.setDurations(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        anonymousClass6.mAddInterpolator = cubicBezierInterpolator;
        anonymousClass6.mMoveInterpolator = cubicBezierInterpolator;
        anonymousClass6.mRemoveInterpolator = cubicBezierInterpolator;
        anonymousClass6.mChangeInterpolator = cubicBezierInterpolator;
        anonymousClass6.delayIncrement = 40L;
        this.recyclerListView.setItemAnimator(anonymousClass6);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(int i6, View view) {
                this.f$0.lambda$new$19(context, i, callback, j, i6);
            }
        });
        updatePremiumTiers();
        this.adapter.update(false);
        updateTitle$1();
        if (BirthdayController.getInstance(i).isToday(j)) {
            this.birthday = true;
            this.adapter.update(false);
        }
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.actionBar.setTitle(getTitle());
        NotificationCenter.listenEmojiLoading(this.actionBar.getTitleTextView());
    }

    public class GiftCell extends FrameLayout {
        public static final int[] PREMIUM_STROKE = {-2781403, -3635939};
        public boolean allowResaleInGifts;
        public final AnimatedFloat animatedReordering;
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarView;
        public final FrameLayout.LayoutParams avatarViewLayout1;
        public final FrameLayout.LayoutParams avatarViewLayout2;
        public StickersActivity$$ExternalSyntheticLambda18 cancel;
        public final FrameLayout card;
        public final CardBackground cardBackground;
        public final Rect cardBackgroundPadding;
        public final TextView chanceTextView;
        public CheckBox2 checkBox;
        public final int currentAccount;
        public TL_stars.StarGift gift;
        public boolean giftMine;
        public final BackupImageView imageView;
        public FrameLayout.LayoutParams imageViewLayoutParams;
        public boolean inCollection;
        public boolean inCrafting;
        public boolean inResalePage;
        public TLRPC.Document lastDocument;
        public GiftPremiumBottomSheet$GiftTier lastTier;
        public TL_stars.SavedStarGift lastUserGift;
        public final PremiumLockIconView lockView;
        public final PremiumLockIconView pinView;
        public boolean pinned;
        public boolean pinnedIcon;
        public final FrameLayout pinnedView;
        public GiftPremiumBottomSheet$GiftTier premiumTier;
        public final StarsBackgroundView priceBackground;
        public final LoginActivity.AnonymousClass4 priceLayout;
        public final TextView priceView;
        public boolean priotityAuction;
        public boolean reordering;
        public final Theme.ResourcesProvider resourcesProvider;
        public final Ribbon ribbon;
        public final Shaker shaker;
        public final TextView starsPriceView;
        public Text subtitle;
        public final TextView subtitleView;
        public Text title;
        public final TextView titleView;
        public final ImageView tonOnlySaleView;
        public TL_stars.SavedStarGift userGift;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem asStarGift(int i, TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.spanCount = 1;
                uItemOfFactory.intValue = i;
                uItemOfFactory.object = starGift;
                uItemOfFactory.checked = z;
                uItemOfFactory.object2 = Boolean.valueOf(z2);
                uItemOfFactory.red = z4;
                uItemOfFactory.accent = z3;
                uItemOfFactory.locked = z5;
                return uItemOfFactory;
            }

            @Override
            public final void attachedView(RecyclerListView recyclerListView, View view, UItem uItem) {
                ((GiftCell) view).setReordering(uItem.reordering, false);
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                long j;
                String str;
                GiftCell giftCell = (GiftCell) view;
                Object obj = uItem.object;
                boolean starsGift = false;
                if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                    GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = (GiftPremiumBottomSheet$GiftTier) obj;
                    giftCell.getClass();
                    int months = giftPremiumBottomSheet$GiftTier.getMonths();
                    GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier2 = giftCell.lastTier;
                    BackupImageView backupImageView = giftCell.imageView;
                    if (giftPremiumBottomSheet$GiftTier2 != giftPremiumBottomSheet$GiftTier) {
                        ImageReceiver imageReceiver = backupImageView.getImageReceiver();
                        if (months == 3) {
                            str = "2⃣";
                        } else if (months == 6) {
                            str = "3⃣";
                        } else if (months != 12) {
                            str = months != 24 ? "1⃣" : "5⃣";
                        } else {
                            str = "4⃣";
                        }
                        StickersActivity$$ExternalSyntheticLambda18 giftImage = StarsIntroActivity.setGiftImage(backupImageView, imageReceiver, str, false);
                        giftCell.cancel = giftImage;
                        giftImage.run();
                        giftCell.cancel = null;
                    }
                    CardBackground cardBackground = giftCell.cardBackground;
                    cardBackground.setBackdrop(null);
                    cardBackground.setPattern(null);
                    cardBackground.setStrokeColors(null);
                    TextView textView = giftCell.titleView;
                    textView.setText(LocaleController.formatPluralString("Gift2Months", months, new Object[0]));
                    TextView textView2 = giftCell.subtitleView;
                    textView2.setText(LocaleController.getString(R.string.TelegramPremiumShort));
                    textView.setVisibility(0);
                    textView2.setVisibility(0);
                    backupImageView.setTranslationY(-AndroidUtilities.dp(8.0f));
                    giftCell.avatarView.setVisibility(8);
                    giftCell.lockView.setVisibility(8);
                    TextView textView3 = giftCell.starsPriceView;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = giftPremiumBottomSheet$GiftTier.starsCodeOption;
                    TLRPC.TL_premiumGiftOption tL_premiumGiftOption = giftPremiumBottomSheet$GiftTier.starsOption;
                    if (tL_premiumGiftOption == null && tL_premiumGiftCodeOption == null) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setTextColor(Theme.currentTheme.isDark() ? -1333971 : -2722014);
                        textView3.setVisibility(0);
                        StringBuilder sb = new StringBuilder("");
                        if (tL_premiumGiftOption != null) {
                            j = tL_premiumGiftOption.amount;
                        } else {
                            j = tL_premiumGiftCodeOption != null ? tL_premiumGiftCodeOption.amount : 0L;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(BillingController$$ExternalSyntheticOutline0.m(j, ',', sb));
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                        ColoredImageSpan[] coloredImageSpanArr = new ColoredImageSpan[1];
                        textView3.setText(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, coloredImageSpanArr));
                        coloredImageSpanArr[0].spaceScaleX = 0.8f;
                    }
                    FrameLayout.LayoutParams layoutParams = giftCell.imageViewLayoutParams;
                    layoutParams.gravity = 49;
                    backupImageView.setLayoutParams(layoutParams);
                    TextView textView4 = giftCell.priceView;
                    textView4.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView4.setTextSize(1, 12.0f);
                    textView4.setText(giftPremiumBottomSheet$GiftTier.getFormattedPrice());
                    giftCell.priceBackground.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), 422810068));
                    textView4.setTextColor(-13397548);
                    LoginActivity.AnonymousClass4 anonymousClass4 = giftCell.priceLayout;
                    ((ViewGroup.MarginLayoutParams) anonymousClass4.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
                    ((FrameLayout.LayoutParams) anonymousClass4.getLayoutParams()).gravity = 49;
                    giftCell.lastTier = giftPremiumBottomSheet$GiftTier;
                    giftCell.lastDocument = null;
                    giftCell.premiumTier = giftPremiumBottomSheet$GiftTier;
                    giftCell.gift = null;
                    giftCell.giftMine = false;
                    giftCell.userGift = null;
                    giftCell.allowResaleInGifts = false;
                    giftCell.inResalePage = false;
                    giftCell.inCollection = false;
                    giftCell.title = null;
                    giftCell.subtitle = null;
                    giftCell.setPinned(false, false);
                    giftCell.updateRibbonText();
                } else if (obj instanceof TL_stars.StarGift) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                    boolean z2 = uItem.checked;
                    Object obj2 = uItem.object2;
                    giftCell.setStarsGift(starGift, z2, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, uItem.accent, uItem.red, uItem.locked);
                } else if (obj instanceof TL_stars.SavedStarGift) {
                    starsGift = giftCell.setStarsGift((TL_stars.SavedStarGift) obj, uItem.accent, uItem.red);
                }
                if (uItem.collapsed) {
                    giftCell.setChecked(uItem.checked, starsGift);
                }
                giftCell.setReordering(uItem.reordering, starsGift);
                giftCell.card.setAlpha(uItem.enabled ? 1.0f : 0.65f);
                giftCell.ribbon.setAlpha(uItem.enabled ? 1.0f : 0.5f);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new GiftCell(context, i, resourcesProvider);
            }

            @Override
            public final boolean equals(UItem uItem, UItem uItem2) {
                if (uItem.accent != uItem2.accent) {
                    return false;
                }
                Object obj = uItem.object;
                if (obj != null || uItem2.object != null) {
                    if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                        return obj == uItem2.object;
                    }
                    if (obj instanceof TL_stars.StarGift) {
                        Object obj2 = uItem2.object;
                        if (obj2 instanceof TL_stars.StarGift) {
                            return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                        }
                    }
                    if (obj instanceof TL_stars.SavedStarGift) {
                        Object obj3 = uItem2.object;
                        if (obj3 instanceof TL_stars.SavedStarGift) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                            return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                        }
                    }
                }
                return uItem.intValue == uItem2.intValue && uItem.checked == uItem2.checked && uItem.longValue == uItem2.longValue && TextUtils.equals(uItem.text, uItem2.text);
            }
        }

        public GiftCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.cardBackgroundPadding = new Rect();
            this.animatedReordering = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            ScaleStateListAnimator.apply(this, 0.04f, 1.5f);
            this.shaker = new Shaker(this);
            FrameLayout frameLayout = new FrameLayout(context);
            this.card = frameLayout;
            CardBackground cardBackground = new CardBackground(frameLayout, resourcesProvider, true);
            this.cardBackground = cardBackground;
            frameLayout.setBackground(cardBackground);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            Ribbon ribbon = new Ribbon(context);
            this.ribbon = ribbon;
            addView(ribbon, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.getImageReceiver().setAutoRepeat(0);
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
            this.imageViewLayoutParams = layoutParamsCreateFrame;
            frameLayout.addView(backupImageView, layoutParamsCreateFrame);
            PremiumLockIconView premiumLockIconView = new PremiumLockIconView(context, 3, resourcesProvider);
            this.lockView = premiumLockIconView;
            premiumLockIconView.setImageReceiver(backupImageView.getImageReceiver());
            frameLayout.addView(premiumLockIconView, LayoutHelper.createFrame(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            PremiumLockIconView premiumLockIconView2 = new PremiumLockIconView(context, 4, resourcesProvider);
            this.pinView = premiumLockIconView2;
            premiumLockIconView2.setImageReceiver(backupImageView.getImageReceiver());
            frameLayout.addView(premiumLockIconView2, LayoutHelper.createFrame(44, 44, 17));
            premiumLockIconView2.setAlpha(0.0f);
            premiumLockIconView2.setScaleX(0.3f);
            premiumLockIconView2.setScaleY(0.3f);
            premiumLockIconView2.setVisibility(8);
            TextView textView = new TextView(context);
            this.titleView = textView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView.setGravity(17);
            zzkk.m(14.0f, 1, textView);
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView2.setGravity(17);
            textView2.setTextSize(1, 12.0f);
            frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
            LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, 4);
            this.priceLayout = anonymousClass4;
            TextView textView3 = new TextView(context);
            this.priceView = textView3;
            textView3.setTextSize(1, 12.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setGravity(17);
            textView3.setTextColor(-13397548);
            frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
            StarsBackgroundView starsBackgroundView = new StarsBackgroundView(context);
            this.priceBackground = starsBackgroundView;
            starsBackgroundView.setBackgroundColor(-16776961);
            anonymousClass4.addView(starsBackgroundView, LayoutHelper.createFrame(0.0f, 0));
            anonymousClass4.addView(textView3, LayoutHelper.createFrame(-2, 26, 17));
            int i3 = Theme.currentTheme.isDark() ? 518759725 : 1088989954;
            starsBackgroundView.setBackground(new StarsBackground(ColorUtils.setAlphaComponent(i3, 128), i3));
            TextView textView4 = new TextView(context);
            this.starsPriceView = textView4;
            textView4.setTextSize(1, 10.66f);
            textView4.setGravity(17);
            textView4.setTextColor(Theme.currentTheme.isDark() ? -1333971 : -2722014);
            textView4.setVisibility(8);
            frameLayout.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.avatarView = backupImageView2;
            backupImageView2.setRoundRadius(AndroidUtilities.dp(20.0f));
            backupImageView2.setVisibility(8);
            FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
            this.avatarViewLayout1 = layoutParamsCreateFrame2;
            frameLayout.addView(backupImageView2, layoutParamsCreateFrame2);
            this.avatarViewLayout2 = LayoutHelper.createFrame(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.pinnedView = frameLayout2;
            frameLayout2.setAlpha(0.0f);
            frameLayout2.setScaleX(0.3f);
            frameLayout2.setScaleY(0.3f);
            frameLayout2.setVisibility(8);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_limit_pin);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            frameLayout2.addView(imageView, new FrameLayout.LayoutParams(LayoutHelper.getSize(12.66f), LayoutHelper.getSize(12.66f), 17));
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
            ImageView imageView2 = new ImageView(context);
            this.tonOnlySaleView = imageView2;
            imageView2.setImageResource(R.drawable.mini_gram_14);
            imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
            imageView2.setVisibility(8);
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            frameLayout.addView(imageView2, LayoutHelper.createFrame(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
            TextView textView5 = new TextView(context);
            this.chanceTextView = textView5;
            textView5.setTextSize(1, 10.0f);
            textView5.setTypeface(AndroidUtilities.bold());
            textView5.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
            textView5.setGravity(17);
            textView5.setTextColor(-1);
            frameLayout.addView(textView5, LayoutHelper.createFrame(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
            textView5.setVisibility(8);
            setImportantForAccessibility(1);
            frameLayout.setImportantForAccessibility(4);
            ribbon.setImportantForAccessibility(2);
        }

        private TL_stars.TL_starGiftUnique getUniqueStarGift() {
            TL_stars.SavedStarGift savedStarGift = this.userGift;
            if (savedStarGift == null) {
                return null;
            }
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }

        public final void customDraw(ItemOptions.DimView dimView, Canvas canvas, float f, float f2, float f3) {
            float f4;
            float f5;
            Canvas canvas2 = canvas;
            canvas2.save();
            canvas2.scale(getScaleX(), getScaleY(), f / 2.0f, f2 / 2.0f);
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            float fDp = uniqueStarGift != null ? AndroidUtilities.dp(63.0f) * f3 : 0.0f;
            CardBackground cardBackground = this.cardBackground;
            cardBackground.setBounds(0, 0, (int) f, (int) f2);
            cardBackground.draw(canvas2, f3);
            Rect rect = this.cardBackgroundPadding;
            cardBackground.getPadding(rect);
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f3);
            BackupImageView backupImageView = this.imageView;
            float f6 = f2 - fDp;
            backupImageView.getImageReceiver().setImageCoords((f - fLerp) / 2.0f, (f6 - fLerp) / 2.0f, fLerp, fLerp);
            backupImageView.getImageReceiver().draw(canvas2);
            if (backupImageView.getImageReceiver().isLottieRunning()) {
                dimView.invalidate();
            }
            PremiumLockIconView premiumLockIconView = this.lockView;
            if (premiumLockIconView.getVisibility() != 0 || premiumLockIconView.getAlpha() <= 0.0f) {
                f4 = 1.0f;
            } else {
                canvas2.save();
                canvas2.translate((f - premiumLockIconView.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(premiumLockIconView.getY(), (f6 - premiumLockIconView.getMeasuredHeight()) / 2.0f, f3));
                f4 = 1.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, premiumLockIconView.getWidth(), premiumLockIconView.getHeight(), (int) (premiumLockIconView.getAlpha() * (1.0f - f3) * 255.0f), 31);
                premiumLockIconView.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            }
            FrameLayout frameLayout = this.pinnedView;
            if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                canvas2.save();
                canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
                canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
                frameLayout.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            }
            BackupImageView backupImageView2 = this.avatarView;
            if (backupImageView2.getVisibility() == 0 && backupImageView2.getAlpha() > 0.0f) {
                canvas2.save();
                canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
                backupImageView2.draw(canvas2);
                canvas2.restore();
            }
            Ribbon ribbon = this.ribbon;
            if (ribbon.getVisibility() != 0 || ribbon.getAlpha() <= 0.0f) {
                f5 = 1.0f;
            } else {
                canvas2.save();
                canvas2.translate(f - AndroidUtilities.dp(f4), AndroidUtilities.dp(2.0f));
                f5 = 1.0f;
                float fLerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f3);
                canvas2.scale(fLerp2, fLerp2);
                canvas2.translate(-ribbon.getWidth(), 0.0f);
                ribbon.draw(canvas2);
                canvas2.restore();
            }
            if (uniqueStarGift != null) {
                if (this.title == null) {
                    this.title = new Text(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
                }
                if (this.subtitle == null) {
                    this.subtitle = new Text(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
                }
                Text text = this.title;
                text.ellipsizeWidth = f - AndroidUtilities.dp(8.0f);
                float f7 = f5 - f3;
                text.draw((f - this.title.getWidth()) / 2.0f, ((f2 - AndroidUtilities.dp(40.0f)) - (this.title.layout.getHeight() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f7), f3, -1, canvas);
                Text text2 = this.subtitle;
                text2.ellipsizeWidth = f - AndroidUtilities.dp(8.0f);
                text2.draw((f - this.subtitle.getWidth()) / 2.0f, ((f2 - AndroidUtilities.dp(19.0f)) - (this.subtitle.layout.getHeight() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f7), 0.6f * f3, -1, canvas);
                canvas2 = canvas;
            }
            LoginActivity.AnonymousClass4 anonymousClass4 = this.priceLayout;
            if (anonymousClass4 != null && anonymousClass4.getVisibility() == 0) {
                canvas2.save();
                canvas2.translate(anonymousClass4.getX(), anonymousClass4.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, anonymousClass4.getWidth(), anonymousClass4.getHeight(), (int) (anonymousClass4.getAlpha() * (f5 - f3) * 255.0f), 31);
                anonymousClass4.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            }
            ImageView imageView = this.tonOnlySaleView;
            if (imageView != null && imageView.getVisibility() == 0) {
                canvas2.save();
                canvas2.translate(imageView.getX(), imageView.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f5 - f3) * 255.0f), 31);
                imageView.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            }
            canvas2.restore();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            float f = this.animatedReordering.set(this.reordering);
            if (f > 0.0f) {
                this.shaker.concat(canvas, f);
            }
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        public TL_stars.StarGift getGift() {
            return this.gift;
        }

        public long getGiftId() {
            TL_stars.StarGift starGift = this.gift;
            if (starGift != null) {
                return starGift.id;
            }
            return 0L;
        }

        public GiftPremiumBottomSheet$GiftTier getPremiumTier() {
            return this.premiumTier;
        }

        public TL_stars.SavedStarGift getSavedGift() {
            return this.userGift;
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            CharSequence string;
            TL_stars.StarGift starGift;
            BackupImageView backupImageView;
            String userName;
            TextView textView;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            accessibilityNodeInfo.setClickable(true);
            if (isEnabled()) {
                accessibilityNodeInfo.addAction(16);
            }
            try {
                StringBuilder sb = new StringBuilder();
                String str = null;
                if (this.premiumTier != null) {
                    TextView textView2 = this.titleView;
                    if (textView2 == null || textView2.getVisibility() != 0 || TextUtils.isEmpty(textView2.getText())) {
                        string = null;
                    } else {
                        string = textView2.getText();
                    }
                } else {
                    TL_stars.SavedStarGift savedStarGift = this.userGift;
                    if (savedStarGift == null || (starGift = savedStarGift.gift) == null) {
                        TL_stars.StarGift starGift2 = this.gift;
                        if (starGift2 == null || !(starGift2 instanceof TL_stars.TL_starGiftUnique) || TextUtils.isEmpty(starGift2.title)) {
                            string = null;
                        } else {
                            string = this.gift.title;
                        }
                    } else if (!(starGift instanceof TL_stars.TL_starGiftUnique) || TextUtils.isEmpty(starGift.title)) {
                        string = null;
                    } else {
                        string = this.userGift.gift.title;
                    }
                }
                if (TextUtils.isEmpty(string)) {
                    string = LocaleController.getString(R.string.Gift2Gift);
                }
                sb.append(string);
                TextView textView3 = this.subtitleView;
                if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                    sb.append(", ");
                    sb.append(textView3.getText());
                }
                Ribbon ribbon = this.ribbon;
                if (ribbon != null && ribbon.getVisibility() == 0) {
                    CharSequence text = ribbon.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb.append(", ");
                        sb.append(text);
                    }
                }
                LoginActivity.AnonymousClass4 anonymousClass4 = this.priceLayout;
                if (anonymousClass4 != null && anonymousClass4.getVisibility() == 0 && (textView = this.priceView) != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb.append(", ");
                    sb.append(textView.getText());
                }
                TL_stars.SavedStarGift savedStarGift2 = this.userGift;
                if (savedStarGift2 != null && savedStarGift2.unsaved) {
                    sb.append(", ");
                    sb.append(LocaleController.getString(R.string.Gift2FilterHidden));
                }
                TL_stars.SavedStarGift savedStarGift3 = this.userGift;
                if (savedStarGift3 != null && !(savedStarGift3.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift3.name_hidden && (backupImageView = this.avatarView) != null && backupImageView.getVisibility() == 0) {
                    long peerDialogId = DialogObject.getPeerDialogId(this.userGift.from_id);
                    if (peerDialogId != 0) {
                        int i = this.currentAccount;
                        if (peerDialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
                            if (user != null) {
                                userName = UserObject.getUserName(user);
                                str = userName;
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
                            if (chat != null) {
                                userName = chat.title;
                                str = userName;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb.append(", ");
                            sb.append((CharSequence) str);
                        }
                    }
                }
                CheckBox2 checkBox2 = this.checkBox;
                if (checkBox2 != null && checkBox2.checkBoxBase.isChecked) {
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(true);
                }
                accessibilityNodeInfo.setContentDescription(sb.toString());
            } catch (Exception unused) {
            }
        }

        public final void setChecked(boolean z, boolean z2) {
            if (this.checkBox == null) {
                CheckBox2 checkBox2 = new CheckBox2(getContext(), 21);
                this.checkBox = checkBox2;
                checkBox2.checkBoxBase.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
                this.checkBox.setDrawUnchecked(false);
                this.card.addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
            }
            this.avatarView.setVisibility(8);
            this.checkBox.checkBoxBase.setChecked(-1, z, z2);
        }

        public void setImageLayer(int i) {
            this.imageView.setLayerNum(i);
        }

        public void setImageSize(int i) {
            FrameLayout.LayoutParams layoutParams = this.imageViewLayoutParams;
            layoutParams.width = i;
            layoutParams.height = i;
        }

        public final void setPinned(boolean z, boolean z2) {
            TL_stars.SavedStarGift savedStarGift;
            if (this.pinned == z) {
                return;
            }
            this.pinned = z;
            FrameLayout frameLayout = this.pinnedView;
            boolean z3 = false;
            if (z2) {
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new GiftSheet$GiftCell$$ExternalSyntheticLambda1(this, z, 1)).start();
            } else {
                frameLayout.setVisibility(z ? 0 : 8);
                frameLayout.setAlpha(z ? 1.0f : 0.0f);
                frameLayout.setScaleX(z ? 1.0f : 0.3f);
                frameLayout.setScaleY(z ? 1.0f : 0.3f);
            }
            if (!this.pinned && this.reordering && !this.inCollection && (savedStarGift = this.userGift) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                z3 = true;
            }
            setShowPinIcon(z3, z2);
            updateRibbonText();
        }

        public final void setReordering(boolean z, boolean z2) {
            TL_stars.SavedStarGift savedStarGift;
            if (this.reordering == z) {
                return;
            }
            this.reordering = z;
            if (!z2) {
                this.animatedReordering.force(z);
            }
            invalidate();
            setShowPinIcon((this.pinned || !z || this.inCollection || (savedStarGift = this.userGift) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z2);
        }

        public void setRibbonColor(int i) {
            Ribbon ribbon = this.ribbon;
            ribbon.setColor(i);
            ribbon.invalidate();
        }

        public void setRibbonText(String str) {
            this.ribbon.setText(str, true);
        }

        public void setRibbonTextOneOf(int i) {
            Ribbon ribbon = this.ribbon;
            ribbon.setVisibility(0);
            ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
            ribbon.setStrokeColor(0);
            ribbon.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
            ribbon.setText(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i, 0)), true);
        }

        public final void setSelected(boolean z, boolean z2) {
            this.cardBackground.setSelected(z, z2);
            ImageView imageView = this.tonOnlySaleView;
            if (z2) {
                imageView.animate().translationX(z ? AndroidUtilities.dp(6.0f) : 0.0f).translationY(z ? AndroidUtilities.dp(6.0f) : 0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                return;
            }
            imageView.animate().cancel();
            imageView.setTranslationX(z ? AndroidUtilities.dp(6.0f) : 0.0f);
            imageView.setTranslationY(z ? AndroidUtilities.dp(6.0f) : 0.0f);
        }

        public final void setShowPinIcon(boolean z, boolean z2) {
            if (this.pinnedIcon == z) {
                return;
            }
            this.pinnedIcon = z;
            PremiumLockIconView premiumLockIconView = this.pinView;
            if (z2) {
                premiumLockIconView.setVisibility(0);
                premiumLockIconView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new GiftSheet$GiftCell$$ExternalSyntheticLambda1(this, z, 0)).start();
            } else {
                premiumLockIconView.setVisibility(z ? 0 : 8);
                premiumLockIconView.setAlpha(z ? 1.0f : 0.0f);
                premiumLockIconView.setScaleX(z ? 1.0f : 0.3f);
                premiumLockIconView.setScaleY(z ? 1.0f : 0.3f);
            }
        }

        public final void setStarsGift(TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            BackupImageView backupImageView;
            TL_stars.StarGift starGift2;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
            boolean z6;
            int[] iArr;
            Theme.ResourcesProvider resourcesProvider;
            long j;
            ImageView imageView;
            int i;
            TextView textView;
            int i2;
            float fDp;
            float fDp2;
            long j2;
            BackupImageView backupImageView2;
            int i3;
            ColorFilter colorFilter;
            TextView textView2;
            int i4;
            StarsBackgroundView starsBackgroundView;
            long j3;
            long j4;
            boolean z7;
            boolean z8;
            String str;
            boolean z9;
            int i5;
            int i6;
            int i7;
            int iBlendOver;
            long j5;
            long j6;
            long j7;
            int iBlendOver2;
            int i8;
            String strPercents;
            boolean z10;
            StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda18 = this.cancel;
            if (stickersActivity$$ExternalSyntheticLambda18 != null) {
                stickersActivity$$ExternalSyntheticLambda18.run();
                this.cancel = null;
            }
            TLRPC.Document document = starGift.getDocument();
            BackupImageView backupImageView3 = this.imageView;
            if (document != null) {
                if (this.lastDocument != document) {
                    this.lastDocument = document;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                    backupImageView = backupImageView3;
                    starGift2 = starGift;
                    backupImageView.setImage(forDocument, "80_80_nolimit_pcache", forDocument2, "80_80_nolimit_pcache", svgThumb, starGift2);
                }
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
                CardBackground cardBackground = this.cardBackground;
                cardBackground.setBackdrop(stargiftattributebackdrop);
                cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                z6 = starGift2.auction;
                iArr = PREMIUM_STROKE;
                resourcesProvider = this.resourcesProvider;
                if (!z6 && (!(z10 = starGift2.sold_out) || this.priotityAuction)) {
                    j = 0;
                    if (!z3 || starGift2.availability_resale <= 0) {
                        if (z10) {
                            int i9 = Theme.key_gift_ribbon_soldout;
                            cardBackground.setStrokeColors(new int[]{Theme.getColor(i9, resourcesProvider), Theme.getColor(i9, resourcesProvider)});
                        } else {
                            cardBackground.setStrokeColors(iArr);
                        }
                    }
                    this.titleView.setVisibility(8);
                    this.subtitleView.setVisibility(8);
                    backupImageView.setTranslationY(0.0f);
                    this.lockView.setVisibility(8);
                    imageView = this.tonOnlySaleView;
                    if (starGift2.resale_ton_only) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    imageView.setVisibility(i);
                    textView = this.chanceTextView;
                    if (z5) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    textView.setVisibility(i2);
                    if (starGift2.resale_ton_only) {
                        fDp = AndroidUtilities.dp(23.0f);
                    } else {
                        fDp = 0.0f;
                    }
                    textView.setTranslationX(fDp);
                    if (starGift2.resale_ton_only) {
                        fDp2 = AndroidUtilities.dp(1.0f);
                    } else {
                        fDp2 = 0.0f;
                    }
                    textView.setTranslationY(fDp2);
                    j2 = j;
                    if (z5) {
                        StringBuilder sb = new StringBuilder("+");
                        i8 = starGift2.craft_chance_permille;
                        if (i8 <= 0) {
                            strPercents = "<0.1%";
                        } else {
                            strPercents = AffiliateProgramFragment.percents(i8);
                        }
                        sb.append((Object) strPercents);
                        textView.setText(sb.toString());
                    }
                    FrameLayout.LayoutParams layoutParams = this.imageViewLayoutParams;
                    layoutParams.gravity = 49;
                    backupImageView.setLayoutParams(layoutParams);
                    backupImageView2 = this.avatarView;
                    i3 = this.currentAccount;
                    if (!z4) {
                        if ((z3 || starGift2.availability_resale <= j2) && starGift2.locked_until_date > ConnectionsManager.getInstance(i3).getCurrentTime()) {
                            backupImageView2.setVisibility(0);
                            backupImageView2.setLayoutParams(this.avatarViewLayout2);
                            backupImageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_color_red, resourcesProvider), PorterDuff.Mode.SRC_IN));
                            backupImageView2.setImageResource(R.drawable.mini_gift_lock);
                        } else {
                            colorFilter = null;
                        }
                        textView2 = this.priceView;
                        if (z5 || z4) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        textView2.setVisibility(i4);
                        textView2.setTextSize(1, 12.0f);
                        starsBackgroundView = this.priceBackground;
                        if (z) {
                            textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                            textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
                            if (stargiftattributebackdrop != null) {
                                iBlendOver2 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                            } else {
                                iBlendOver2 = 1090519039;
                            }
                            int iDp = AndroidUtilities.dp(13.0f);
                            int iBlendOver3 = Theme.blendOver(iBlendOver2, 822083583);
                            int i10 = iBlendOver2;
                            starsBackgroundView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, i10, iBlendOver3, iBlendOver3));
                            textView2.setTextColor(-1);
                            imageView.setColorFilter(-1);
                            int iDp2 = AndroidUtilities.dp(10.0f);
                            int iBlendOver4 = Theme.blendOver(i10, 822083583);
                            imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, i10, iBlendOver4, iBlendOver4));
                        } else if (z4) {
                            textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                            long resellStars = starGift2.getResellStars();
                            int iBlendOver5 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                            textView2.setText(StarsIntroActivity.replaceStars(BillingController$$ExternalSyntheticOutline0.m(resellStars, ',', new StringBuilder("XTR ")), 1.13f, (ColoredImageSpan[]) null));
                            starsBackgroundView.setBackground(new StarsBackground(1895825407, iBlendOver5));
                            textView2.setTextColor(-1);
                            imageView.setColorFilter(-1);
                            imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver5));
                            textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver5));
                        } else {
                            textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                            if (z3) {
                                j5 = starGift2.availability_resale;
                                if (j5 > j2) {
                                    j6 = starGift2.resell_min_stars;
                                    if (j5 > 1) {
                                        j7 = j6;
                                        if (j7 < MessagesController.getInstance(i3).config.starsStarGiftResaleAmountMax.get()) {
                                            j4 = j7;
                                            z7 = true;
                                        }
                                    } else {
                                        j7 = j6;
                                    }
                                    j4 = j7;
                                } else {
                                    long j8 = starGift2.stars;
                                    if (z2 || !starGift2.can_upgrade) {
                                        j3 = j2;
                                    } else {
                                        j3 = starGift2.upgrade_stars;
                                    }
                                    j4 = j8 + j3;
                                }
                                z7 = false;
                            } else {
                                long j9 = starGift2.stars;
                                if (z2) {
                                    j3 = j2;
                                } else {
                                    j3 = j2;
                                }
                                j4 = j9 + j3;
                                z7 = false;
                            }
                            z8 = z7;
                            if (starGift2.auction || starGift2.availability_resale != j2) {
                                StringBuilder sb2 = new StringBuilder("XTR ");
                                sb2.append(LocaleController.formatNumber(j4, ','));
                                if (z8) {
                                    str = "+";
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb2.toString(), 0.71f, null));
                            } else {
                                textView2.setText(LocaleController.getString(starGift2.sold_out ? R.string.Gift2AuctionPriceView : R.string.Gift2AuctionPriceJoin));
                            }
                            z9 = starGift2 instanceof TL_stars.TL_starGiftUnique;
                            if (z9) {
                                i5 = 1090519039;
                            } else if (Theme.currentTheme.isDark()) {
                                i5 = 518759725;
                            } else {
                                i5 = 1088989954;
                            }
                            starsBackgroundView.setBackground(new StarsBackground(ColorUtils.setAlphaComponent(i5, 128), i5));
                            if (Theme.currentTheme.isDark()) {
                                i6 = -1333971;
                            } else {
                                i6 = -2722014;
                            }
                            textView2.setTextColor(i6);
                            imageView.setColorFilter(Theme.currentTheme.isDark() ? -1333971 : -2722014);
                            int iDp3 = AndroidUtilities.dp(10.0f);
                            if (z9) {
                                i7 = 1090519039;
                            } else if (Theme.currentTheme.isDark()) {
                                i7 = 518759725;
                            } else {
                                i7 = 1088989954;
                            }
                            imageView.setBackground(Theme.createRoundRectDrawable(iDp3, i7));
                            if (stargiftattributebackdrop != null) {
                                iBlendOver = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                            } else {
                                iBlendOver = 0;
                            }
                            textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver));
                        }
                        LoginActivity.AnonymousClass4 anonymousClass4 = this.priceLayout;
                        ((ViewGroup.MarginLayoutParams) anonymousClass4.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                        ((FrameLayout.LayoutParams) anonymousClass4.getLayoutParams()).gravity = 49;
                        this.starsPriceView.setVisibility(8);
                        this.lastTier = null;
                        this.premiumTier = null;
                        this.gift = starGift2;
                        this.giftMine = z;
                        this.userGift = null;
                        this.allowResaleInGifts = z3;
                        this.inResalePage = z4;
                        this.inCollection = false;
                        this.inCrafting = z5;
                        this.title = null;
                        this.subtitle = null;
                        setPinned(false, false);
                        updateRibbonText();
                    }
                    colorFilter = null;
                    backupImageView2.setColorFilter(colorFilter);
                    backupImageView2.setVisibility(8);
                    textView2 = this.priceView;
                    if (z5) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                    }
                    textView2.setVisibility(i4);
                    textView2.setTextSize(1, 12.0f);
                    starsBackgroundView = this.priceBackground;
                    if (z) {
                        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                        textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
                        if (stargiftattributebackdrop != null) {
                            iBlendOver2 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                        } else {
                            iBlendOver2 = 1090519039;
                        }
                        int iDp4 = AndroidUtilities.dp(13.0f);
                        int iBlendOver6 = Theme.blendOver(iBlendOver2, 822083583);
                        int i11 = iBlendOver2;
                        starsBackgroundView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp4, iDp4, iDp4, iDp4, i11, iBlendOver6, iBlendOver6));
                        textView2.setTextColor(-1);
                        imageView.setColorFilter(-1);
                        int iDp5 = AndroidUtilities.dp(10.0f);
                        int iBlendOver7 = Theme.blendOver(i11, 822083583);
                        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp5, iDp5, iDp5, iDp5, i11, iBlendOver7, iBlendOver7));
                    } else if (z4) {
                        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                        long resellStars2 = starGift2.getResellStars();
                        int iBlendOver8 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                        textView2.setText(StarsIntroActivity.replaceStars(BillingController$$ExternalSyntheticOutline0.m(resellStars2, ',', new StringBuilder("XTR ")), 1.13f, (ColoredImageSpan[]) null));
                        starsBackgroundView.setBackground(new StarsBackground(1895825407, iBlendOver8));
                        textView2.setTextColor(-1);
                        imageView.setColorFilter(-1);
                        imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver8));
                        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver8));
                    } else {
                        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                        if (z3) {
                            j5 = starGift2.availability_resale;
                            if (j5 > j2) {
                                j6 = starGift2.resell_min_stars;
                                if (j5 > 1) {
                                    j7 = j6;
                                    if (j7 < MessagesController.getInstance(i3).config.starsStarGiftResaleAmountMax.get()) {
                                        j4 = j7;
                                        z7 = true;
                                    }
                                } else {
                                    j7 = j6;
                                }
                                j4 = j7;
                            } else {
                                long j10 = starGift2.stars;
                                if (z2) {
                                    j3 = j2;
                                } else {
                                    j3 = j2;
                                }
                                j4 = j10 + j3;
                            }
                            z7 = false;
                        } else {
                            long j11 = starGift2.stars;
                            if (z2) {
                                j3 = j2;
                            } else {
                                j3 = j2;
                            }
                            j4 = j11 + j3;
                            z7 = false;
                        }
                        z8 = z7;
                        if (starGift2.auction) {
                            StringBuilder sb3 = new StringBuilder("XTR ");
                            sb3.append(LocaleController.formatNumber(j4, ','));
                            if (z8) {
                                str = "+";
                            } else {
                                str = "";
                            }
                            sb3.append(str);
                            textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb3.toString(), 0.71f, null));
                        } else {
                            StringBuilder sb4 = new StringBuilder("XTR ");
                            sb4.append(LocaleController.formatNumber(j4, ','));
                            if (z8) {
                                str = "+";
                            } else {
                                str = "";
                            }
                            sb4.append(str);
                            textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb4.toString(), 0.71f, null));
                        }
                        z9 = starGift2 instanceof TL_stars.TL_starGiftUnique;
                        if (z9) {
                            i5 = 1090519039;
                        } else if (Theme.currentTheme.isDark()) {
                            i5 = 518759725;
                        } else {
                            i5 = 1088989954;
                        }
                        starsBackgroundView.setBackground(new StarsBackground(ColorUtils.setAlphaComponent(i5, 128), i5));
                        if (Theme.currentTheme.isDark()) {
                            i6 = -1333971;
                        } else {
                            i6 = -2722014;
                        }
                        textView2.setTextColor(i6);
                        imageView.setColorFilter(Theme.currentTheme.isDark() ? -1333971 : -2722014);
                        int iDp6 = AndroidUtilities.dp(10.0f);
                        if (z9) {
                            i7 = 1090519039;
                        } else if (Theme.currentTheme.isDark()) {
                            i7 = 518759725;
                        } else {
                            i7 = 1088989954;
                        }
                        imageView.setBackground(Theme.createRoundRectDrawable(iDp6, i7));
                        if (stargiftattributebackdrop != null) {
                            iBlendOver = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                        } else {
                            iBlendOver = 0;
                        }
                        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver));
                    }
                    LoginActivity.AnonymousClass4 anonymousClass5 = this.priceLayout;
                    ((ViewGroup.MarginLayoutParams) anonymousClass5.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                    ((FrameLayout.LayoutParams) anonymousClass5.getLayoutParams()).gravity = 49;
                    this.starsPriceView.setVisibility(8);
                    this.lastTier = null;
                    this.premiumTier = null;
                    this.gift = starGift2;
                    this.giftMine = z;
                    this.userGift = null;
                    this.allowResaleInGifts = z3;
                    this.inResalePage = z4;
                    this.inCollection = false;
                    this.inCrafting = z5;
                    this.title = null;
                    this.subtitle = null;
                    setPinned(false, false);
                    updateRibbonText();
                }
                j = 0;
                if (starGift2.require_premium || (z3 && starGift2.availability_resale > j)) {
                    iArr = null;
                }
                cardBackground.setStrokeColors(iArr);
                this.titleView.setVisibility(8);
                this.subtitleView.setVisibility(8);
                backupImageView.setTranslationY(0.0f);
                this.lockView.setVisibility(8);
                imageView = this.tonOnlySaleView;
                if (starGift2.resale_ton_only) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                textView = this.chanceTextView;
                if (z5) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                if (starGift2.resale_ton_only) {
                    fDp = AndroidUtilities.dp(23.0f);
                } else {
                    fDp = 0.0f;
                }
                textView.setTranslationX(fDp);
                if (starGift2.resale_ton_only) {
                    fDp2 = AndroidUtilities.dp(1.0f);
                } else {
                    fDp2 = 0.0f;
                }
                textView.setTranslationY(fDp2);
                j2 = j;
                if (z5) {
                    StringBuilder sb5 = new StringBuilder("+");
                    i8 = starGift2.craft_chance_permille;
                    if (i8 <= 0) {
                        strPercents = "<0.1%";
                    } else {
                        strPercents = AffiliateProgramFragment.percents(i8);
                    }
                    sb5.append((Object) strPercents);
                    textView.setText(sb5.toString());
                }
                FrameLayout.LayoutParams layoutParams2 = this.imageViewLayoutParams;
                layoutParams2.gravity = 49;
                backupImageView.setLayoutParams(layoutParams2);
                backupImageView2 = this.avatarView;
                i3 = this.currentAccount;
                if (!z4) {
                    if (z3) {
                        backupImageView2.setVisibility(0);
                        backupImageView2.setLayoutParams(this.avatarViewLayout2);
                        backupImageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_color_red, resourcesProvider), PorterDuff.Mode.SRC_IN));
                        backupImageView2.setImageResource(R.drawable.mini_gift_lock);
                    } else {
                        backupImageView2.setVisibility(0);
                        backupImageView2.setLayoutParams(this.avatarViewLayout2);
                        backupImageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_color_red, resourcesProvider), PorterDuff.Mode.SRC_IN));
                        backupImageView2.setImageResource(R.drawable.mini_gift_lock);
                    }
                    textView2 = this.priceView;
                    if (z5) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                    }
                    textView2.setVisibility(i4);
                    textView2.setTextSize(1, 12.0f);
                    starsBackgroundView = this.priceBackground;
                    if (z) {
                        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                        textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
                        if (stargiftattributebackdrop != null) {
                            iBlendOver2 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                        } else {
                            iBlendOver2 = 1090519039;
                        }
                        int iDp7 = AndroidUtilities.dp(13.0f);
                        int iBlendOver9 = Theme.blendOver(iBlendOver2, 822083583);
                        int i12 = iBlendOver2;
                        starsBackgroundView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp7, iDp7, iDp7, iDp7, i12, iBlendOver9, iBlendOver9));
                        textView2.setTextColor(-1);
                        imageView.setColorFilter(-1);
                        int iDp8 = AndroidUtilities.dp(10.0f);
                        int iBlendOver10 = Theme.blendOver(i12, 822083583);
                        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp8, iDp8, iDp8, iDp8, i12, iBlendOver10, iBlendOver10));
                    } else if (z4) {
                        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                        long resellStars3 = starGift2.getResellStars();
                        int iBlendOver11 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                        textView2.setText(StarsIntroActivity.replaceStars(BillingController$$ExternalSyntheticOutline0.m(resellStars3, ',', new StringBuilder("XTR ")), 1.13f, (ColoredImageSpan[]) null));
                        starsBackgroundView.setBackground(new StarsBackground(1895825407, iBlendOver11));
                        textView2.setTextColor(-1);
                        imageView.setColorFilter(-1);
                        imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver11));
                        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver11));
                    } else {
                        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                        if (z3) {
                            j5 = starGift2.availability_resale;
                            if (j5 > j2) {
                                j6 = starGift2.resell_min_stars;
                                if (j5 > 1) {
                                    j7 = j6;
                                    if (j7 < MessagesController.getInstance(i3).config.starsStarGiftResaleAmountMax.get()) {
                                        j4 = j7;
                                        z7 = true;
                                    }
                                } else {
                                    j7 = j6;
                                }
                                j4 = j7;
                            } else {
                                long j12 = starGift2.stars;
                                if (z2) {
                                    j3 = j2;
                                } else {
                                    j3 = j2;
                                }
                                j4 = j12 + j3;
                            }
                            z7 = false;
                        } else {
                            long j13 = starGift2.stars;
                            if (z2) {
                                j3 = j2;
                            } else {
                                j3 = j2;
                            }
                            j4 = j13 + j3;
                            z7 = false;
                        }
                        z8 = z7;
                        if (starGift2.auction) {
                            StringBuilder sb6 = new StringBuilder("XTR ");
                            sb6.append(LocaleController.formatNumber(j4, ','));
                            if (z8) {
                                str = "+";
                            } else {
                                str = "";
                            }
                            sb6.append(str);
                            textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb6.toString(), 0.71f, null));
                        } else {
                            StringBuilder sb7 = new StringBuilder("XTR ");
                            sb7.append(LocaleController.formatNumber(j4, ','));
                            if (z8) {
                                str = "+";
                            } else {
                                str = "";
                            }
                            sb7.append(str);
                            textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb7.toString(), 0.71f, null));
                        }
                        z9 = starGift2 instanceof TL_stars.TL_starGiftUnique;
                        if (z9) {
                            i5 = 1090519039;
                        } else if (Theme.currentTheme.isDark()) {
                            i5 = 518759725;
                        } else {
                            i5 = 1088989954;
                        }
                        starsBackgroundView.setBackground(new StarsBackground(ColorUtils.setAlphaComponent(i5, 128), i5));
                        if (Theme.currentTheme.isDark()) {
                            i6 = -1333971;
                        } else {
                            i6 = -2722014;
                        }
                        textView2.setTextColor(i6);
                        imageView.setColorFilter(Theme.currentTheme.isDark() ? -1333971 : -2722014);
                        int iDp9 = AndroidUtilities.dp(10.0f);
                        if (z9) {
                            i7 = 1090519039;
                        } else if (Theme.currentTheme.isDark()) {
                            i7 = 518759725;
                        } else {
                            i7 = 1088989954;
                        }
                        imageView.setBackground(Theme.createRoundRectDrawable(iDp9, i7));
                        if (stargiftattributebackdrop != null) {
                            iBlendOver = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                        } else {
                            iBlendOver = 0;
                        }
                        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver));
                    }
                    LoginActivity.AnonymousClass4 anonymousClass6 = this.priceLayout;
                    ((ViewGroup.MarginLayoutParams) anonymousClass6.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                    ((FrameLayout.LayoutParams) anonymousClass6.getLayoutParams()).gravity = 49;
                    this.starsPriceView.setVisibility(8);
                    this.lastTier = null;
                    this.premiumTier = null;
                    this.gift = starGift2;
                    this.giftMine = z;
                    this.userGift = null;
                    this.allowResaleInGifts = z3;
                    this.inResalePage = z4;
                    this.inCollection = false;
                    this.inCrafting = z5;
                    this.title = null;
                    this.subtitle = null;
                    setPinned(false, false);
                    updateRibbonText();
                }
                colorFilter = null;
                backupImageView2.setColorFilter(colorFilter);
                backupImageView2.setVisibility(8);
                textView2 = this.priceView;
                if (z5) {
                    i4 = 0;
                } else {
                    i4 = 0;
                }
                textView2.setVisibility(i4);
                textView2.setTextSize(1, 12.0f);
                starsBackgroundView = this.priceBackground;
                if (z) {
                    textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
                    if (stargiftattributebackdrop != null) {
                        iBlendOver2 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    } else {
                        iBlendOver2 = 1090519039;
                    }
                    int iDp10 = AndroidUtilities.dp(13.0f);
                    int iBlendOver12 = Theme.blendOver(iBlendOver2, 822083583);
                    int i13 = iBlendOver2;
                    starsBackgroundView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp10, iDp10, iDp10, iDp10, i13, iBlendOver12, iBlendOver12));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int iDp11 = AndroidUtilities.dp(10.0f);
                    int iBlendOver13 = Theme.blendOver(i13, 822083583);
                    imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp11, iDp11, iDp11, iDp11, i13, iBlendOver13, iBlendOver13));
                } else if (z4) {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    long resellStars4 = starGift2.getResellStars();
                    int iBlendOver14 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    textView2.setText(StarsIntroActivity.replaceStars(BillingController$$ExternalSyntheticOutline0.m(resellStars4, ',', new StringBuilder("XTR ")), 1.13f, (ColoredImageSpan[]) null));
                    starsBackgroundView.setBackground(new StarsBackground(1895825407, iBlendOver14));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver14));
                    textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver14));
                } else {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    if (z3) {
                        j5 = starGift2.availability_resale;
                        if (j5 > j2) {
                            j6 = starGift2.resell_min_stars;
                            if (j5 > 1) {
                                j7 = j6;
                                if (j7 < MessagesController.getInstance(i3).config.starsStarGiftResaleAmountMax.get()) {
                                    j4 = j7;
                                    z7 = true;
                                }
                            } else {
                                j7 = j6;
                            }
                            j4 = j7;
                        } else {
                            long j14 = starGift2.stars;
                            if (z2) {
                                j3 = j2;
                            } else {
                                j3 = j2;
                            }
                            j4 = j14 + j3;
                        }
                        z7 = false;
                    } else {
                        long j15 = starGift2.stars;
                        if (z2) {
                            j3 = j2;
                        } else {
                            j3 = j2;
                        }
                        j4 = j15 + j3;
                        z7 = false;
                    }
                    z8 = z7;
                    if (starGift2.auction) {
                        StringBuilder sb8 = new StringBuilder("XTR ");
                        sb8.append(LocaleController.formatNumber(j4, ','));
                        if (z8) {
                            str = "+";
                        } else {
                            str = "";
                        }
                        sb8.append(str);
                        textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb8.toString(), 0.71f, null));
                    } else {
                        StringBuilder sb9 = new StringBuilder("XTR ");
                        sb9.append(LocaleController.formatNumber(j4, ','));
                        if (z8) {
                            str = "+";
                        } else {
                            str = "";
                        }
                        sb9.append(str);
                        textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb9.toString(), 0.71f, null));
                    }
                    z9 = starGift2 instanceof TL_stars.TL_starGiftUnique;
                    if (z9) {
                        i5 = 1090519039;
                    } else if (Theme.currentTheme.isDark()) {
                        i5 = 518759725;
                    } else {
                        i5 = 1088989954;
                    }
                    starsBackgroundView.setBackground(new StarsBackground(ColorUtils.setAlphaComponent(i5, 128), i5));
                    if (Theme.currentTheme.isDark()) {
                        i6 = -1333971;
                    } else {
                        i6 = -2722014;
                    }
                    textView2.setTextColor(i6);
                    imageView.setColorFilter(Theme.currentTheme.isDark() ? -1333971 : -2722014);
                    int iDp12 = AndroidUtilities.dp(10.0f);
                    if (z9) {
                        i7 = 1090519039;
                    } else if (Theme.currentTheme.isDark()) {
                        i7 = 518759725;
                    } else {
                        i7 = 1088989954;
                    }
                    imageView.setBackground(Theme.createRoundRectDrawable(iDp12, i7));
                    if (stargiftattributebackdrop != null) {
                        iBlendOver = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    } else {
                        iBlendOver = 0;
                    }
                    textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver));
                }
                LoginActivity.AnonymousClass4 anonymousClass7 = this.priceLayout;
                ((ViewGroup.MarginLayoutParams) anonymousClass7.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                ((FrameLayout.LayoutParams) anonymousClass7.getLayoutParams()).gravity = 49;
                this.starsPriceView.setVisibility(8);
                this.lastTier = null;
                this.premiumTier = null;
                this.gift = starGift2;
                this.giftMine = z;
                this.userGift = null;
                this.allowResaleInGifts = z3;
                this.inResalePage = z4;
                this.inCollection = false;
                this.inCrafting = z5;
                this.title = null;
                this.subtitle = null;
                setPinned(false, false);
                updateRibbonText();
            }
            backupImageView3.imageReceiver.clearImage();
            this.lastDocument = null;
            starGift2 = starGift;
            backupImageView = backupImageView3;
            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
            CardBackground cardBackground2 = this.cardBackground;
            cardBackground2.setBackdrop(stargiftattributebackdrop);
            cardBackground2.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
            z6 = starGift2.auction;
            iArr = PREMIUM_STROKE;
            resourcesProvider = this.resourcesProvider;
            if (!z6) {
                j = 0;
                if (starGift2.require_premium) {
                    iArr = null;
                } else {
                    iArr = null;
                }
                cardBackground2.setStrokeColors(iArr);
            } else {
                j = 0;
                if (starGift2.require_premium) {
                    iArr = null;
                } else {
                    iArr = null;
                }
                cardBackground2.setStrokeColors(iArr);
            }
            this.titleView.setVisibility(8);
            this.subtitleView.setVisibility(8);
            backupImageView.setTranslationY(0.0f);
            this.lockView.setVisibility(8);
            imageView = this.tonOnlySaleView;
            if (starGift2.resale_ton_only) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            textView = this.chanceTextView;
            if (z5) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            if (starGift2.resale_ton_only) {
                fDp = AndroidUtilities.dp(23.0f);
            } else {
                fDp = 0.0f;
            }
            textView.setTranslationX(fDp);
            if (starGift2.resale_ton_only) {
                fDp2 = AndroidUtilities.dp(1.0f);
            } else {
                fDp2 = 0.0f;
            }
            textView.setTranslationY(fDp2);
            j2 = j;
            if (z5) {
                StringBuilder sb10 = new StringBuilder("+");
                i8 = starGift2.craft_chance_permille;
                if (i8 <= 0) {
                    strPercents = "<0.1%";
                } else {
                    strPercents = AffiliateProgramFragment.percents(i8);
                }
                sb10.append((Object) strPercents);
                textView.setText(sb10.toString());
            }
            FrameLayout.LayoutParams layoutParams3 = this.imageViewLayoutParams;
            layoutParams3.gravity = 49;
            backupImageView.setLayoutParams(layoutParams3);
            backupImageView2 = this.avatarView;
            i3 = this.currentAccount;
            if (!z4) {
                if (z3) {
                    backupImageView2.setVisibility(0);
                    backupImageView2.setLayoutParams(this.avatarViewLayout2);
                    backupImageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_color_red, resourcesProvider), PorterDuff.Mode.SRC_IN));
                    backupImageView2.setImageResource(R.drawable.mini_gift_lock);
                } else {
                    backupImageView2.setVisibility(0);
                    backupImageView2.setLayoutParams(this.avatarViewLayout2);
                    backupImageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_color_red, resourcesProvider), PorterDuff.Mode.SRC_IN));
                    backupImageView2.setImageResource(R.drawable.mini_gift_lock);
                }
                textView2 = this.priceView;
                if (z5) {
                    i4 = 0;
                } else {
                    i4 = 0;
                }
                textView2.setVisibility(i4);
                textView2.setTextSize(1, 12.0f);
                starsBackgroundView = this.priceBackground;
                if (z) {
                    textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
                    if (stargiftattributebackdrop != null) {
                        iBlendOver2 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    } else {
                        iBlendOver2 = 1090519039;
                    }
                    int iDp13 = AndroidUtilities.dp(13.0f);
                    int iBlendOver15 = Theme.blendOver(iBlendOver2, 822083583);
                    int i14 = iBlendOver2;
                    starsBackgroundView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp13, iDp13, iDp13, iDp13, i14, iBlendOver15, iBlendOver15));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int iDp14 = AndroidUtilities.dp(10.0f);
                    int iBlendOver16 = Theme.blendOver(i14, 822083583);
                    imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp14, iDp14, iDp14, iDp14, i14, iBlendOver16, iBlendOver16));
                } else if (z4) {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    long resellStars5 = starGift2.getResellStars();
                    int iBlendOver17 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    textView2.setText(StarsIntroActivity.replaceStars(BillingController$$ExternalSyntheticOutline0.m(resellStars5, ',', new StringBuilder("XTR ")), 1.13f, (ColoredImageSpan[]) null));
                    starsBackgroundView.setBackground(new StarsBackground(1895825407, iBlendOver17));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver17));
                    textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver17));
                } else {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    if (z3) {
                        j5 = starGift2.availability_resale;
                        if (j5 > j2) {
                            j6 = starGift2.resell_min_stars;
                            if (j5 > 1) {
                                j7 = j6;
                                if (j7 < MessagesController.getInstance(i3).config.starsStarGiftResaleAmountMax.get()) {
                                    j4 = j7;
                                    z7 = true;
                                }
                            } else {
                                j7 = j6;
                            }
                            j4 = j7;
                        } else {
                            long j16 = starGift2.stars;
                            if (z2) {
                                j3 = j2;
                            } else {
                                j3 = j2;
                            }
                            j4 = j16 + j3;
                        }
                        z7 = false;
                    } else {
                        long j17 = starGift2.stars;
                        if (z2) {
                            j3 = j2;
                        } else {
                            j3 = j2;
                        }
                        j4 = j17 + j3;
                        z7 = false;
                    }
                    z8 = z7;
                    if (starGift2.auction) {
                        StringBuilder sb11 = new StringBuilder("XTR ");
                        sb11.append(LocaleController.formatNumber(j4, ','));
                        if (z8) {
                            str = "+";
                        } else {
                            str = "";
                        }
                        sb11.append(str);
                        textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb11.toString(), 0.71f, null));
                    } else {
                        StringBuilder sb12 = new StringBuilder("XTR ");
                        sb12.append(LocaleController.formatNumber(j4, ','));
                        if (z8) {
                            str = "+";
                        } else {
                            str = "";
                        }
                        sb12.append(str);
                        textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb12.toString(), 0.71f, null));
                    }
                    z9 = starGift2 instanceof TL_stars.TL_starGiftUnique;
                    if (z9) {
                        i5 = 1090519039;
                    } else if (Theme.currentTheme.isDark()) {
                        i5 = 518759725;
                    } else {
                        i5 = 1088989954;
                    }
                    starsBackgroundView.setBackground(new StarsBackground(ColorUtils.setAlphaComponent(i5, 128), i5));
                    if (Theme.currentTheme.isDark()) {
                        i6 = -1333971;
                    } else {
                        i6 = -2722014;
                    }
                    textView2.setTextColor(i6);
                    imageView.setColorFilter(Theme.currentTheme.isDark() ? -1333971 : -2722014);
                    int iDp15 = AndroidUtilities.dp(10.0f);
                    if (z9) {
                        i7 = 1090519039;
                    } else if (Theme.currentTheme.isDark()) {
                        i7 = 518759725;
                    } else {
                        i7 = 1088989954;
                    }
                    imageView.setBackground(Theme.createRoundRectDrawable(iDp15, i7));
                    if (stargiftattributebackdrop != null) {
                        iBlendOver = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    } else {
                        iBlendOver = 0;
                    }
                    textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver));
                }
                LoginActivity.AnonymousClass4 anonymousClass8 = this.priceLayout;
                ((ViewGroup.MarginLayoutParams) anonymousClass8.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                ((FrameLayout.LayoutParams) anonymousClass8.getLayoutParams()).gravity = 49;
                this.starsPriceView.setVisibility(8);
                this.lastTier = null;
                this.premiumTier = null;
                this.gift = starGift2;
                this.giftMine = z;
                this.userGift = null;
                this.allowResaleInGifts = z3;
                this.inResalePage = z4;
                this.inCollection = false;
                this.inCrafting = z5;
                this.title = null;
                this.subtitle = null;
                setPinned(false, false);
                updateRibbonText();
            }
            colorFilter = null;
            backupImageView2.setColorFilter(colorFilter);
            backupImageView2.setVisibility(8);
            textView2 = this.priceView;
            if (z5) {
                i4 = 0;
            } else {
                i4 = 0;
            }
            textView2.setVisibility(i4);
            textView2.setTextSize(1, 12.0f);
            starsBackgroundView = this.priceBackground;
            if (z) {
                textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
                if (stargiftattributebackdrop != null) {
                    iBlendOver2 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                } else {
                    iBlendOver2 = 1090519039;
                }
                int iDp16 = AndroidUtilities.dp(13.0f);
                int iBlendOver18 = Theme.blendOver(iBlendOver2, 822083583);
                int i15 = iBlendOver2;
                starsBackgroundView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp16, iDp16, iDp16, iDp16, i15, iBlendOver18, iBlendOver18));
                textView2.setTextColor(-1);
                imageView.setColorFilter(-1);
                int iDp17 = AndroidUtilities.dp(10.0f);
                int iBlendOver19 = Theme.blendOver(i15, 822083583);
                imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp17, iDp17, iDp17, iDp17, i15, iBlendOver19, iBlendOver19));
            } else if (z4) {
                textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                long resellStars6 = starGift2.getResellStars();
                int iBlendOver110 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                textView2.setText(StarsIntroActivity.replaceStars(BillingController$$ExternalSyntheticOutline0.m(resellStars6, ',', new StringBuilder("XTR ")), 1.13f, (ColoredImageSpan[]) null));
                starsBackgroundView.setBackground(new StarsBackground(1895825407, iBlendOver110));
                textView2.setTextColor(-1);
                imageView.setColorFilter(-1);
                imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver110));
                textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver110));
            } else {
                textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                if (z3) {
                    j5 = starGift2.availability_resale;
                    if (j5 > j2) {
                        j6 = starGift2.resell_min_stars;
                        if (j5 > 1) {
                            j7 = j6;
                            if (j7 < MessagesController.getInstance(i3).config.starsStarGiftResaleAmountMax.get()) {
                                j4 = j7;
                                z7 = true;
                            }
                        } else {
                            j7 = j6;
                        }
                        j4 = j7;
                    } else {
                        long j18 = starGift2.stars;
                        if (z2) {
                            j3 = j2;
                        } else {
                            j3 = j2;
                        }
                        j4 = j18 + j3;
                    }
                    z7 = false;
                } else {
                    long j19 = starGift2.stars;
                    if (z2) {
                        j3 = j2;
                    } else {
                        j3 = j2;
                    }
                    j4 = j19 + j3;
                    z7 = false;
                }
                z8 = z7;
                if (starGift2.auction) {
                    StringBuilder sb13 = new StringBuilder("XTR ");
                    sb13.append(LocaleController.formatNumber(j4, ','));
                    if (z8) {
                        str = "+";
                    } else {
                        str = "";
                    }
                    sb13.append(str);
                    textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb13.toString(), 0.71f, null));
                } else {
                    StringBuilder sb14 = new StringBuilder("XTR ");
                    sb14.append(LocaleController.formatNumber(j4, ','));
                    if (z8) {
                        str = "+";
                    } else {
                        str = "";
                    }
                    sb14.append(str);
                    textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb14.toString(), 0.71f, null));
                }
                z9 = starGift2 instanceof TL_stars.TL_starGiftUnique;
                if (z9) {
                    i5 = 1090519039;
                } else if (Theme.currentTheme.isDark()) {
                    i5 = 518759725;
                } else {
                    i5 = 1088989954;
                }
                starsBackgroundView.setBackground(new StarsBackground(ColorUtils.setAlphaComponent(i5, 128), i5));
                if (Theme.currentTheme.isDark()) {
                    i6 = -1333971;
                } else {
                    i6 = -2722014;
                }
                textView2.setTextColor(i6);
                imageView.setColorFilter(Theme.currentTheme.isDark() ? -1333971 : -2722014);
                int iDp18 = AndroidUtilities.dp(10.0f);
                if (z9) {
                    i7 = 1090519039;
                } else if (Theme.currentTheme.isDark()) {
                    i7 = 518759725;
                } else {
                    i7 = 1088989954;
                }
                imageView.setBackground(Theme.createRoundRectDrawable(iDp18, i7));
                if (stargiftattributebackdrop != null) {
                    iBlendOver = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                } else {
                    iBlendOver = 0;
                }
                textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver));
            }
            LoginActivity.AnonymousClass4 anonymousClass9 = this.priceLayout;
            ((ViewGroup.MarginLayoutParams) anonymousClass9.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
            ((FrameLayout.LayoutParams) anonymousClass9.getLayoutParams()).gravity = 49;
            this.starsPriceView.setVisibility(8);
            this.lastTier = null;
            this.premiumTier = null;
            this.gift = starGift2;
            this.giftMine = z;
            this.userGift = null;
            this.allowResaleInGifts = z3;
            this.inResalePage = z4;
            this.inCollection = false;
            this.inCrafting = z5;
            this.title = null;
            this.subtitle = null;
            setPinned(false, false);
            updateRibbonText();
        }

        public final void updateRibbonText() {
            TL_stars.SavedStarGift savedStarGift = this.userGift;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Ribbon ribbon = this.ribbon;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                    if (!starGift.limited) {
                        ribbon.setBackdrop(null);
                        ribbon.setVisibility(8);
                        return;
                    }
                    ribbon.setVisibility(0);
                    ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, resourcesProvider));
                    ribbon.setStrokeColor(0);
                    ribbon.setBackdrop(null);
                    ribbon.setText(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.userGift.gift.availability_total, 0)), true);
                    return;
                }
                ribbon.setVisibility(0);
                if (this.userGift.gift.resell_amount == null) {
                    ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, resourcesProvider));
                    ribbon.setStrokeColor(0);
                    ribbon.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.userGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    ribbon.setText(BillingController$$ExternalSyntheticOutline0.m(this.userGift.gift.num, ',', new StringBuilder("#")), true);
                    return;
                }
                int iBlendOver = Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.multAlpha(0.04f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider)));
                ribbon.setColor(Theme.getColor(Theme.key_color_green, resourcesProvider));
                ribbon.setStrokeColor(iBlendOver);
                ribbon.setBackdrop(null);
                ribbon.setText(LocaleController.getString(R.string.Gift2OnSale), false);
                return;
            }
            TL_stars.StarGift starGift2 = this.gift;
            if (starGift2 == null) {
                GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = this.premiumTier;
                if (giftPremiumBottomSheet$GiftTier != null) {
                    if (giftPremiumBottomSheet$GiftTier.getDiscount() <= 0) {
                        ribbon.setVisibility(8);
                        ribbon.setBackdrop(null);
                        ribbon.setStrokeColor(0);
                        return;
                    }
                    ribbon.setVisibility(0);
                    ribbon.setBackdrop(null);
                    ribbon.setColors(-2535425, -8229377);
                    ribbon.setStrokeColor(0);
                    String string = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.premiumTier.getDiscount()));
                    ribbon.currentText = string;
                    ribbon.drawable.setText(12, string, true);
                    return;
                }
                return;
            }
            if (this.inResalePage || this.inCrafting) {
                ribbon.setVisibility(0);
                ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, resourcesProvider));
                ribbon.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                ribbon.setStrokeColor(0);
                ribbon.setText(BillingController$$ExternalSyntheticOutline0.m(this.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            if (this.allowResaleInGifts && starGift2.availability_resale > 0) {
                ribbon.setVisibility(0);
                ribbon.setColor(Theme.getColor(Theme.key_color_green, resourcesProvider));
                ribbon.setStrokeColor(0);
                ribbon.setBackdrop(null);
                ribbon.setText(LocaleController.getString(R.string.Gift2Resale), false);
                return;
            }
            if (this.giftMine) {
                ribbon.setVisibility(0);
                ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, resourcesProvider));
                ribbon.setStrokeColor(0);
                ribbon.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                ribbon.setText(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.gift.availability_issued, 0)), true);
                return;
            }
            boolean z = starGift2.limited;
            if (z && starGift2.availability_remains <= 0) {
                ribbon.setVisibility(0);
                ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon_soldout, resourcesProvider));
                ribbon.setStrokeColor(0);
                ribbon.setBackdrop(null);
                ribbon.setText(LocaleController.getString(R.string.Gift2SoldOut), true);
                return;
            }
            if (starGift2.auction) {
                ribbon.setVisibility(0);
                ribbon.setBackdrop(null);
                ribbon.setColors(-2650077, -4227818);
                ribbon.setStrokeColor(0);
                if (this.gift.auction_start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    ribbon.setText(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                    return;
                } else {
                    ribbon.setText(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                    return;
                }
            }
            if (starGift2.require_premium) {
                ribbon.setVisibility(0);
                ribbon.setBackdrop(null);
                ribbon.setColors(-2650077, -4227818);
                ribbon.setStrokeColor(0);
                ribbon.setText(LocaleController.getString(R.string.Gift2LimitedPremium), true);
                return;
            }
            if (!z) {
                ribbon.setBackdrop(null);
                ribbon.setStrokeColor(0);
                ribbon.setVisibility(8);
            } else {
                ribbon.setVisibility(0);
                ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, resourcesProvider));
                ribbon.setStrokeColor(0);
                ribbon.setBackdrop(null);
                ribbon.setText(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
            }
        }

        public final boolean setStarsGift(TL_stars.SavedStarGift savedStarGift, boolean z, boolean z2) {
            BackupImageView backupImageView;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
            PremiumLockIconView premiumLockIconView;
            Integer numValueOf;
            Integer numValueOf2;
            ImageView imageView;
            int i;
            FrameLayout frameLayout;
            int i2;
            float f;
            float f2;
            int i3;
            boolean z3;
            BackupImageView backupImageView2;
            int i4;
            long peerDialogId;
            AvatarDrawable avatarDrawable;
            TLRPC.Chat chat;
            TLRPC.User user;
            TextView textView;
            StarsBackgroundView starsBackgroundView;
            LoginActivity.AnonymousClass4 anonymousClass4;
            int i5;
            TL_stars.StarGift starGift;
            long j;
            int i6;
            int i7;
            int i8;
            TL_stars.SavedStarGift savedStarGift2;
            boolean z4;
            boolean z5;
            ColoredImageSpan[] coloredImageSpanArr;
            float f3;
            float f4;
            StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda18 = this.cancel;
            if (stickersActivity$$ExternalSyntheticLambda18 != null) {
                stickersActivity$$ExternalSyntheticLambda18.run();
                this.cancel = null;
            }
            TLRPC.Document document = savedStarGift.gift.getDocument();
            BackupImageView backupImageView3 = this.imageView;
            if (document == null) {
                backupImageView3.imageReceiver.clearImage();
                this.lastDocument = null;
            } else {
                if (this.lastDocument != document) {
                    this.lastDocument = document;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                    backupImageView = backupImageView3;
                    backupImageView.setImage(forDocument, "80_80_nolimit_pcache", forDocument2, "80_80_nolimit_pcache", svgThumb, savedStarGift);
                }
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                CardBackground cardBackground = this.cardBackground;
                cardBackground.setBackdrop(stargiftattributebackdrop);
                cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
                cardBackground.setStrokeColors(null);
                this.titleView.setVisibility(8);
                this.subtitleView.setVisibility(8);
                backupImageView.setTranslationY(0.0f);
                premiumLockIconView = this.lockView;
                premiumLockIconView.waitingImage = true;
                premiumLockIconView.wasDrawn = false;
                premiumLockIconView.invalidate();
                if (stargiftattributebackdrop != null) {
                    numValueOf = Integer.valueOf(Theme.multAlpha(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
                } else {
                    numValueOf = null;
                }
                premiumLockIconView.setBlendWithColor(numValueOf);
                PremiumLockIconView premiumLockIconView2 = this.pinView;
                premiumLockIconView2.waitingImage = true;
                premiumLockIconView2.wasDrawn = false;
                premiumLockIconView2.invalidate();
                if (stargiftattributebackdrop != null) {
                    numValueOf2 = Integer.valueOf(Theme.multAlpha(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
                } else {
                    numValueOf2 = null;
                }
                premiumLockIconView2.setBlendWithColor(numValueOf2);
                imageView = this.tonOnlySaleView;
                if (savedStarGift.gift.resale_ton_only) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                frameLayout = this.pinnedView;
                if (stargiftattributebackdrop != null) {
                    i2 = -16777216;
                    frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(20.0f), Theme.adaptHSV(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
                } else {
                    i2 = -16777216;
                    frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(20.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
                }
                FrameLayout.LayoutParams layoutParams = this.imageViewLayoutParams;
                layoutParams.gravity = 17;
                backupImageView.setLayoutParams(layoutParams);
                if (this.lastUserGift == savedStarGift) {
                    premiumLockIconView.setVisibility(0);
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = premiumLockIconView.animate();
                    if (savedStarGift.unsaved) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f3);
                    if (savedStarGift.unsaved) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.4f;
                    }
                    viewPropertyAnimatorAlpha.scaleX(f4).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new LaunchActivity$$ExternalSyntheticLambda13(8, this, savedStarGift)).start();
                } else {
                    if (savedStarGift.unsaved) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    premiumLockIconView.setAlpha(f);
                    if (savedStarGift.unsaved) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.4f;
                    }
                    premiumLockIconView.setScaleX(f2);
                    premiumLockIconView.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
                    if (savedStarGift.unsaved) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    premiumLockIconView.setVisibility(i3);
                }
                z3 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
                backupImageView2 = this.avatarView;
                backupImageView2.setColorFilter(null);
                backupImageView2.setLayoutParams(this.avatarViewLayout1);
                i4 = this.currentAccount;
                if (!z3 && savedStarGift.name_hidden) {
                    backupImageView2.setVisibility(8);
                } else if (savedStarGift.name_hidden) {
                    backupImageView2.setVisibility(0);
                    CombinedDrawable platformDrawable = StarsIntroActivity.StarsTransactionView.getPlatformDrawable(44, "anonymous");
                    int iDp = AndroidUtilities.dp(16.0f);
                    int iDp2 = AndroidUtilities.dp(16.0f);
                    platformDrawable.iconWidth = iDp;
                    platformDrawable.iconHeight = iDp2;
                    backupImageView2.setImageDrawable(platformDrawable);
                } else {
                    peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
                    avatarDrawable = this.avatarDrawable;
                    if (peerDialogId > 0) {
                        user = MessagesController.getInstance(i4).getUser(Long.valueOf(peerDialogId));
                        if (user != null) {
                            backupImageView2.setVisibility(0);
                            avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                            backupImageView2.imageReceiver.setForUserOrChat(user, avatarDrawable);
                            backupImageView2.onNewImageSet();
                        } else {
                            backupImageView2.setVisibility(8);
                        }
                    } else {
                        chat = MessagesController.getInstance(i4).getChat(Long.valueOf(-peerDialogId));
                        if (chat != null) {
                            backupImageView2.setVisibility(0);
                            avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                            backupImageView2.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                            backupImageView2.onNewImageSet();
                        } else {
                            backupImageView2.setVisibility(8);
                        }
                    }
                }
                textView = this.priceView;
                starsBackgroundView = this.priceBackground;
                anonymousClass4 = this.priceLayout;
                if (stargiftattributebackdrop == null && savedStarGift.gift.resell_amount != null) {
                    textView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams2 = this.imageViewLayoutParams;
                    layoutParams2.topMargin = 0;
                    layoutParams2.bottomMargin = 0;
                    textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView.setTextSize(1, 12.0f);
                    ColoredImageSpan[] coloredImageSpanArr2 = new ColoredImageSpan[1];
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2.resale_ton_only && DialogObject.getPeerDialogId(starGift2.owner_id) == UserConfig.getInstance(i4).getClientUserId()) {
                        coloredImageSpanArr = coloredImageSpanArr2;
                        textView.setText(StarsIntroActivity.replaceStars(true, "XTR " + ((Object) StarsIntroActivity.formatStarsAmount(savedStarGift.gift.getResellAmount(AmountUtils$Currency.TON).toTl(), 1.0f, ',')), 0.95f, coloredImageSpanArr2, 0.0f, 1.0f));
                    } else {
                        coloredImageSpanArr = coloredImageSpanArr2;
                        textView.setText(StarsIntroActivity.replaceStars("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, coloredImageSpanArr));
                    }
                    ColoredImageSpan coloredImageSpan = coloredImageSpanArr[0];
                    if (coloredImageSpan != null) {
                        coloredImageSpan.translate(0.0f, AndroidUtilities.dp(0.5f));
                    }
                    int iBlendOver = Theme.blendOver(stargiftattributebackdrop.center_color | i2, Theme.multAlpha(0.55f, stargiftattributebackdrop.pattern_color | i2));
                    starsBackgroundView.setBackground(new StarsBackground(1895825407, iBlendOver));
                    textView.setTextColor(-1);
                    imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver));
                    imageView.setColorFilter(-1);
                    ((FrameLayout.LayoutParams) anonymousClass4.getLayoutParams()).gravity = 49;
                    ((ViewGroup.MarginLayoutParams) anonymousClass4.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
                } else {
                    i5 = -1;
                    if (z) {
                        textView.setVisibility(8);
                        this.imageViewLayoutParams.topMargin = AndroidUtilities.dp(12.0f);
                        this.imageViewLayoutParams.bottomMargin = AndroidUtilities.dp(12.0f);
                    } else {
                        textView.setVisibility(0);
                        FrameLayout.LayoutParams layoutParams3 = this.imageViewLayoutParams;
                        layoutParams3.topMargin = 0;
                        layoutParams3.bottomMargin = 0;
                    }
                    if (z3) {
                        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        textView.setTextSize(1, 12.0f);
                        textView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
                    } else {
                        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                        textView.setTextSize(1, 12.0f);
                        StringBuilder sb = new StringBuilder("XTR ");
                        starGift = savedStarGift.gift;
                        long j2 = starGift.stars;
                        j = savedStarGift.convert_stars;
                        if (j <= 0) {
                            j = starGift.convert_stars;
                        }
                        textView.setText(StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m(Math.max(j2, j), ',', sb), 0.66f, null));
                    }
                    if (z3) {
                        i6 = -1;
                    } else if (Theme.currentTheme.isDark()) {
                        i6 = -1333971;
                    } else {
                        i6 = -4229632;
                    }
                    textView.setTextColor(i6);
                    i7 = 1088989954;
                    if (z3) {
                        i8 = 1090519039;
                    } else if (Theme.currentTheme.isDark()) {
                        i8 = 518759725;
                    } else {
                        i8 = 1088989954;
                    }
                    starsBackgroundView.setBackground(new StarsBackground(ColorUtils.setAlphaComponent(i8, 128), i8));
                    int iDp3 = AndroidUtilities.dp(10.0f);
                    if (z3) {
                        i7 = 1090519039;
                    } else if (Theme.currentTheme.isDark()) {
                        i7 = 518759725;
                    }
                    imageView.setBackground(Theme.createRoundRectDrawable(iDp3, i7));
                    if (!z3) {
                        if (Theme.currentTheme.isDark()) {
                            i5 = -1333971;
                        } else {
                            i5 = -4229632;
                        }
                    }
                    imageView.setColorFilter(i5);
                    ((FrameLayout.LayoutParams) anonymousClass4.getLayoutParams()).gravity = 49;
                    ((ViewGroup.MarginLayoutParams) anonymousClass4.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                }
                this.starsPriceView.setVisibility(8);
                this.lastUserGift = savedStarGift;
                this.lastTier = null;
                savedStarGift2 = this.userGift;
                this.premiumTier = null;
                this.gift = null;
                this.giftMine = false;
                this.userGift = savedStarGift;
                this.allowResaleInGifts = false;
                this.inResalePage = false;
                this.inCollection = z2;
                this.title = null;
                this.subtitle = null;
                if (savedStarGift.pinned_to_top || (z3 && !savedStarGift.name_hidden)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (savedStarGift2 == savedStarGift) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                setPinned(z4, z5);
                updateRibbonText();
                if (savedStarGift2 == savedStarGift) {
                    return true;
                }
                return false;
            }
            backupImageView = backupImageView3;
            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            CardBackground cardBackground2 = this.cardBackground;
            cardBackground2.setBackdrop(stargiftattributebackdrop);
            cardBackground2.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
            cardBackground2.setStrokeColors(null);
            this.titleView.setVisibility(8);
            this.subtitleView.setVisibility(8);
            backupImageView.setTranslationY(0.0f);
            premiumLockIconView = this.lockView;
            premiumLockIconView.waitingImage = true;
            premiumLockIconView.wasDrawn = false;
            premiumLockIconView.invalidate();
            if (stargiftattributebackdrop != null) {
                numValueOf = Integer.valueOf(Theme.multAlpha(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
            } else {
                numValueOf = null;
            }
            premiumLockIconView.setBlendWithColor(numValueOf);
            PremiumLockIconView premiumLockIconView3 = this.pinView;
            premiumLockIconView3.waitingImage = true;
            premiumLockIconView3.wasDrawn = false;
            premiumLockIconView3.invalidate();
            if (stargiftattributebackdrop != null) {
                numValueOf2 = Integer.valueOf(Theme.multAlpha(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
            } else {
                numValueOf2 = null;
            }
            premiumLockIconView3.setBlendWithColor(numValueOf2);
            imageView = this.tonOnlySaleView;
            if (savedStarGift.gift.resale_ton_only) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            frameLayout = this.pinnedView;
            if (stargiftattributebackdrop != null) {
                i2 = -16777216;
                frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(20.0f), Theme.adaptHSV(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
            } else {
                i2 = -16777216;
                frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(20.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
            }
            FrameLayout.LayoutParams layoutParams4 = this.imageViewLayoutParams;
            layoutParams4.gravity = 17;
            backupImageView.setLayoutParams(layoutParams4);
            if (this.lastUserGift == savedStarGift) {
                premiumLockIconView.setVisibility(0);
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = premiumLockIconView.animate();
                if (savedStarGift.unsaved) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ViewPropertyAnimator viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(f3);
                if (savedStarGift.unsaved) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.4f;
                }
                viewPropertyAnimatorAlpha2.scaleX(f4).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new LaunchActivity$$ExternalSyntheticLambda13(8, this, savedStarGift)).start();
            } else {
                if (savedStarGift.unsaved) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                premiumLockIconView.setAlpha(f);
                if (savedStarGift.unsaved) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.4f;
                }
                premiumLockIconView.setScaleX(f2);
                premiumLockIconView.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
                if (savedStarGift.unsaved) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                premiumLockIconView.setVisibility(i3);
            }
            z3 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
            backupImageView2 = this.avatarView;
            backupImageView2.setColorFilter(null);
            backupImageView2.setLayoutParams(this.avatarViewLayout1);
            i4 = this.currentAccount;
            if (!z3) {
                if (savedStarGift.name_hidden) {
                    backupImageView2.setVisibility(0);
                    CombinedDrawable platformDrawable2 = StarsIntroActivity.StarsTransactionView.getPlatformDrawable(44, "anonymous");
                    int iDp4 = AndroidUtilities.dp(16.0f);
                    int iDp5 = AndroidUtilities.dp(16.0f);
                    platformDrawable2.iconWidth = iDp4;
                    platformDrawable2.iconHeight = iDp5;
                    backupImageView2.setImageDrawable(platformDrawable2);
                } else {
                    peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
                    avatarDrawable = this.avatarDrawable;
                    if (peerDialogId > 0) {
                        user = MessagesController.getInstance(i4).getUser(Long.valueOf(peerDialogId));
                        if (user != null) {
                            backupImageView2.setVisibility(0);
                            avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                            backupImageView2.imageReceiver.setForUserOrChat(user, avatarDrawable);
                            backupImageView2.onNewImageSet();
                        } else {
                            backupImageView2.setVisibility(8);
                        }
                    } else {
                        chat = MessagesController.getInstance(i4).getChat(Long.valueOf(-peerDialogId));
                        if (chat != null) {
                            backupImageView2.setVisibility(0);
                            avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                            backupImageView2.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                            backupImageView2.onNewImageSet();
                        } else {
                            backupImageView2.setVisibility(8);
                        }
                    }
                }
            } else if (savedStarGift.name_hidden) {
                backupImageView2.setVisibility(0);
                CombinedDrawable platformDrawable3 = StarsIntroActivity.StarsTransactionView.getPlatformDrawable(44, "anonymous");
                int iDp6 = AndroidUtilities.dp(16.0f);
                int iDp7 = AndroidUtilities.dp(16.0f);
                platformDrawable3.iconWidth = iDp6;
                platformDrawable3.iconHeight = iDp7;
                backupImageView2.setImageDrawable(platformDrawable3);
            } else {
                peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
                avatarDrawable = this.avatarDrawable;
                if (peerDialogId > 0) {
                    user = MessagesController.getInstance(i4).getUser(Long.valueOf(peerDialogId));
                    if (user != null) {
                        backupImageView2.setVisibility(0);
                        avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                        backupImageView2.imageReceiver.setForUserOrChat(user, avatarDrawable);
                        backupImageView2.onNewImageSet();
                    } else {
                        backupImageView2.setVisibility(8);
                    }
                } else {
                    chat = MessagesController.getInstance(i4).getChat(Long.valueOf(-peerDialogId));
                    if (chat != null) {
                        backupImageView2.setVisibility(0);
                        avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                        backupImageView2.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                        backupImageView2.onNewImageSet();
                    } else {
                        backupImageView2.setVisibility(8);
                    }
                }
            }
            textView = this.priceView;
            starsBackgroundView = this.priceBackground;
            anonymousClass4 = this.priceLayout;
            if (stargiftattributebackdrop == null) {
                i5 = -1;
                if (z) {
                    textView.setVisibility(8);
                    this.imageViewLayoutParams.topMargin = AndroidUtilities.dp(12.0f);
                    this.imageViewLayoutParams.bottomMargin = AndroidUtilities.dp(12.0f);
                } else {
                    textView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams5 = this.imageViewLayoutParams;
                    layoutParams5.topMargin = 0;
                    layoutParams5.bottomMargin = 0;
                }
                if (z3) {
                    textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                    textView.setTextSize(1, 12.0f);
                    textView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
                } else {
                    textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView.setTextSize(1, 12.0f);
                    StringBuilder sb2 = new StringBuilder("XTR ");
                    starGift = savedStarGift.gift;
                    long j3 = starGift.stars;
                    j = savedStarGift.convert_stars;
                    if (j <= 0) {
                        j = starGift.convert_stars;
                    }
                    textView.setText(StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m(Math.max(j3, j), ',', sb2), 0.66f, null));
                }
                if (z3) {
                    i6 = -1;
                } else if (Theme.currentTheme.isDark()) {
                    i6 = -1333971;
                } else {
                    i6 = -4229632;
                }
                textView.setTextColor(i6);
                i7 = 1088989954;
                if (z3) {
                    i8 = 1090519039;
                } else if (Theme.currentTheme.isDark()) {
                    i8 = 518759725;
                } else {
                    i8 = 1088989954;
                }
                starsBackgroundView.setBackground(new StarsBackground(ColorUtils.setAlphaComponent(i8, 128), i8));
                int iDp8 = AndroidUtilities.dp(10.0f);
                if (z3) {
                    i7 = 1090519039;
                } else if (Theme.currentTheme.isDark()) {
                    i7 = 518759725;
                }
                imageView.setBackground(Theme.createRoundRectDrawable(iDp8, i7));
                if (!z3) {
                    if (Theme.currentTheme.isDark()) {
                        i5 = -1333971;
                    } else {
                        i5 = -4229632;
                    }
                }
                imageView.setColorFilter(i5);
                ((FrameLayout.LayoutParams) anonymousClass4.getLayoutParams()).gravity = 49;
                ((ViewGroup.MarginLayoutParams) anonymousClass4.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
            } else {
                i5 = -1;
                if (z) {
                    textView.setVisibility(8);
                    this.imageViewLayoutParams.topMargin = AndroidUtilities.dp(12.0f);
                    this.imageViewLayoutParams.bottomMargin = AndroidUtilities.dp(12.0f);
                } else {
                    textView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams6 = this.imageViewLayoutParams;
                    layoutParams6.topMargin = 0;
                    layoutParams6.bottomMargin = 0;
                }
                if (z3) {
                    textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                    textView.setTextSize(1, 12.0f);
                    textView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
                } else {
                    textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView.setTextSize(1, 12.0f);
                    StringBuilder sb3 = new StringBuilder("XTR ");
                    starGift = savedStarGift.gift;
                    long j4 = starGift.stars;
                    j = savedStarGift.convert_stars;
                    if (j <= 0) {
                        j = starGift.convert_stars;
                    }
                    textView.setText(StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m(Math.max(j4, j), ',', sb3), 0.66f, null));
                }
                if (z3) {
                    i6 = -1;
                } else if (Theme.currentTheme.isDark()) {
                    i6 = -1333971;
                } else {
                    i6 = -4229632;
                }
                textView.setTextColor(i6);
                i7 = 1088989954;
                if (z3) {
                    i8 = 1090519039;
                } else if (Theme.currentTheme.isDark()) {
                    i8 = 518759725;
                } else {
                    i8 = 1088989954;
                }
                starsBackgroundView.setBackground(new StarsBackground(ColorUtils.setAlphaComponent(i8, 128), i8));
                int iDp9 = AndroidUtilities.dp(10.0f);
                if (z3) {
                    i7 = 1090519039;
                } else if (Theme.currentTheme.isDark()) {
                    i7 = 518759725;
                }
                imageView.setBackground(Theme.createRoundRectDrawable(iDp9, i7));
                if (!z3) {
                    if (Theme.currentTheme.isDark()) {
                        i5 = -1333971;
                    } else {
                        i5 = -4229632;
                    }
                }
                imageView.setColorFilter(i5);
                ((FrameLayout.LayoutParams) anonymousClass4.getLayoutParams()).gravity = 49;
                ((ViewGroup.MarginLayoutParams) anonymousClass4.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
            }
            this.starsPriceView.setVisibility(8);
            this.lastUserGift = savedStarGift;
            this.lastTier = null;
            savedStarGift2 = this.userGift;
            this.premiumTier = null;
            this.gift = null;
            this.giftMine = false;
            this.userGift = savedStarGift;
            this.allowResaleInGifts = false;
            this.inResalePage = false;
            this.inCollection = z2;
            this.title = null;
            this.subtitle = null;
            if (savedStarGift.pinned_to_top) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (savedStarGift2 == savedStarGift) {
                z5 = true;
            } else {
                z5 = false;
            }
            setPinned(z4, z5);
            updateRibbonText();
            if (savedStarGift2 == savedStarGift) {
                return true;
            }
            return false;
        }
    }
}
