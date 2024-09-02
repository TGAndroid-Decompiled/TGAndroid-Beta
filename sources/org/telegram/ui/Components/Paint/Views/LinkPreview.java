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
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$WebPage;
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
        int i;
        int i2;
        int i3;
        if (!this.relayout || this.webpage == null) {
            return;
        }
        if (withPreview()) {
            String fromUrl = TextUtils.isEmpty(this.webpage.name) ? fromUrl(this.webpage.url) : this.webpage.name;
            TLRPC$WebPage tLRPC$WebPage = this.webpage.webpage;
            int i4 = this.maxWidth;
            int i5 = this.padx;
            float f = (i4 - i5) - i5;
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
            Text maxWidth = new Text(fromUrl, 16.0f).setTextSizePx(this.density * 16.0f).setMaxWidth(f - (this.density * 20.0f));
            this.messageText = maxWidth;
            this.w = Math.max(this.w, Math.min(maxWidth.getCurrentWidth() + (this.density * 20.0f), f));
            this.h = this.h + this.messageText.getHeight() + (this.density * 7.0f);
            this.hasPhoto = tLRPC$WebPage.photo != null || MessageObject.isVideoDocument(tLRPC$WebPage.document);
            WebPagePreview webPagePreview = this.webpage;
            boolean z = !webPagePreview.largePhoto;
            this.smallPhoto = z;
            int i6 = (!this.video || (webPagePreview.flags & 4) == 0) ? ((int) (z ? 48.0f : (f / this.density) - 40.0f)) * 2 : webPagePreview.photoSize;
            this.photoImage.setRoundRadius((int) (this.density * 4.0f));
            TLRPC$Photo tLRPC$Photo = tLRPC$WebPage.photo;
            if (tLRPC$Photo != null) {
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, 1, false, null, false);
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$WebPage.photo.sizes, (int) (i6 * this.density), false, closestPhotoSizeWithSize, false);
                if (closestPhotoSizeWithSize2 != null) {
                    i = closestPhotoSizeWithSize2.w;
                    i2 = closestPhotoSizeWithSize2.h;
                } else {
                    i = 0;
                    i2 = 0;
                }
                this.photoImage.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, tLRPC$WebPage.photo), i6 + "_" + i6, this.video ? null : ImageLocation.getForPhoto(closestPhotoSizeWithSize, tLRPC$WebPage.photo), this.video ? null : i6 + "_" + i6, 0L, null, null, 0);
            } else {
                TLRPC$Document tLRPC$Document = tLRPC$WebPage.document;
                if (tLRPC$Document != null) {
                    TLRPC$PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 1, false, null, false);
                    TLRPC$PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$WebPage.document.thumbs, (int) (i6 * this.density), false, closestPhotoSizeWithSize3, false);
                    if (closestPhotoSizeWithSize4 != null) {
                        i = closestPhotoSizeWithSize4.w;
                        i2 = closestPhotoSizeWithSize4.h;
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    this.photoImage.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, tLRPC$WebPage.document), i6 + "_" + i6, this.video ? null : ImageLocation.getForDocument(closestPhotoSizeWithSize3, tLRPC$WebPage.document), this.video ? null : i6 + "_" + i6, 0L, null, null, 0);
                } else {
                    i = 0;
                    i2 = 0;
                }
            }
            this.previewHeight += this.density * 5.66f;
            boolean z2 = !TextUtils.isEmpty(tLRPC$WebPage.site_name);
            this.hasSiteName = z2;
            if (z2) {
                Text textSizePx = new Text(tLRPC$WebPage.site_name, 14.0f, AndroidUtilities.bold()).setTextSizePx(this.density * 14.0f);
                float f2 = this.density;
                Text maxWidth2 = textSizePx.setMaxWidth((int) Math.ceil((f - (f2 * 40.0f)) - ((this.hasPhoto && this.smallPhoto) ? f2 * 60.0f : 0.0f)));
                this.siteNameText = maxWidth2;
                float f3 = this.w;
                float currentWidth = maxWidth2.getCurrentWidth();
                float f4 = this.density;
                this.w = Math.max(f3, Math.min(currentWidth + (f4 * 40.0f) + ((this.hasPhoto && this.smallPhoto) ? f4 * 60.0f : 0.0f), f));
                this.previewHeight = this.previewHeight + this.siteNameText.getHeight() + (this.density * 2.66f);
                i3 = this.siteNameText.getLineCount();
            } else {
                i3 = 0;
            }
            boolean z3 = !TextUtils.isEmpty(tLRPC$WebPage.title);
            this.hasTitle = z3;
            if (z3) {
                Text textSizePx2 = new Text(tLRPC$WebPage.title, 14.0f, AndroidUtilities.bold()).setTextSizePx(this.density * 14.0f);
                float f5 = this.density;
                Text maxWidth3 = textSizePx2.setMaxWidth((int) Math.ceil((f - (f5 * 40.0f)) - ((this.hasPhoto && this.smallPhoto) ? f5 * 60.0f : 0.0f)));
                this.titleText = maxWidth3;
                float f6 = this.w;
                float currentWidth2 = maxWidth3.getCurrentWidth();
                float f7 = this.density;
                this.w = Math.max(f6, Math.min(currentWidth2 + (f7 * 40.0f) + ((this.hasPhoto && this.smallPhoto) ? 60.0f * f7 : 0.0f), f));
                this.previewHeight = this.previewHeight + this.titleText.getHeight() + (this.density * 2.66f);
                i3 += this.titleText.getLineCount();
            }
            boolean z4 = !TextUtils.isEmpty(tLRPC$WebPage.description);
            this.hasDescription = z4;
            if (z4) {
                this.descriptionPaint.setTextSize(this.density * 14.0f);
                int i7 = 3 - i3;
                this.descriptionLayout = ChatMessageCell.generateStaticLayout(tLRPC$WebPage.description, this.descriptionPaint, (int) Math.ceil(Math.max(1.0f, f - (this.density * 40.0f))), (int) Math.ceil(Math.max(1.0f, f - ((40 + ((this.hasPhoto && this.smallPhoto) ? 60 : 0)) * this.density))), i7, 4);
                this.descriptionLayoutWidth = 0.0f;
                this.descriptionLayoutLeft = Float.MAX_VALUE;
                int i8 = 0;
                while (i8 < this.descriptionLayout.getLineCount()) {
                    this.descriptionLayoutWidth = Math.max(this.descriptionLayoutWidth, this.descriptionLayout.getLineWidth(i8) + (this.hasPhoto && this.smallPhoto && i8 < i7 ? this.density * 48.0f : 0.0f));
                    this.descriptionLayoutLeft = Math.min(this.descriptionLayoutLeft, this.descriptionLayout.getLineLeft(i8));
                    i8++;
                }
                this.w = Math.max(this.w, Math.min(this.descriptionLayoutWidth + (this.density * 40.0f), f));
                this.previewHeight = this.previewHeight + this.descriptionLayout.getHeight() + (this.density * 2.66f);
            }
            if (this.hasPhoto && !this.smallPhoto) {
                if (i <= 0 || i2 <= 0) {
                    this.photoHeight = this.density * 120.0f;
                } else {
                    this.photoHeight = Math.min((Math.max(0.0f, this.w - (this.density * 40.0f)) / i) * i2, this.density * 200.0f);
                }
                this.previewHeight = this.previewHeight + this.photoHeight + (this.density * 2.66f);
            }
            float f8 = this.previewHeight;
            float f9 = this.density;
            float f10 = f8 + (f9 * 7.0f);
            this.previewHeight = f10;
            this.h = this.h + f10 + (f9 * 11.0f);
        } else {
            String upperCase = TextUtils.isEmpty(this.webpage.name) ? fromUrlWithoutSchema(this.webpage.url).toUpperCase() : this.webpage.name;
            int i9 = this.maxWidth;
            int i10 = this.padx;
            float f11 = (i9 - i10) - i10;
            RectF rectF = this.padding;
            float f12 = f11 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * this.density);
            this.textScale = 1.0f;
            this.layout = new StaticLayout(TextUtils.ellipsize(upperCase, this.layoutPaint, (int) Math.ceil(r10), TextUtils.TruncateAt.END), this.layoutPaint, (int) Math.ceil(f12), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.layoutWidth = 0.0f;
            this.layoutLeft = Float.MAX_VALUE;
            for (int i11 = 0; i11 < this.layout.getLineCount(); i11++) {
                this.layoutWidth = Math.max(this.layoutWidth, this.layout.getLineWidth(i11));
                this.layoutLeft = Math.min(this.layoutLeft, this.layout.getLineLeft(i11));
            }
            if (this.layout.getLineCount() > 2) {
                this.textScale = 0.3f;
            } else {
                this.textScale = Math.min(1.0f, f12 / this.layoutWidth);
            }
            RectF rectF2 = this.padding;
            float f13 = rectF2.left + 30.0f + 3.25f + rectF2.right;
            float f14 = this.density;
            this.w = (f13 * f14) + (this.layoutWidth * this.textScale);
            this.h = ((rectF2.top + rectF2.bottom) * f14) + Math.max(f14 * 30.0f, this.layout.getHeight() * this.textScale);
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
        Text text;
        Text text2;
        setupLayout();
        float f = this.width.set(this.w);
        float f2 = this.height.set(this.h);
        float f3 = this.previewProgress.set(withPreview());
        float lerp = AndroidUtilities.lerp(0.2f * f2, this.density * 16.66f, f3);
        RectF rectF = this.bounds;
        float f4 = this.padx;
        float f5 = this.pady;
        rectF.set(f4, f5, f4 + f, f5 + f2);
        this.outlinePaint.setColor(ColorUtils.blendARGB(this.backgroundColor, -14670807, f3));
        this.path2.rewind();
        Path path = this.path2;
        RectF rectF2 = this.bounds;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, lerp, lerp, direction);
        canvas.drawPath(this.path2, this.outlinePaint);
        if (f3 > 0.0f) {
            canvas.save();
            canvas.clipPath(this.path2);
            canvas.translate(this.padx, this.pady);
            float f6 = this.captionAbove.set(this.messageAbove);
            float f7 = this.density;
            float f8 = (7.33f * f7) + 0.0f;
            Text text3 = this.messageText;
            if (text3 != null && f6 > 0.0f) {
                text3.draw(canvas, f7 * 10.0f, (f8 + (text3.getHeight() / 2.0f)) - ((this.messageText.getHeight() + (this.density * 15.0f)) * (1.0f - f6)), -15033089, f3);
                f8 += (this.messageText.getHeight() + (this.density * 7.0f)) * f6;
            }
            float f9 = f8;
            float f10 = this.previewHeightProgress.set(this.previewHeight);
            this.previewPaint.setAlpha(25);
            RectF rectF3 = this.rect;
            float f11 = this.density * 10.0f;
            float f12 = f9 + f10;
            rectF3.set(f11, f9, f - f11, f12);
            this.path.rewind();
            Path path2 = this.path;
            RectF rectF4 = this.rect;
            float f13 = this.density * 5.0f;
            path2.addRoundRect(rectF4, f13, f13, direction);
            canvas.drawPath(this.path, this.previewPaint);
            canvas.save();
            canvas.clipPath(this.path);
            this.previewPaint.setAlpha(255);
            float f14 = this.density;
            canvas.drawRect(f14 * 10.0f, f9, f14 * 13.0f, f12, this.previewPaint);
            canvas.restore();
            float f15 = this.density;
            float f16 = f9 + (5.66f * f15);
            if (this.hasSiteName && (text2 = this.siteNameText) != null) {
                text2.draw(canvas, f15 * 20.0f, f16 + (text2.getHeight() / 2.0f), this.previewPaint.getColor(), f3);
                f16 += this.siteNameText.getHeight() + (this.density * 2.66f);
            }
            if (this.hasTitle && (text = this.titleText) != null) {
                text.draw(canvas, this.density * 20.0f, f16 + (text.getHeight() / 2.0f), -1, f3);
                f16 += this.titleText.getHeight() + (this.density * 2.66f);
            }
            if (this.hasDescription && this.descriptionLayout != null) {
                canvas.save();
                canvas.translate((this.density * 20.0f) - this.descriptionLayoutLeft, f16);
                this.descriptionPaint.setColor(-1);
                this.descriptionPaint.setAlpha((int) (f3 * 255.0f));
                this.descriptionLayout.draw(canvas);
                canvas.restore();
                f16 += this.descriptionLayout.getHeight() + (this.density * 2.66f);
            }
            float f17 = this.photoAlphaProgress.set(this.hasPhoto);
            if (f17 > 0.0f) {
                float f18 = this.photoSmallProgress.set(this.smallPhoto);
                RectF rectF5 = this.rect1;
                float f19 = this.density;
                float f20 = f19 * 20.0f;
                float f21 = (f19 * 2.66f) + f16;
                rectF5.set(f20, f21, f - f20, this.photoHeight + f21);
                RectF rectF6 = this.rect2;
                float f22 = this.density;
                float f23 = 6.0f * f22;
                float f24 = (f - (f22 * 10.0f)) - f23;
                float f25 = f22 * 48.0f;
                float f26 = f9 + f23;
                rectF6.set(f24 - f25, f26, f24, f25 + f26);
                AndroidUtilities.lerp(this.rect1, this.rect2, f18, this.rect);
                ImageReceiver imageReceiver = this.photoImage;
                RectF rectF7 = this.rect;
                imageReceiver.setImageCoords(rectF7.left, rectF7.top, rectF7.width(), this.rect.height());
                this.photoImage.setAlpha(f17 * f3);
                this.photoImage.draw(canvas);
                f16 += (1.0f - f18) * ((this.density * 2.66f) + this.photoHeight);
            }
            float f27 = this.density;
            float f28 = f16 + (7.0f * f27) + (5.0f * f27);
            Text text4 = this.messageText;
            if (text4 != null && 1.0f - f6 > 0.0f) {
                text4.draw(canvas, f27 * 10.0f, f28 + (text4.getHeight() / 2.0f) + ((this.messageText.getHeight() + (this.density * 15.0f)) * f6), -15033089, f3);
                this.messageText.getHeight();
            }
            canvas.restore();
        }
        if (f3 < 1.0f) {
            Drawable drawable = this.icon;
            int i = this.padx;
            float f29 = this.padding.left;
            float f30 = this.density;
            int i2 = this.pady;
            float f31 = f30 * 30.0f;
            drawable.setBounds(((int) (f29 * f30)) + i, ((int) ((f2 - f31) / 2.0f)) + i2, i + ((int) ((f29 + 30.0f) * f30)), i2 + ((int) ((f31 + f2) / 2.0f)));
            int i3 = (int) ((1.0f - f3) * 255.0f);
            this.icon.setAlpha(i3);
            this.icon.draw(canvas);
            if (this.layout != null) {
                canvas.save();
                canvas.translate(this.padx + ((this.padding.left + 30.0f + 3.25f) * this.density), this.pady + (f2 / 2.0f));
                float f32 = this.textScale;
                canvas.scale(f32, f32);
                canvas.translate(-this.layoutLeft, (-this.layout.getHeight()) / 2.0f);
                this.layoutPaint.setAlpha(i3);
                this.layout.draw(canvas);
                canvas.restore();
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
        public TLRPC$WebPage webpage;

        public static WebPagePreview TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            if (-625858389 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in WebPagePreview", Integer.valueOf(i)));
                }
                return null;
            }
            WebPagePreview webPagePreview = new WebPagePreview();
            webPagePreview.readParams(abstractSerializedData, z);
            return webPagePreview;
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-625858389);
            this.flags = this.webpage != null ? this.flags | 1 : this.flags & (-2);
            int i = !TextUtils.isEmpty(this.name) ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            int i2 = this.largePhoto ? i | 8 : i & (-9);
            this.flags = i2;
            int i3 = this.captionAbove ? i2 | 16 : i2 & (-17);
            this.flags = i3;
            abstractSerializedData.writeInt32(i3);
            abstractSerializedData.writeString(this.url);
            if ((this.flags & 1) != 0) {
                this.webpage.serializeToStream(abstractSerializedData);
            }
            if ((this.flags & 2) != 0) {
                abstractSerializedData.writeString(this.name);
            }
            if ((this.flags & 4) != 0) {
                abstractSerializedData.writeInt32(this.photoSize);
            }
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            int readInt32 = abstractSerializedData.readInt32(z);
            this.flags = readInt32;
            this.largePhoto = (readInt32 & 8) != 0;
            this.captionAbove = (readInt32 & 16) != 0;
            this.url = abstractSerializedData.readString(z);
            if ((this.flags & 1) != 0) {
                this.webpage = TLRPC$WebPage.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.name = abstractSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photoSize = abstractSerializedData.readInt32(z);
            }
        }
    }
}
