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
public final class i2 extends View implements org.telegram.ui.Cells.p9 {
    public final p70 f34332a;
    public final g4 f34333b;
    public b3 f34334c;
    public b3 d;
    public boolean e;
    public boolean f34335f;
    public final ImageReceiver h;
    public c4 f34336n;
    public TLObject f34337r;
    public final int f34338s;
    public final int v;
    public int f34339w;

    public i2(Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.f34338s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f34332a = p70Var;
        this.f34333b = g4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f34334c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f34334c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f34334c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float dp;
        if (this.f34336n != null) {
            if (this.f34335f) {
                this.h.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f34338s, AndroidUtilities.dp(10.0f));
            b3 b3Var = this.f34334c;
            p70 p70Var = this.f34332a;
            int i11 = 0;
            if (b3Var != null) {
                i4.v(p70Var, canvas, this, 0);
                this.f34334c.draw(canvas, this);
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.d != null) {
                canvas.translate(0.0f, this.f34339w);
                i4.v(p70Var, canvas, this, i10);
                this.d.draw(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                g4 g4Var = this.f34333b;
                if (g4Var != null && g4Var.G) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(17.0f);
                }
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (g4Var != null && g4Var.G) {
                    i11 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, i4.f34365r1);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence j3;
        CharSequence j10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        b3 b3Var = this.f34334c;
        g4 g4Var = this.f34333b;
        p70 p70Var = this.f34332a;
        if (b3Var != null && (j10 = i4.j(p70Var, g4Var, b3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null && (j3 = i4.j(p70Var, g4Var, b3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(j3);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVRelatedArticle));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        TLRPC.Photo photo;
        ImageReceiver imageReceiver;
        int i12;
        char c10;
        float f7;
        boolean z11;
        int i13;
        String str;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        c4 c4Var = this.f34336n;
        if (c4Var.f32542b != c4Var.f32541a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        c4 c4Var2 = this.f34336n;
        TL_iv.pageRelatedArticle pagerelatedarticle = c4Var2.f32541a.articles.get(c4Var2.f32542b);
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j3 = pagerelatedarticle.photo_id;
        TLRPC.PhotoSize photoSize = null;
        g4 g4Var = this.f34333b;
        if (j3 != 0) {
            if (g4Var != null) {
                photo = f4.e(g4Var.E, j3);
            } else {
                photo = f4.d(j3, this.f34337r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f34335f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(photoSize, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.f34337r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f34335f = false;
        }
        int dp3 = AndroidUtilities.dp(60.0f);
        int dp4 = size - AndroidUtilities.dp(36.0f);
        if (this.f34335f) {
            float dp5 = AndroidUtilities.dp(44.0f);
            imageReceiver.setImageCoords((size - dp) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), dp5, dp5);
            dp4 = (int) (dp4 - (imageReceiver.getImageWidth() + AndroidUtilities.dp(6.0f)));
        }
        int i14 = dp4;
        int dp6 = AndroidUtilities.dp(18.0f);
        String str2 = pagerelatedarticle.title;
        if (str2 != null) {
            i12 = dp3;
            c10 = 1;
            f7 = 6.0f;
            this.f34334c = i4.p(this.f34332a, this, str2, null, i14, this.v, this.f34336n, Layout.Alignment.ALIGN_NORMAL, 3, this.f34333b);
        } else {
            i12 = dp3;
            c10 = 1;
            f7 = 6.0f;
        }
        b3 b3Var = this.f34334c;
        int i15 = this.f34338s;
        int i16 = this.v;
        if (b3Var != null) {
            int lineCount = b3Var.d.getLineCount();
            int i17 = 4 - lineCount;
            this.f34339w = org.telegram.messenger.f0.C(f7, this.f34334c.d.getHeight(), dp2);
            dp6 = this.f34334c.d.getHeight() + dp6;
            int i18 = 0;
            while (true) {
                if (i18 < lineCount) {
                    if (this.f34334c.d.getLineLeft(i18) != 0.0f) {
                        z11 = true;
                        break;
                    }
                    i18++;
                } else {
                    z11 = false;
                    break;
                }
            }
            b3 b3Var2 = this.f34334c;
            b3Var2.f32291s = i15;
            b3Var2.v = i16;
            i13 = i17;
        } else {
            this.f34339w = 0;
            z11 = false;
            i13 = 4;
        }
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            int i19 = R.string.ArticleDateByAuthor;
            String format = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[c10] = str3;
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
        int i20 = this.f34339w + i16;
        String str4 = str;
        c4 c4Var3 = this.f34336n;
        if ((g4Var != null && g4Var.G) || z11) {
            alignment = org.telegram.ui.Components.uw0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        b3 p5 = i4.p(this.f34332a, this, str4, null, i14, i20, c4Var3, alignment, i13, this.f34333b);
        this.d = p5;
        if (p5 != null) {
            int height = p5.d.getHeight() + dp6;
            if (this.f34334c != null) {
                height = org.telegram.messenger.f0.C(f7, dp2, height);
            }
            dp6 = height;
            b3 b3Var3 = this.d;
            b3Var3.f32291s = i15;
            b3Var3.v = i16 + this.f34339w;
        }
        setMeasuredDimension(size, Math.max(i12, dp6) + (this.e ? 1 : 0));
    }
}
