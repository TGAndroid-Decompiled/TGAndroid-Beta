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
public final class i2 extends View implements org.telegram.ui.Cells.n9 {
    public final t70 f38496a;
    public final g4 f38497b;
    public b3 f38498c;
    public b3 d;
    public boolean f38499e;
    public boolean f38500f;
    public final ImageReceiver h;
    public c4 f38501n;
    public TLObject f38502r;
    public final int f38503s;
    public final int v;
    public int f38504w;

    public i2(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f38503s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f38496a = t70Var;
        this.f38497b = g4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f38498c;
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
        b3 b3Var = this.f38498c;
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
        b3 b3Var = this.f38498c;
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
        if (this.f38501n != null) {
            if (this.f38500f) {
                this.h.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f38503s, AndroidUtilities.dp(10.0f));
            b3 b3Var = this.f38498c;
            t70 t70Var = this.f38496a;
            int i11 = 0;
            if (b3Var != null) {
                i4.v(t70Var, canvas, this, 0);
                this.f38498c.draw(canvas, this);
                i10 = 1;
            } else {
                i10 = 0;
            }
            float f7 = 0.0f;
            if (this.d != null) {
                canvas.translate(0.0f, this.f38504w);
                i4.v(t70Var, canvas, this, i10);
                this.d.draw(canvas, this);
            }
            canvas.restore();
            if (this.f38499e) {
                g4 g4Var = this.f38497b;
                if (g4Var == null || !g4Var.G) {
                    f7 = AndroidUtilities.dp(17.0f);
                }
                float f10 = f7;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (g4Var != null && g4Var.G) {
                    i11 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(f10, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, i4.f38530r1);
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
        b3 b3Var = this.f38498c;
        g4 g4Var = this.f38497b;
        t70 t70Var = this.f38496a;
        if (b3Var != null && (j10 = i4.j(t70Var, g4Var, b3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null && (j3 = i4.j(t70Var, g4Var, b3Var2)) != null) {
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
        int i13;
        float f7;
        int i14;
        int i15;
        String str;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        c4 c4Var = this.f38501n;
        if (c4Var.f36554b != c4Var.f36553a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38499e = z10;
        c4 c4Var2 = this.f38501n;
        TL_iv.pageRelatedArticle pagerelatedarticle = c4Var2.f36553a.articles.get(c4Var2.f36554b);
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j3 = pagerelatedarticle.photo_id;
        int i16 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TLRPC.PhotoSize photoSize = null;
        g4 g4Var = this.f38497b;
        if (i16 != 0) {
            if (g4Var != null) {
                photo = f4.e(g4Var.E, j3);
            } else {
                photo = f4.d(j3, this.f38502r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f38500f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(photoSize, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.f38502r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f38500f = false;
        }
        int dp3 = AndroidUtilities.dp(60.0f);
        int dp4 = size - AndroidUtilities.dp(36.0f);
        if (this.f38500f) {
            float dp5 = AndroidUtilities.dp(44.0f);
            imageReceiver.setImageCoords((size - dp) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), dp5, dp5);
            dp4 = (int) (dp4 - (imageReceiver.getImageWidth() + AndroidUtilities.dp(6.0f)));
        }
        int i17 = dp4;
        int dp6 = AndroidUtilities.dp(18.0f);
        String str2 = pagerelatedarticle.title;
        if (str2 != null) {
            i13 = 1;
            i12 = dp3;
            f7 = 6.0f;
            this.f38498c = i4.p(this.f38496a, this, str2, null, i17, this.v, this.f38501n, Layout.Alignment.ALIGN_NORMAL, 3, this.f38497b);
        } else {
            i12 = dp3;
            i13 = 1;
            f7 = 6.0f;
        }
        b3 b3Var = this.f38498c;
        int i18 = this.f38503s;
        int i19 = this.v;
        if (b3Var != null) {
            int lineCount = b3Var.d.getLineCount();
            i14 = 4 - lineCount;
            this.f38504w = org.telegram.messenger.q.C(f7, this.f38498c.d.getHeight(), dp2);
            dp6 = this.f38498c.d.getHeight() + dp6;
            int i20 = 0;
            while (true) {
                if (i20 < lineCount) {
                    if (this.f38498c.d.getLineLeft(i20) != 0.0f) {
                        i15 = i13;
                        break;
                    }
                    i20++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            b3 b3Var2 = this.f38498c;
            b3Var2.f36161s = i18;
            b3Var2.v = i19;
        } else {
            this.f38504w = 0;
            i14 = 4;
            i15 = 0;
        }
        int i21 = i14;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            int i22 = R.string.ArticleDateByAuthor;
            String format = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[i13] = str3;
            str = LocaleController.formatString(i22, objArr);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
            int i23 = R.string.ArticleByAuthor;
            Object[] objArr2 = new Object[i13];
            objArr2[0] = pagerelatedarticle.author;
            str = LocaleController.formatString(i23, objArr2);
        } else if (pagerelatedarticle.published_date != 0) {
            str = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
            str = pagerelatedarticle.description;
        } else {
            str = pagerelatedarticle.url;
        }
        int i24 = this.f38504w + i19;
        String str4 = str;
        c4 c4Var3 = this.f38501n;
        if ((g4Var != null && g4Var.G) || i15 != 0) {
            alignment = org.telegram.ui.Components.nx0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        b3 p5 = i4.p(this.f38496a, this, str4, null, i17, i24, c4Var3, alignment, i21, this.f38497b);
        this.d = p5;
        if (p5 != null) {
            int height = p5.d.getHeight() + dp6;
            if (this.f38498c != null) {
                height = org.telegram.messenger.q.C(f7, dp2, height);
            }
            dp6 = height;
            b3 b3Var3 = this.d;
            b3Var3.f36161s = i18;
            b3Var3.v = i19 + this.f38504w;
        }
        setMeasuredDimension(size, Math.max(i12, dp6) + (this.f38499e ? 1 : 0));
    }
}
