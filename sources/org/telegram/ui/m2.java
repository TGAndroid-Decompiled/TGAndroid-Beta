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
public final class m2 extends View implements org.telegram.ui.Cells.j9 {
    public final d70 f40344a;
    public final k4 f40345b;
    public f3 f40346c;
    public f3 d;
    public boolean f40347e;
    public boolean f40348f;
    public final ImageReceiver h;
    public g4 f40349n;
    public TLObject f40350r;
    public final int f40351s;
    public final int v;
    public int f40352w;

    public m2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f40351s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f40344a = d70Var;
        this.f40345b = k4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f40346c;
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
        f3 f3Var = this.f40346c;
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
        f3 f3Var = this.f40346c;
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
        float dp;
        if (this.f40349n != null) {
            if (this.f40348f) {
                this.h.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f40351s, AndroidUtilities.dp(10.0f));
            f3 f3Var = this.f40346c;
            d70 d70Var = this.f40344a;
            int i11 = 0;
            if (f3Var != null) {
                m4.v(d70Var, canvas, this, 0);
                this.f40346c.draw(canvas, this);
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.d != null) {
                canvas.translate(0.0f, this.f40352w);
                m4.v(d70Var, canvas, this, i10);
                this.d.draw(canvas, this);
            }
            canvas.restore();
            if (this.f40347e) {
                k4 k4Var = this.f40345b;
                if (k4Var != null && k4Var.C) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(17.0f);
                }
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (k4Var != null && k4Var.C) {
                    i11 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, m4.f40378n1);
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
        f3 f3Var = this.f40346c;
        k4 k4Var = this.f40345b;
        d70 d70Var = this.f40344a;
        if (f3Var != null && (j11 = m4.j(d70Var, k4Var, f3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null && (j10 = m4.j(d70Var, k4Var, f3Var2)) != null) {
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
        boolean z10;
        TLRPC.Photo photo;
        ImageReceiver imageReceiver;
        int i12;
        char c3;
        float f9;
        boolean z11;
        int i13;
        String str;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        g4 g4Var = this.f40349n;
        if (g4Var.f38450b != g4Var.f38449a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40347e = z10;
        g4 g4Var2 = this.f40349n;
        TL_iv.pageRelatedArticle pagerelatedarticle = g4Var2.f38449a.articles.get(g4Var2.f38450b);
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        TLRPC.PhotoSize photoSize = null;
        k4 k4Var = this.f40345b;
        if (j10 != 0) {
            if (k4Var != null) {
                photo = j4.e(k4Var.A, j10);
            } else {
                photo = j4.d(j10, this.f40350r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f40348f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(photoSize, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.f40350r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f40348f = false;
        }
        int dp3 = AndroidUtilities.dp(60.0f);
        int dp4 = size - AndroidUtilities.dp(36.0f);
        if (this.f40348f) {
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
            f9 = 6.0f;
            this.f40346c = m4.p(this.f40344a, this, str2, null, i14, this.v, this.f40349n, Layout.Alignment.ALIGN_NORMAL, 3, this.f40345b);
        } else {
            i12 = dp3;
            c3 = 1;
            f9 = 6.0f;
        }
        f3 f3Var = this.f40346c;
        int i15 = this.f40351s;
        int i16 = this.v;
        if (f3Var != null) {
            int lineCount = f3Var.d.getLineCount();
            int i17 = 4 - lineCount;
            this.f40352w = org.telegram.messenger.x3.C(f9, this.f40346c.d.getHeight(), dp2);
            dp6 = this.f40346c.d.getHeight() + dp6;
            int i18 = 0;
            while (true) {
                if (i18 < lineCount) {
                    if (this.f40346c.d.getLineLeft(i18) != 0.0f) {
                        z11 = true;
                        break;
                    }
                    i18++;
                } else {
                    z11 = false;
                    break;
                }
            }
            f3 f3Var2 = this.f40346c;
            f3Var2.f37974s = i15;
            f3Var2.v = i16;
            i13 = i17;
        } else {
            this.f40352w = 0;
            z11 = false;
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
        int i20 = this.f40352w + i16;
        String str4 = str;
        g4 g4Var3 = this.f40349n;
        if ((k4Var != null && k4Var.C) || z11) {
            alignment = org.telegram.ui.Components.bw0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        f3 p10 = m4.p(this.f40344a, this, str4, null, i14, i20, g4Var3, alignment, i13, this.f40345b);
        this.d = p10;
        if (p10 != null) {
            int height = p10.d.getHeight() + dp6;
            if (this.f40346c != null) {
                height = org.telegram.messenger.x3.C(f9, dp2, height);
            }
            dp6 = height;
            f3 f3Var3 = this.d;
            f3Var3.f37974s = i15;
            f3Var3.v = i16 + this.f40352w;
        }
        setMeasuredDimension(size, Math.max(i12, dp6) + (this.f40347e ? 1 : 0));
    }
}
