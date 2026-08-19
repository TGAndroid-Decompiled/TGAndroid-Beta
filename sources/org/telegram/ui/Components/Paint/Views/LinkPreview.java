package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;

public class LinkPreview extends View {
    private boolean animated;
    public int backgroundColor;
    private final RectF bounds;
    private final AnimatedFloat captionAbove;
    private int currentAccount;
    public final float density;
    private StaticLayout descriptionLayout;
    private float descriptionLayoutLeft;
    private float descriptionLayoutWidth;
    private final TextPaint descriptionPaint;
    private final float flagIconPadding;
    public float h;
    private boolean hasDescription;
    public boolean hasPhoto;
    private boolean hasSiteName;
    private boolean hasTitle;
    private final AnimatedFloat height;
    private final Drawable icon;
    private final float iconPadding;
    private final float iconSize;
    private StaticLayout layout;
    private float layoutLeft;
    private final TextPaint layoutPaint;
    private float layoutWidth;
    public int maxWidth;
    private boolean messageAbove;
    private Text messageText;
    private final Paint outlinePaint;
    private final RectF padding;
    public final int padx;
    public final int pady;
    private final Path path;
    private final Path path2;
    private final AnimatedFloat photoAlphaProgress;
    private float photoHeight;
    private final ImageReceiver photoImage;
    private final AnimatedFloat photoSmallProgress;
    private float previewHeight;
    private final AnimatedFloat previewHeightProgress;
    private Paint previewPaint;
    private final AnimatedFloat previewProgress;
    private final AnimatedFloat previewTheme;
    public int previewType;
    private final RectF rect;
    private final RectF rect1;
    private final RectF rect2;
    private boolean relayout;
    private Text siteNameText;
    private boolean smallPhoto;
    private float textScale;
    private Text titleText;
    public int type;
    private boolean video;
    public float w;
    private WebPagePreview webpage;
    private final AnimatedFloat width;

    public static String fromUrl(String str) {
        return str;
    }

    public LinkPreview(Context context, float f) {
        super(context);
        this.relayout = true;
        this.textScale = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.layoutPaint = textPaint;
        this.padding = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.iconPadding = 3.25f;
        this.flagIconPadding = 2.25f;
        this.iconSize = 30.0f;
        this.outlinePaint = new Paint(1);
        this.previewPaint = new Paint(1);
        this.descriptionPaint = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.photoImage = imageReceiver;
        this.bounds = new RectF();
        this.rect = new RectF();
        this.path = new Path();
        this.path2 = new Path();
        this.rect1 = new RectF();
        this.rect2 = new RectF();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.captionAbove = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.photoAlphaProgress = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.photoSmallProgress = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.previewProgress = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.previewTheme = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.previewHeightProgress = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.width = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.height = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.density = f;
        imageReceiver.setInvalidateAll(true);
        this.padx = (int) (f * 3.0f);
        this.pady = (int) (f * 1.0f);
        this.icon = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
        this.relayout = true;
    }

    public void setVideoTexture() {
        this.video = true;
    }

    public void setupLayout() {
        int color1;
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        int lineCount;
        float f4;
        if (!this.relayout || this.webpage == null) {
            return;
        }
        if (withPreview()) {
            String strFromUrl = TextUtils.isEmpty(this.webpage.name) ? fromUrl(this.webpage.url) : this.webpage.name;
            TLRPC.WebPage webPage = this.webpage.webpage;
            int i3 = this.maxWidth;
            int i4 = this.padx;
            float f5 = (i3 - i4) - i4;
            this.h = 0.0f;
            this.w = 0.0f;
            this.previewHeight = 0.0f;
            int colorId = UserObject.getColorId(UserConfig.getInstance(this.currentAccount).getCurrentUser());
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).peerColors;
            MessagesController.PeerColor color = (peerColors == null || colorId < 7) ? null : peerColors.getColor(colorId);
            Paint paint = this.previewPaint;
            if (color == null) {
                int[] iArr = Theme.keys_avatar_nameInMessage;
                color1 = Theme.getColor(iArr[colorId % iArr.length]);
            } else {
                color1 = color.getColor1();
            }
            paint.setColor(color1);
            this.h += this.density * 7.33f;
            this.messageAbove = this.webpage.captionAbove;
            Text maxWidth = new Text(strFromUrl, 16.0f).setTextSizePx(this.density * 16.0f).setMaxWidth(f5 - (this.density * 20.0f));
            this.messageText = maxWidth;
            this.w = Math.max(this.w, Math.min(maxWidth.getCurrentWidth() + (this.density * 20.0f), f5));
            this.h = this.h + this.messageText.getHeight() + (this.density * 7.0f);
            this.hasPhoto = webPage.photo != null || MessageObject.isVideoDocument(webPage.document);
            WebPagePreview webPagePreview = this.webpage;
            boolean z = webPagePreview.largePhoto;
            this.smallPhoto = !z;
            int i5 = (!this.video || (webPagePreview.flags & 4) == 0) ? ((int) (!z ? 48.0f : (f5 / this.density) - 40.0f)) * 2 : webPagePreview.photoSize;
            this.photoImage.setRoundRadius((int) (this.density * 4.0f));
            TLRPC.Photo photo = webPage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                f = 7.0f;
                f2 = 48.0f;
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i5 * this.density), false, closestPhotoSizeWithSize, false);
                if (closestPhotoSizeWithSize2 != null) {
                    i = closestPhotoSizeWithSize2.w;
                    i2 = closestPhotoSizeWithSize2.h;
                } else {
                    i = 0;
                    i2 = 0;
                }
                f3 = 40.0f;
                this.photoImage.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo), i5 + "_" + i5, this.video ? null : ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo), this.video ? null : i5 + "_" + i5, 0L, null, null, 0);
            } else {
                f = 7.0f;
                f2 = 48.0f;
                f3 = 40.0f;
                TLRPC.Document document = webPage.document;
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i5 * this.density), false, closestPhotoSizeWithSize3, false);
                    if (closestPhotoSizeWithSize4 != null) {
                        int i6 = closestPhotoSizeWithSize4.w;
                        i2 = closestPhotoSizeWithSize4.h;
                        i = i6;
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    this.photoImage.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document), i5 + "_" + i5, this.video ? null : ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document), this.video ? null : i5 + "_" + i5, 0L, null, null, 0);
                } else {
                    i = 0;
                    i2 = 0;
                }
            }
            this.previewHeight += this.density * 5.66f;
            boolean zIsEmpty = TextUtils.isEmpty(webPage.site_name);
            this.hasSiteName = !zIsEmpty;
            if (zIsEmpty) {
                lineCount = 0;
            } else {
                Text textSizePx = new Text(webPage.site_name, 14.0f, AndroidUtilities.bold()).setTextSizePx(this.density * 14.0f);
                float f6 = this.density;
                Text maxWidth2 = textSizePx.setMaxWidth((int) Math.ceil((f5 - (f6 * f3)) - ((this.hasPhoto && this.smallPhoto) ? f6 * 60.0f : 0.0f)));
                this.siteNameText = maxWidth2;
                float f7 = this.w;
                float currentWidth = maxWidth2.getCurrentWidth();
                float f8 = this.density;
                this.w = Math.max(f7, Math.min(currentWidth + (f8 * f3) + ((this.hasPhoto && this.smallPhoto) ? f8 * 60.0f : 0.0f), f5));
                this.previewHeight = this.previewHeight + this.siteNameText.getHeight() + (this.density * 2.66f);
                lineCount = this.siteNameText.getLineCount();
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(webPage.title);
            this.hasTitle = !zIsEmpty2;
            if (zIsEmpty2) {
                f4 = 2.66f;
            } else {
                Text textSizePx2 = new Text(webPage.title, 14.0f, AndroidUtilities.bold()).setTextSizePx(this.density * 14.0f);
                float f9 = this.density;
                f4 = 2.66f;
                Text maxWidth3 = textSizePx2.setMaxWidth((int) Math.ceil((f5 - (f9 * f3)) - ((this.hasPhoto && this.smallPhoto) ? f9 * 60.0f : 0.0f)));
                this.titleText = maxWidth3;
                float f10 = this.w;
                float currentWidth2 = maxWidth3.getCurrentWidth();
                float f11 = this.density;
                this.w = Math.max(f10, Math.min(currentWidth2 + (f11 * f3) + ((this.hasPhoto && this.smallPhoto) ? f11 * 60.0f : 0.0f), f5));
                this.previewHeight = this.previewHeight + this.titleText.getHeight() + (this.density * 2.66f);
                lineCount += this.titleText.getLineCount();
            }
            boolean zIsEmpty3 = TextUtils.isEmpty(webPage.description);
            this.hasDescription = !zIsEmpty3;
            if (!zIsEmpty3) {
                this.descriptionPaint.setTextSize(this.density * 14.0f);
                int i7 = 3 - lineCount;
                this.descriptionLayout = ChatMessageCell.generateStaticLayout(webPage.description, this.descriptionPaint, (int) Math.ceil(Math.max(1.0f, f5 - (this.density * f3))), (int) Math.ceil(Math.max(1.0f, f5 - ((40 + ((this.hasPhoto && this.smallPhoto) ? 60 : 0)) * this.density))), i7, 4);
                this.descriptionLayoutWidth = 0.0f;
                this.descriptionLayoutLeft = Float.MAX_VALUE;
                int i8 = 0;
                while (i8 < this.descriptionLayout.getLineCount()) {
                    this.descriptionLayoutWidth = Math.max(this.descriptionLayoutWidth, this.descriptionLayout.getLineWidth(i8) + (this.hasPhoto && this.smallPhoto && i8 < i7 ? this.density * f2 : 0.0f));
                    this.descriptionLayoutLeft = Math.min(this.descriptionLayoutLeft, this.descriptionLayout.getLineLeft(i8));
                    i8++;
                }
                this.w = Math.max(this.w, Math.min(this.descriptionLayoutWidth + (this.density * f3), f5));
                this.previewHeight = this.previewHeight + this.descriptionLayout.getHeight() + (this.density * f4);
            }
            if (this.hasPhoto && !this.smallPhoto) {
                if (i <= 0 || i2 <= 0) {
                    this.photoHeight = this.density * 120.0f;
                } else {
                    this.photoHeight = Math.min((Math.max(0.0f, this.w - (this.density * f3)) / i) * i2, this.density * 200.0f);
                }
                this.previewHeight = this.previewHeight + this.photoHeight + (this.density * f4);
            }
            float f12 = this.previewHeight;
            float f13 = this.density;
            float f14 = f12 + (f13 * f);
            this.previewHeight = f14;
            this.h = this.h + f14 + (f13 * 11.0f);
        } else {
            String upperCase = TextUtils.isEmpty(this.webpage.name) ? fromUrlWithoutSchema(this.webpage.url).toUpperCase() : this.webpage.name;
            int i9 = this.maxWidth;
            int i10 = this.padx;
            float f15 = (i9 - i10) - i10;
            RectF rectF = this.padding;
            float f16 = f15 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * this.density);
            this.textScale = 1.0f;
            double d = f16;
            this.layout = new StaticLayout(TextUtils.ellipsize(upperCase, this.layoutPaint, (int) Math.ceil(d), TextUtils.TruncateAt.END), this.layoutPaint, (int) Math.ceil(d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.layoutWidth = 0.0f;
            this.layoutLeft = Float.MAX_VALUE;
            for (int i11 = 0; i11 < this.layout.getLineCount(); i11++) {
                this.layoutWidth = Math.max(this.layoutWidth, this.layout.getLineWidth(i11));
                this.layoutLeft = Math.min(this.layoutLeft, this.layout.getLineLeft(i11));
            }
            if (this.layout.getLineCount() > 2) {
                this.textScale = 0.3f;
            } else {
                this.textScale = Math.min(1.0f, f16 / this.layoutWidth);
            }
            RectF rectF2 = this.padding;
            float f17 = rectF2.left + 30.0f + 3.25f + rectF2.right;
            float f18 = this.density;
            this.w = (f17 * f18) + (this.layoutWidth * this.textScale);
            this.h = ((rectF2.top + rectF2.bottom) * f18) + Math.max(f18 * 30.0f, this.layout.getHeight() * this.textScale);
        }
        if (!this.animated) {
            this.captionAbove.set(this.messageAbove, true);
            this.photoSmallProgress.set(this.smallPhoto, true);
            this.photoAlphaProgress.set(this.hasPhoto, true);
            this.previewHeightProgress.set(this.previewHeight, true);
        } else {
            invalidate();
        }
        this.relayout = false;
    }

    public void pushPhotoToCache() {
        if (this.hasPhoto && this.photoImage.hasImageLoaded() && this.photoImage.getBitmap() != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(this.photoImage.getBitmap()), this.photoImage.getImageKey(), false);
        }
    }

    public int getPhotoSide() {
        float f;
        if (this.smallPhoto) {
            f = 48.0f;
        } else {
            int i = this.maxWidth;
            int i2 = this.padx;
            f = (((i - i2) - i2) / this.density) - 40.0f;
        }
        return ((int) f) * 2;
    }

    public boolean withPreview() {
        WebPagePreview webPagePreview = this.webpage;
        return (webPagePreview == null || webPagePreview.webpage == null) ? false : true;
    }

    public void setType(int i, int i2) {
        if (this.type == 1) {
            return;
        }
        if (i == 0) {
            this.backgroundColor = i2;
            int i3 = AndroidUtilities.computePerceivedBrightness(i2) < 0.721f ? -1 : -16777216;
            this.layoutPaint.setColor(i3);
            this.icon.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        } else if (i == 1) {
            this.backgroundColor = -16777216;
            this.layoutPaint.setColor(-1);
            this.icon.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i == 2) {
            this.backgroundColor = 1275068416;
            this.layoutPaint.setColor(-1);
            this.icon.setColorFilter(null);
        } else {
            this.backgroundColor = -1;
            this.layoutPaint.setColor(-13397548);
            this.icon.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public void setPreviewType(int i) {
        this.previewType = i;
        invalidate();
    }

    public int getPreviewType() {
        return this.previewType;
    }

    public void set(int i, WebPagePreview webPagePreview) {
        set(i, webPagePreview, false);
    }

    public void set(int i, WebPagePreview webPagePreview, boolean z) {
        this.currentAccount = i;
        if (this.webpage != webPagePreview || z) {
            this.webpage = webPagePreview;
            this.relayout = true;
            this.animated = z;
            requestLayout();
        }
    }

    public static String fromUrlWithoutSchema(String str) {
        return str.startsWith("https://") ? str.substring(8) : str;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        drawInternal(canvas);
    }

    public float getRadius() {
        float f;
        float f2;
        if (withPreview()) {
            f = this.density;
            f2 = 16.66f;
        } else {
            f = this.h;
            f2 = 0.2f;
        }
        return f * f2;
    }

    public void drawInternal(Canvas canvas) {
        float f;
        float f2;
        Text text;
        Text text2;
        Canvas canvas2 = canvas;
        setupLayout();
        float f3 = this.width.set(this.w);
        float f4 = this.height.set(this.h);
        float f5 = this.previewTheme.set(this.previewType == 0);
        float f6 = this.previewProgress.set(withPreview());
        float fLerp = AndroidUtilities.lerp(0.2f * f4, this.density * 16.66f, f6);
        RectF rectF = this.bounds;
        float f7 = this.padx;
        float f8 = this.pady;
        rectF.set(f7, f8, f7 + f3, f8 + f4);
        this.outlinePaint.setColor(ColorUtils.blendARGB(this.backgroundColor, ColorUtils.blendARGB(-1, -14670807, f5), f6));
        this.path2.rewind();
        Path path = this.path2;
        RectF rectF2 = this.bounds;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, fLerp, fLerp, direction);
        canvas2.drawPath(this.path2, this.outlinePaint);
        if (f6 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(this.path2);
            canvas2.translate(this.padx, this.pady);
            float f9 = this.captionAbove.set(this.messageAbove);
            float f10 = this.density;
            float height = (7.33f * f10) + 0.0f;
            Text text3 = this.messageText;
            if (text3 == null || f9 <= 0.0f) {
                f = 255.0f;
            } else {
                f = 255.0f;
                text3.draw(canvas2, f10 * 10.0f, (height + (text3.getHeight() / 2.0f)) - ((this.messageText.getHeight() + (this.density * 15.0f)) * (1.0f - f9)), -15033089, f6);
                height += (this.messageText.getHeight() + (this.density * 7.0f)) * f9;
            }
            float f11 = height;
            float f12 = this.previewHeightProgress.set(this.previewHeight);
            this.previewPaint.setAlpha(25);
            RectF rectF3 = this.rect;
            float f13 = this.density * 10.0f;
            float f14 = f12 + f11;
            rectF3.set(f13, f11, f3 - f13, f14);
            this.path.rewind();
            Path path2 = this.path;
            RectF rectF4 = this.rect;
            float f15 = this.density * 5.0f;
            path2.addRoundRect(rectF4, f15, f15, direction);
            canvas2.drawPath(this.path, this.previewPaint);
            canvas2.save();
            canvas2.clipPath(this.path);
            this.previewPaint.setAlpha(255);
            float f16 = this.density;
            canvas.drawRect(f16 * 10.0f, f11, f16 * 13.0f, f14, this.previewPaint);
            canvas.restore();
            float f17 = this.density;
            float height2 = f11 + (5.66f * f17);
            if (!this.hasSiteName || (text2 = this.siteNameText) == null) {
                f6 = f6;
            } else {
                f6 = f6;
                text2.draw(canvas, f17 * 20.0f, height2 + (text2.getHeight() / 2.0f), this.previewPaint.getColor(), f6);
                height2 += this.siteNameText.getHeight() + (this.density * 2.66f);
            }
            if (!this.hasTitle || (text = this.titleText) == null) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                text.draw(canvas2, this.density * 20.0f, height2 + (text.getHeight() / 2.0f), ColorUtils.blendARGB(-13421773, -1, f5), f6);
                height2 += this.titleText.getHeight() + (this.density * 2.66f);
            }
            float height3 = height2;
            if (this.hasDescription && this.descriptionLayout != null) {
                canvas2.save();
                canvas2.translate((this.density * 20.0f) - this.descriptionLayoutLeft, height3);
                this.descriptionPaint.setColor(ColorUtils.blendARGB(-13421773, -1, f5));
                this.descriptionPaint.setAlpha((int) (f6 * f));
                this.descriptionLayout.draw(canvas2);
                canvas2.restore();
                height3 += this.descriptionLayout.getHeight() + (this.density * 2.66f);
            }
            float f18 = this.photoAlphaProgress.set(this.hasPhoto);
            if (f18 > 0.0f) {
                float f19 = this.photoSmallProgress.set(this.smallPhoto);
                RectF rectF5 = this.rect1;
                float f20 = this.density;
                float f21 = f20 * 20.0f;
                float f22 = (f20 * 2.66f) + height3;
                f2 = 1.0f;
                rectF5.set(f21, f22, f3 - f21, this.photoHeight + f22);
                RectF rectF6 = this.rect2;
                float f23 = this.density;
                float f24 = 6.0f * f23;
                float f25 = (f3 - (f23 * 10.0f)) - f24;
                float f26 = f23 * 48.0f;
                float f27 = f24 + f11;
                rectF6.set(f25 - f26, f27, f25, f26 + f27);
                AndroidUtilities.lerp(this.rect1, this.rect2, f19, this.rect);
                ImageReceiver imageReceiver = this.photoImage;
                RectF rectF7 = this.rect;
                imageReceiver.setImageCoords(rectF7.left, rectF7.top, rectF7.width(), this.rect.height());
                this.photoImage.setAlpha(f18 * f6);
                this.photoImage.draw(canvas2);
                height3 += (1.0f - f19) * ((this.density * 2.66f) + this.photoHeight);
            } else {
                f2 = 1.0f;
            }
            float f28 = this.density;
            float f29 = height3 + (7.0f * f28) + (5.0f * f28);
            Text text4 = this.messageText;
            if (text4 != null && f2 - f9 > 0.0f) {
                text4.draw(canvas2, f28 * 10.0f, f29 + (text4.getHeight() / 2.0f) + ((this.messageText.getHeight() + (this.density * 15.0f)) * f9), -15033089, f6);
                this.messageText.getHeight();
            }
            canvas2.restore();
        } else {
            f = 255.0f;
            f2 = 1.0f;
        }
        if (f6 < f2) {
            Drawable drawable = this.icon;
            int i = this.padx;
            float f30 = this.padding.left;
            float f31 = this.density;
            int i2 = this.pady;
            float f32 = f31 * 30.0f;
            drawable.setBounds(((int) (f30 * f31)) + i, ((int) ((f4 - f32) / 2.0f)) + i2, i + ((int) ((f30 + 30.0f) * f31)), i2 + ((int) ((f32 + f4) / 2.0f)));
            int i3 = (int) ((f2 - f6) * f);
            this.icon.setAlpha(i3);
            this.icon.draw(canvas2);
            if (this.layout != null) {
                canvas2.save();
                canvas2.translate(this.padx + ((this.padding.left + 30.0f + 3.25f) * this.density), this.pady + (f4 / 2.0f));
                float f33 = this.textScale;
                canvas2.scale(f33, f33);
                canvas2.translate(-this.layoutLeft, (-this.layout.getHeight()) / 2.0f);
                this.layoutPaint.setAlpha(i3);
                this.layout.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setupLayout();
        setMeasuredDimension(this.padx + ((int) Math.ceil(this.w)) + this.padx, this.pady + ((int) Math.ceil(this.h)) + this.pady);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.photoImage.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.photoImage.onDetachedFromWindow();
    }

    public static class WebPagePreview extends TLObject {
        public boolean captionAbove = true;
        public int flags;
        public boolean largePhoto;
        public String name;
        public int photoSize;
        public String url;
        public TLRPC.WebPage webpage;

        public static WebPagePreview TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (WebPagePreview) TLObject.TLdeserialize(WebPagePreview.class, -625858389 != i ? null : new WebPagePreview(), inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-625858389);
            this.flags = this.webpage != null ? this.flags | 1 : this.flags & (-2);
            int i = !TextUtils.isEmpty(this.name) ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            int i2 = this.largePhoto ? i | 8 : i & (-9);
            this.flags = i2;
            int i3 = this.captionAbove ? i2 | 16 : i2 & (-17);
            this.flags = i3;
            outputSerializedData.writeInt32(i3);
            outputSerializedData.writeString(this.url);
            if ((this.flags & 1) != 0) {
                this.webpage.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeInt32(this.photoSize);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.largePhoto = (int32 & 8) != 0;
            this.captionAbove = (int32 & 16) != 0;
            this.url = inputSerializedData.readString(z);
            if ((this.flags & 1) != 0) {
                this.webpage = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.name = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photoSize = inputSerializedData.readInt32(z);
            }
        }
    }
}
