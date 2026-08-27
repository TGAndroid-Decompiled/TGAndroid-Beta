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

public final class m2 extends View implements org.telegram.ui.Cells.i9 {

    public final d70 f40290a;

    public final k4 f40291b;

    public f3 f40292c;
    public f3 d;

    public boolean f40293e;

    public boolean f40294f;
    public final ImageReceiver h;

    public g4 f40295n;

    public TLObject f40296r;

    public final int f40297s;
    public final int v;

    public int f40298w;

    public m2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f40297s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f40290a = d70Var;
        this.f40291b = k4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f40292c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f40292c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f40292c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (this.f40295n == null) {
            return;
        }
        if (this.f40294f) {
            this.h.draw(canvas);
        }
        canvas.save();
        canvas.translate(this.f40297s, AndroidUtilities.dp(10.0f));
        f3 f3Var = this.f40292c;
        d70 d70Var = this.f40290a;
        int iDp = 0;
        if (f3Var != null) {
            m4.v(d70Var, canvas, this, 0);
            this.f40292c.draw(canvas, this);
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.d != null) {
            canvas.translate(0.0f, this.f40298w);
            m4.v(d70Var, canvas, this, i10);
            this.d.draw(canvas, this);
        }
        canvas.restore();
        if (this.f40293e) {
            k4 k4Var = this.f40291b;
            float fDp = (k4Var == null || !k4Var.C) ? AndroidUtilities.dp(17.0f) : 0.0f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k4Var != null && k4Var.C) {
                iDp = AndroidUtilities.dp(17.0f);
            }
            canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, m4.f40321n1);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequenceJ;
        CharSequence charSequenceJ2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        f3 f3Var = this.f40292c;
        k4 k4Var = this.f40291b;
        d70 d70Var = this.f40290a;
        if (f3Var != null && (charSequenceJ2 = m4.j(d70Var, k4Var, f3Var)) != null) {
            spannableStringBuilder.append(charSequenceJ2);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null && (charSequenceJ = m4.j(d70Var, k4Var, f3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(charSequenceJ);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVRelatedArticle));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TLRPC.Photo photoE;
        ImageReceiver imageReceiver;
        int i12;
        char c10;
        float f10;
        boolean z10;
        int i13;
        String string;
        int size = View.MeasureSpec.getSize(i10);
        g4 g4Var = this.f40295n;
        this.f40293e = g4Var.f38308b != g4Var.f38307a.articles.size() - 1;
        g4 g4Var2 = this.f40295n;
        TL_iv.pageRelatedArticle pagerelatedarticle = g4Var2.f38307a.articles.get(g4Var2.f38308b);
        int iDp = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        k4 k4Var = this.f40291b;
        if (j10 != 0) {
            photoE = k4Var != null ? j4.e(k4Var.A, j10) : j4.d(j10, this.f40296r);
        } else {
            photoE = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photoE != null) {
            this.f40294f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoE.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photoE.sizes, 80, true);
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photoE), "64_64", ImageLocation.getForPhoto(closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null, photoE), "64_64_b", closestPhotoSizeWithSize.size, null, this.f40296r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f40294f = false;
        }
        int iDp2 = AndroidUtilities.dp(60.0f);
        int iDp3 = size - AndroidUtilities.dp(36.0f);
        if (this.f40294f) {
            int iDp4 = AndroidUtilities.dp(44.0f);
            float f11 = iDp4;
            imageReceiver.setImageCoords((size - iDp4) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f11, f11);
            iDp3 = (int) (iDp3 - (imageReceiver.getImageWidth() + AndroidUtilities.dp(6.0f)));
        }
        int i14 = iDp3;
        int iDp5 = AndroidUtilities.dp(18.0f);
        String str = pagerelatedarticle.title;
        if (str != null) {
            i12 = iDp2;
            c10 = 1;
            f10 = 6.0f;
            this.f40292c = m4.p(this.f40290a, this, str, null, i14, this.v, this.f40295n, Layout.Alignment.ALIGN_NORMAL, 3, this.f40291b);
        } else {
            i12 = iDp2;
            c10 = 1;
            f10 = 6.0f;
        }
        f3 f3Var = this.f40292c;
        int i15 = this.f40297s;
        int i16 = this.v;
        if (f3Var != null) {
            int lineCount = f3Var.d.getLineCount();
            int i17 = 4 - lineCount;
            this.f40298w = org.telegram.messenger.y1.C(f10, this.f40292c.d.getHeight(), iDp);
            iDp5 = this.f40292c.d.getHeight() + iDp5;
            int i18 = 0;
            while (true) {
                if (i18 >= lineCount) {
                    z10 = false;
                    break;
                } else {
                    if (this.f40292c.d.getLineLeft(i18) != 0.0f) {
                        z10 = true;
                        break;
                    }
                    i18++;
                }
            }
            f3 f3Var2 = this.f40292c;
            f3Var2.f37923s = i15;
            f3Var2.v = i16;
            i13 = i17;
        } else {
            this.f40298w = 0;
            z10 = false;
            i13 = 4;
        }
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            int i19 = R.string.ArticleDateByAuthor;
            String str2 = LocaleController.getInstance().getChatFullDate().format(((long) pagerelatedarticle.published_date) * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = str2;
            objArr[c10] = str3;
            string = LocaleController.formatString(i19, objArr);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
            string = LocaleController.formatString(R.string.ArticleByAuthor, pagerelatedarticle.author);
        } else if (pagerelatedarticle.published_date != 0) {
            string = LocaleController.getInstance().getChatFullDate().format(((long) pagerelatedarticle.published_date) * 1000);
        } else {
            string = !TextUtils.isEmpty(pagerelatedarticle.description) ? pagerelatedarticle.description : pagerelatedarticle.url;
        }
        f3 f3VarP = m4.p(this.f40290a, this, string, null, i14, this.f40298w + i16, this.f40295n, ((k4Var == null || !k4Var.C) && !z10) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a(), i13, this.f40291b);
        this.d = f3VarP;
        if (f3VarP != null) {
            int height = f3VarP.d.getHeight() + iDp5;
            if (this.f40292c != null) {
                height = org.telegram.messenger.y1.C(f10, iDp, height);
            }
            iDp5 = height;
            f3 f3Var3 = this.d;
            f3Var3.f37923s = i15;
            f3Var3.v = i16 + this.f40298w;
        }
        setMeasuredDimension(size, Math.max(i12, iDp5) + (this.f40293e ? 1 : 0));
    }
}
