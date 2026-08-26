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
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;

public class LinkPreview extends View {
    public boolean animated;
    public int backgroundColor;
    public final RectF bounds;
    public final AnimatedFloat captionAbove;
    public int currentAccount;
    public final float density;
    public StaticLayout descriptionLayout;
    public float descriptionLayoutLeft;
    public float descriptionLayoutWidth;
    public final TextPaint descriptionPaint;
    public float h;
    public boolean hasDescription;
    public boolean hasPhoto;
    public boolean hasSiteName;
    public boolean hasTitle;
    public final AnimatedFloat height;
    public final Drawable icon;
    public StaticLayout layout;
    public float layoutLeft;
    public final TextPaint layoutPaint;
    public float layoutWidth;
    public int maxWidth;
    public boolean messageAbove;
    public Text messageText;
    public final Paint outlinePaint;
    public final RectF padding;
    public final int padx;
    public final int pady;
    public final Path path;
    public final Path path2;
    public final AnimatedFloat photoAlphaProgress;
    public float photoHeight;
    public final ImageReceiver photoImage;
    public final AnimatedFloat photoSmallProgress;
    public float previewHeight;
    public final AnimatedFloat previewHeightProgress;
    public final Paint previewPaint;
    public final AnimatedFloat previewProgress;
    public final AnimatedFloat previewTheme;
    public int previewType;
    public final RectF rect;
    public final RectF rect1;
    public final RectF rect2;
    public boolean relayout;
    public Text siteNameText;
    public boolean smallPhoto;
    public float textScale;
    public Text titleText;
    public boolean video;
    public float w;
    public WebPagePreview webpage;
    public final AnimatedFloat width;

    public final class WebPagePreview extends TLObject {
        public static final int $r8$clinit = 0;
        public boolean captionAbove = true;
        public int flags;
        public boolean largePhoto;
        public String name;
        public int photoSize;
        public String url;
        public TLRPC.WebPage webpage;

        @Override
        public final void readParams(InputSerializedData inputSerializedData, boolean z) {
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

        @Override
        public final void serializeToStream(OutputSerializedData outputSerializedData) {
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
    }

    public LinkPreview(Context context, float f) {
        super(context);
        this.relayout = true;
        this.textScale = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.layoutPaint = textPaint;
        this.padding = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
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

    @Override
    public final void dispatchDraw(Canvas canvas) {
        drawInternal(canvas);
    }

    public final void drawInternal(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float fM;
        float f4;
        float f5;
        Text text;
        Text text2;
        Canvas canvas2 = canvas;
        setupLayout();
        float f6 = this.width.set(this.w, false);
        float f7 = this.height.set(this.h, false);
        float f8 = this.previewTheme.set(this.previewType == 0);
        float f9 = this.previewProgress.set(withPreview());
        float f10 = this.density;
        float fLerp = AndroidUtilities.lerp(0.2f * f7, 16.66f * f10, f9);
        RectF rectF = this.bounds;
        int i = this.padx;
        float f11 = i;
        int i2 = this.pady;
        float f12 = i2;
        rectF.set(f11, f12, f11 + f6, f12 + f7);
        Paint paint = this.outlinePaint;
        paint.setColor(ColorUtils.blendARGB(f9, this.backgroundColor, ColorUtils.blendARGB(f8, -1, -14670807)));
        Path path = this.path2;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fLerp, fLerp, direction);
        canvas2.drawPath(path, paint);
        if (f9 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i, i2);
            float f13 = this.captionAbove.set(this.messageAbove);
            float height = (7.33f * f10) + 0.0f;
            Text text3 = this.messageText;
            if (text3 == null || f13 <= 0.0f) {
                f2 = f13;
                f3 = 2.0f;
            } else {
                f2 = f13;
                f3 = 2.0f;
                text3.draw(f10 * 10.0f, BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, f13, (f10 * 15.0f) + this.messageText.layout.getHeight(), (text3.layout.getHeight() / 2.0f) + height), f9, -15033089, canvas2);
                height = (((f10 * 7.0f) + this.messageText.layout.getHeight()) * f2) + height;
            }
            float f14 = height;
            float f15 = this.previewHeightProgress.set(this.previewHeight, false);
            Paint paint2 = this.previewPaint;
            paint2.setAlpha(25);
            RectF rectF2 = this.rect;
            float f16 = f10 * 10.0f;
            f = 1.0f;
            float f17 = f15 + f14;
            rectF2.set(f16, f14, f6 - f16, f17);
            Path path2 = this.path;
            path2.rewind();
            float f18 = 5.0f * f10;
            path2.addRoundRect(rectF2, f18, f18, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(255);
            canvas.drawRect(f10 * 10.0f, f14, 13.0f * f10, f17, paint2);
            canvas.restore();
            float f19 = (5.66f * f10) + f14;
            if (!this.hasSiteName || (text2 = this.siteNameText) == null) {
                fM = f19;
                f9 = f9;
                f4 = 2.0f;
                f5 = 2.66f;
            } else {
                f9 = f9;
                f4 = 2.0f;
                f5 = 2.66f;
                text2.draw(f10 * 20.0f, (text2.layout.getHeight() / f3) + f19, f9, paint2.getColor(), canvas);
                fM = OKLCH.m(f10, 2.66f, this.siteNameText.layout.getHeight(), f19);
            }
            if (!this.hasTitle || (text = this.titleText) == null) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                text.draw(f10 * 20.0f, (text.layout.getHeight() / f4) + fM, f9, ColorUtils.blendARGB(f8, -13421773, -1), canvas2);
                fM = OKLCH.m(f10, f5, this.titleText.layout.getHeight(), fM);
            }
            if (this.hasDescription && this.descriptionLayout != null) {
                canvas2.save();
                canvas2.translate((f10 * 20.0f) - this.descriptionLayoutLeft, fM);
                this.descriptionPaint.setColor(ColorUtils.blendARGB(f8, -13421773, -1));
                this.descriptionPaint.setAlpha((int) (255.0f * f9));
                this.descriptionLayout.draw(canvas2);
                canvas2.restore();
                fM = OKLCH.m(f10, f5, this.descriptionLayout.getHeight(), fM);
            }
            float f20 = this.photoAlphaProgress.set(this.hasPhoto);
            if (f20 > 0.0f) {
                float f21 = this.photoSmallProgress.set(this.smallPhoto);
                float f22 = f10 * 20.0f;
                float f23 = (f10 * f5) + fM;
                this.rect1.set(f22, f23, f6 - f22, this.photoHeight + f23);
                float f24 = 6.0f * f10;
                float f25 = (f6 - (f10 * 10.0f)) - f24;
                float f26 = 48.0f * f10;
                float f27 = f24 + f14;
                this.rect2.set(f25 - f26, f27, f25, f26 + f27);
                AndroidUtilities.lerp(this.rect1, this.rect2, f21, rectF2);
                ImageReceiver imageReceiver = this.photoImage;
                imageReceiver.setImageCoords(rectF2.left, rectF2.top, rectF2.width(), rectF2.height());
                imageReceiver.setAlpha(f20 * f9);
                imageReceiver.draw(canvas2);
                fM += ((f10 * 2.66f) + this.photoHeight) * (1.0f - f21);
            }
            float f28 = (5.0f * f10) + (7.0f * f10) + fM;
            Text text4 = this.messageText;
            if (text4 != null && 1.0f - f2 > 0.0f) {
                text4.draw(10.0f * f10, (((15.0f * f10) + this.messageText.layout.getHeight()) * f2) + (text4.layout.getHeight() / f4) + f28, f9, -15033089, canvas2);
                this.messageText.layout.getHeight();
            }
            canvas2.restore();
        } else {
            f = 1.0f;
        }
        if (f9 < f) {
            float f29 = this.padding.left;
            int iM$1 = ((int) SurfaceContainer$$ExternalSyntheticOutline0.m$1(f10, 30.0f, f7, 2.0f)) + i2;
            Drawable drawable = this.icon;
            drawable.setBounds(((int) (f29 * f10)) + i, ((int) SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(f10, 30.0f, f7, 2.0f)) + i2, ((int) ((f29 + 30.0f) * f10)) + i, iM$1);
            int i3 = (int) ((f - f9) * 255.0f);
            drawable.setAlpha(i3);
            drawable.draw(canvas2);
            if (this.layout != null) {
                canvas2.save();
                canvas2.translate(((this.padding.left + 30.0f + 3.25f) * f10) + i, (f7 / 2.0f) + i2);
                float f30 = this.textScale;
                canvas2.scale(f30, f30);
                canvas2.translate(-this.layoutLeft, (-this.layout.getHeight()) / 2.0f);
                this.layoutPaint.setAlpha(i3);
                this.layout.draw(canvas2);
                canvas2.restore();
            }
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

    public int getPreviewType() {
        return this.previewType;
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

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.photoImage.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.photoImage.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setupLayout();
        int iCeil = (int) Math.ceil(this.w);
        int i3 = this.padx;
        int i4 = iCeil + i3 + i3;
        int iCeil2 = (int) Math.ceil(this.h);
        int i5 = this.pady;
        setMeasuredDimension(i4, iCeil2 + i5 + i5);
    }

    public final void pushPhotoToCache() {
        if (this.hasPhoto) {
            ImageReceiver imageReceiver = this.photoImage;
            if (!imageReceiver.hasImageLoaded() || imageReceiver.getBitmap() == null) {
                return;
            }
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(imageReceiver.getBitmap()), imageReceiver.getImageKey(), false);
        }
    }

    public final void set(int i, WebPagePreview webPagePreview, boolean z) {
        this.currentAccount = i;
        if (this.webpage != webPagePreview || z) {
            this.webpage = webPagePreview;
            this.relayout = true;
            this.animated = z;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
        this.relayout = true;
    }

    public void setPreviewType(int i) {
        this.previewType = i;
        invalidate();
    }

    public final void setType(int i, int i2) {
        Drawable drawable = this.icon;
        TextPaint textPaint = this.layoutPaint;
        if (i == 0) {
            this.backgroundColor = i2;
            int i3 = AndroidUtilities.computePerceivedBrightness(i2) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i3);
            drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        } else if (i == 1) {
            this.backgroundColor = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i == 2) {
            this.backgroundColor = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.backgroundColor = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void setupLayout() {
        String upperCase;
        int color1;
        float f;
        int i;
        int i2;
        int lineCount;
        float f2;
        float f3;
        if (!this.relayout || this.webpage == null) {
            return;
        }
        boolean zWithPreview = withPreview();
        int i3 = this.padx;
        float f4 = this.density;
        if (zWithPreview) {
            String str = TextUtils.isEmpty(this.webpage.name) ? this.webpage.url : this.webpage.name;
            TLRPC.WebPage webPage = this.webpage.webpage;
            float f5 = (this.maxWidth - i3) - i3;
            this.h = 0.0f;
            this.w = 0.0f;
            this.previewHeight = 0.0f;
            int colorId = UserObject.getColorId(UserConfig.getInstance(this.currentAccount).getCurrentUser());
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).peerColors;
            MessagesController.PeerColor color = (peerColors == null || colorId < 7) ? null : peerColors.getColor(colorId);
            Paint paint = this.previewPaint;
            if (color == null) {
                int[] iArr = Theme.keys_avatar_nameInMessage;
                color1 = Theme.getColor(null, iArr[colorId % iArr.length], false);
            } else {
                color1 = color.getColor1();
            }
            paint.setColor(color1);
            this.h = (7.33f * f4) + this.h;
            this.messageAbove = this.webpage.captionAbove;
            Text text = new Text(str, 16.0f, null);
            text.paint.setTextSize(16.0f * f4);
            float f6 = 20.0f * f4;
            text.maxWidth = f5 - f6;
            text.setText(text.layout.getText());
            this.messageText = text;
            this.w = Math.max(this.w, Math.min(f6 + text.width, f5));
            float f7 = 7.0f * f4;
            this.h = this.h + this.messageText.layout.getHeight() + f7;
            this.hasPhoto = webPage.photo != null || MessageObject.isVideoDocument(webPage.document);
            WebPagePreview webPagePreview = this.webpage;
            boolean z = webPagePreview.largePhoto;
            this.smallPhoto = !z;
            int i4 = (!this.video || (webPagePreview.flags & 4) == 0) ? ((int) (!z ? 48.0f : (f5 / f4) - 40.0f)) * 2 : webPagePreview.photoSize;
            ImageReceiver imageReceiver = this.photoImage;
            imageReceiver.setRoundRadius((int) (4.0f * f4));
            TLRPC.Photo photo = webPage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                f = 48.0f;
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i4 * f4), false, closestPhotoSizeWithSize, false);
                if (closestPhotoSizeWithSize2 != null) {
                    i2 = closestPhotoSizeWithSize2.w;
                    i = closestPhotoSizeWithSize2.h;
                } else {
                    i = 0;
                    i2 = 0;
                }
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo), DiffUtil.m(i4, i4, "_"), this.video ? null : ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo), this.video ? null : DiffUtil.m(i4, i4, "_"), 0L, null, null, 0);
            } else {
                f = 48.0f;
                TLRPC.Document document = webPage.document;
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i4 * f4), false, closestPhotoSizeWithSize3, false);
                    if (closestPhotoSizeWithSize4 != null) {
                        int i5 = closestPhotoSizeWithSize4.w;
                        i = closestPhotoSizeWithSize4.h;
                        i2 = i5;
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document), DiffUtil.m(i4, i4, "_"), this.video ? null : ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document), this.video ? null : DiffUtil.m(i4, i4, "_"), 0L, null, null, 0);
                } else {
                    i = 0;
                    i2 = 0;
                }
            }
            this.previewHeight = (5.66f * f4) + this.previewHeight;
            boolean zIsEmpty = TextUtils.isEmpty(webPage.site_name);
            this.hasSiteName = !zIsEmpty;
            if (zIsEmpty) {
                lineCount = 0;
            } else {
                Text text2 = new Text(webPage.site_name, 14.0f, AndroidUtilities.bold());
                text2.paint.setTextSize(f4 * 14.0f);
                float f8 = f4 * 40.0f;
                text2.maxWidth = (int) Math.ceil((f5 - f8) - ((this.hasPhoto && this.smallPhoto) ? f4 * 60.0f : 0.0f));
                text2.setText(text2.layout.getText());
                this.siteNameText = text2;
                this.w = Math.max(this.w, Math.min(f8 + text2.width + ((this.hasPhoto && this.smallPhoto) ? f4 * 60.0f : 0.0f), f5));
                this.previewHeight = (f4 * 2.66f) + this.previewHeight + this.siteNameText.layout.getHeight();
                lineCount = this.siteNameText.layout.getLineCount();
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(webPage.title);
            this.hasTitle = !zIsEmpty2;
            if (zIsEmpty2) {
                f2 = f4;
                f3 = 2.66f;
            } else {
                Text text3 = new Text(webPage.title, 14.0f, AndroidUtilities.bold());
                text3.paint.setTextSize(f4 * 14.0f);
                float f9 = f4 * 40.0f;
                f3 = 2.66f;
                f2 = f4;
                text3.maxWidth = (int) Math.ceil((f5 - f9) - ((this.hasPhoto && this.smallPhoto) ? f4 * 60.0f : 0.0f));
                text3.setText(text3.layout.getText());
                this.titleText = text3;
                this.w = Math.max(this.w, Math.min(f9 + text3.width + ((this.hasPhoto && this.smallPhoto) ? 60.0f * f2 : 0.0f), f5));
                this.previewHeight = (f2 * 2.66f) + this.previewHeight + this.titleText.layout.getHeight();
                lineCount += this.titleText.layout.getLineCount();
            }
            boolean zIsEmpty3 = TextUtils.isEmpty(webPage.description);
            this.hasDescription = !zIsEmpty3;
            if (!zIsEmpty3) {
                TextPaint textPaint = this.descriptionPaint;
                textPaint.setTextSize(f2 * 14.0f);
                float f10 = f2 * 40.0f;
                int i6 = 3 - lineCount;
                this.descriptionLayout = ChatMessageCell.generateStaticLayout(webPage.description, textPaint, (int) Math.ceil(Math.max(1.0f, f5 - f10)), (int) Math.ceil(Math.max(1.0f, f5 - ((40 + ((this.hasPhoto && this.smallPhoto) ? 60 : 0)) * f2))), i6, 4);
                this.descriptionLayoutWidth = 0.0f;
                this.descriptionLayoutLeft = Float.MAX_VALUE;
                int i7 = 0;
                while (i7 < this.descriptionLayout.getLineCount()) {
                    this.descriptionLayoutWidth = Math.max(this.descriptionLayoutWidth, this.descriptionLayout.getLineWidth(i7) + (this.hasPhoto && this.smallPhoto && i7 < i6 ? f2 * f : 0.0f));
                    this.descriptionLayoutLeft = Math.min(this.descriptionLayoutLeft, this.descriptionLayout.getLineLeft(i7));
                    i7++;
                }
                this.w = Math.max(this.w, Math.min(f10 + this.descriptionLayoutWidth, f5));
                this.previewHeight = (f2 * f3) + this.previewHeight + this.descriptionLayout.getHeight();
            }
            if (this.hasPhoto && !this.smallPhoto) {
                if (i2 <= 0 || i <= 0) {
                    this.photoHeight = f2 * 120.0f;
                } else {
                    this.photoHeight = Math.min((Math.max(0.0f, this.w - (f2 * 40.0f)) / i2) * i, f2 * 200.0f);
                }
                this.previewHeight = (f2 * f3) + this.previewHeight + this.photoHeight;
            }
            float f11 = f7 + this.previewHeight;
            this.previewHeight = f11;
            this.h = (f2 * 11.0f) + this.h + f11;
        } else {
            if (TextUtils.isEmpty(this.webpage.name)) {
                String strSubstring = this.webpage.url;
                if (strSubstring.startsWith("https://")) {
                    strSubstring = strSubstring.substring(8);
                }
                upperCase = strSubstring.toUpperCase();
            } else {
                upperCase = this.webpage.name;
            }
            float f12 = (this.maxWidth - i3) - i3;
            RectF rectF = this.padding;
            float f13 = f12 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f4);
            this.textScale = 1.0f;
            TextPaint textPaint2 = this.layoutPaint;
            double d = f13;
            this.layout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint2, (int) Math.ceil(d), TextUtils.TruncateAt.END), textPaint2, (int) Math.ceil(d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.layoutWidth = 0.0f;
            this.layoutLeft = Float.MAX_VALUE;
            for (int i8 = 0; i8 < this.layout.getLineCount(); i8++) {
                this.layoutWidth = Math.max(this.layoutWidth, this.layout.getLineWidth(i8));
                this.layoutLeft = Math.min(this.layoutLeft, this.layout.getLineLeft(i8));
            }
            if (this.layout.getLineCount() > 2) {
                this.textScale = 0.3f;
            } else {
                this.textScale = Math.min(1.0f, f13 / this.layoutWidth);
            }
            this.w = (this.layoutWidth * this.textScale) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f4);
            this.h = Math.max(f4 * 30.0f, this.layout.getHeight() * this.textScale) + ((rectF.top + rectF.bottom) * f4);
        }
        if (this.animated) {
            invalidate();
        } else {
            this.captionAbove.set(this.messageAbove, true);
            this.photoSmallProgress.set(this.smallPhoto, true);
            this.photoAlphaProgress.set(this.hasPhoto, true);
            this.previewHeightProgress.set(this.previewHeight, true);
        }
        this.relayout = false;
    }

    public final boolean withPreview() {
        WebPagePreview webPagePreview = this.webpage;
        return (webPagePreview == null || webPagePreview.webpage == null) ? false : true;
    }
}
