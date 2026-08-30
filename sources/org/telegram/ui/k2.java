package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class k2 extends View implements org.telegram.ui.Cells.l9 {
    public final n70 f35545a;
    public final j4 f35546b;
    public d3 f35547c;
    public d3 d;
    public boolean e;
    public boolean f35548f;
    public final ImageReceiver h;
    public f4 f35549n;
    public TLObject f35550r;
    public final int f35551s;
    public final int v;
    public int f35552w;

    public k2(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.f35551s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f35545a = n70Var;
        this.f35546b = j4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f35547c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f35547c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f35547c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float dp;
        if (this.f35549n != null) {
            if (this.f35548f) {
                this.h.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f35551s, AndroidUtilities.dp(10.0f));
            d3 d3Var = this.f35547c;
            n70 n70Var = this.f35545a;
            int i11 = 0;
            if (d3Var != null) {
                l4.v(n70Var, canvas, this, 0);
                this.f35547c.draw(canvas, this);
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.d != null) {
                canvas.translate(0.0f, this.f35552w);
                l4.v(n70Var, canvas, this, i10);
                this.d.draw(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                j4 j4Var = this.f35546b;
                if (j4Var != null && j4Var.D) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(17.0f);
                }
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (j4Var != null && j4Var.D) {
                    i11 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, l4.f35918o1);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence j10;
        CharSequence j11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        d3 d3Var = this.f35547c;
        j4 j4Var = this.f35546b;
        n70 n70Var = this.f35545a;
        if (d3Var != null && (j11 = l4.j(n70Var, j4Var, d3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null && (j10 = l4.j(n70Var, j4Var, d3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(j10);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVRelatedArticle));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        TLRPC.Photo photo;
        ImageReceiver imageReceiver;
        int i12;
        char c3;
        float f10;
        boolean z10;
        int i13;
        String str;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        f4 f4Var = this.f35549n;
        if (f4Var.f34154b != f4Var.f34153a.articles.size() - 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.e = z4;
        f4 f4Var2 = this.f35549n;
        TL_iv.pageRelatedArticle pagerelatedarticle = f4Var2.f34153a.articles.get(f4Var2.f34154b);
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        TLRPC.PhotoSize photoSize = null;
        j4 j4Var = this.f35546b;
        if (j10 != 0) {
            if (j4Var != null) {
                photo = i4.e(j4Var.B, j10);
            } else {
                photo = i4.d(j10, this.f35550r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f35548f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(photoSize, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.f35550r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f35548f = false;
        }
        int dp3 = AndroidUtilities.dp(60.0f);
        int dp4 = size - AndroidUtilities.dp(36.0f);
        if (this.f35548f) {
            float dp5 = AndroidUtilities.dp(44.0f);
            imageReceiver.setImageCoords((size - dp) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), dp5, dp5);
            dp4 = (int) (dp4 - (imageReceiver.getImageWidth() + AndroidUtilities.dp(6.0f)));
        }
        int i14 = dp4;
        int dp6 = AndroidUtilities.dp(18.0f);
        String str2 = pagerelatedarticle.title;
        if (str2 != null) {
            i12 = dp3;
            c3 = 1;
            f10 = 6.0f;
            this.f35547c = l4.p(this.f35545a, this, str2, null, i14, this.v, this.f35549n, Layout.Alignment.ALIGN_NORMAL, 3, this.f35546b);
        } else {
            i12 = dp3;
            c3 = 1;
            f10 = 6.0f;
        }
        d3 d3Var = this.f35547c;
        int i15 = this.f35551s;
        int i16 = this.v;
        if (d3Var != null) {
            int lineCount = d3Var.d.getLineCount();
            int i17 = 4 - lineCount;
            this.f35552w = org.telegram.messenger.y3.C(f10, this.f35547c.d.getHeight(), dp2);
            dp6 = this.f35547c.d.getHeight() + dp6;
            int i18 = 0;
            while (true) {
                if (i18 < lineCount) {
                    if (this.f35547c.d.getLineLeft(i18) != 0.0f) {
                        z10 = true;
                        break;
                    }
                    i18++;
                } else {
                    z10 = false;
                    break;
                }
            }
            d3 d3Var2 = this.f35547c;
            d3Var2.f33499s = i15;
            d3Var2.v = i16;
            i13 = i17;
        } else {
            this.f35552w = 0;
            z10 = false;
            i13 = 4;
        }
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            int i19 = R.string.ArticleDateByAuthor;
            String format = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[c3] = str3;
            str = LocaleController.formatString(i19, objArr);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
            str = LocaleController.formatString(R.string.ArticleByAuthor, pagerelatedarticle.author);
        } else if (pagerelatedarticle.published_date != 0) {
            str = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
            str = pagerelatedarticle.description;
        } else {
            str = pagerelatedarticle.url;
        }
        int i20 = this.f35552w + i16;
        String str4 = str;
        f4 f4Var3 = this.f35549n;
        if ((j4Var != null && j4Var.D) || z10) {
            alignment = org.telegram.ui.Components.kw0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        d3 p10 = l4.p(this.f35545a, this, str4, null, i14, i20, f4Var3, alignment, i13, this.f35546b);
        this.d = p10;
        if (p10 != null) {
            int height = p10.d.getHeight() + dp6;
            if (this.f35547c != null) {
                height = org.telegram.messenger.y3.C(f10, dp2, height);
            }
            dp6 = height;
            d3 d3Var3 = this.d;
            d3Var3.f33499s = i15;
            d3Var3.v = i16 + this.f35552w;
        }
        setMeasuredDimension(size, Math.max(i12, dp6) + (this.e ? 1 : 0));
    }
}
