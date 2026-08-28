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
public final class l2 extends View implements org.telegram.ui.Cells.m9 {
    public final a70 f39970a;
    public final j4 f39971b;
    public e3 f39972c;
    public e3 d;
    public boolean f39973e;
    public boolean f39974f;
    public final ImageReceiver h;
    public f4 f39975n;
    public TLObject f39976r;
    public final int f39977s;
    public final int v;
    public int f39978w;

    public l2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f39977s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f39970a = a70Var;
        this.f39971b = j4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f39972c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f39972c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f39972c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        float dp;
        if (this.f39975n != null) {
            if (this.f39974f) {
                this.h.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f39977s, AndroidUtilities.dp(10.0f));
            e3 e3Var = this.f39972c;
            a70 a70Var = this.f39970a;
            int i10 = 0;
            if (e3Var != null) {
                l4.v(a70Var, canvas, this, 0);
                this.f39972c.draw(canvas, this);
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (this.d != null) {
                canvas.translate(0.0f, this.f39978w);
                l4.v(a70Var, canvas, this, i9);
                this.d.draw(canvas, this);
            }
            canvas.restore();
            if (this.f39973e) {
                j4 j4Var = this.f39971b;
                if (j4Var != null && j4Var.C) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(17.0f);
                }
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (j4Var != null && j4Var.C) {
                    i10 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, l4.f40000n1);
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
        e3 e3Var = this.f39972c;
        j4 j4Var = this.f39971b;
        a70 a70Var = this.f39970a;
        if (e3Var != null && (j11 = l4.j(a70Var, j4Var, e3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null && (j10 = l4.j(a70Var, j4Var, e3Var2)) != null) {
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
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        TLRPC.Photo photo;
        ImageReceiver imageReceiver;
        int i11;
        char c10;
        float f10;
        boolean z11;
        int i12;
        String str;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i9);
        f4 f4Var = this.f39975n;
        if (f4Var.f38131b != f4Var.f38130a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39973e = z10;
        f4 f4Var2 = this.f39975n;
        TL_iv.pageRelatedArticle pagerelatedarticle = f4Var2.f38130a.articles.get(f4Var2.f38131b);
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        TLRPC.PhotoSize photoSize = null;
        j4 j4Var = this.f39971b;
        if (j10 != 0) {
            if (j4Var != null) {
                photo = i4.e(j4Var.A, j10);
            } else {
                photo = i4.d(j10, this.f39976r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f39974f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(photoSize, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.f39976r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f39974f = false;
        }
        int dp3 = AndroidUtilities.dp(60.0f);
        int dp4 = size - AndroidUtilities.dp(36.0f);
        if (this.f39974f) {
            float dp5 = AndroidUtilities.dp(44.0f);
            imageReceiver.setImageCoords((size - dp) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), dp5, dp5);
            dp4 = (int) (dp4 - (imageReceiver.getImageWidth() + AndroidUtilities.dp(6.0f)));
        }
        int i13 = dp4;
        int dp6 = AndroidUtilities.dp(18.0f);
        String str2 = pagerelatedarticle.title;
        if (str2 != null) {
            i11 = dp3;
            c10 = 1;
            f10 = 6.0f;
            this.f39972c = l4.p(this.f39970a, this, str2, null, i13, this.v, this.f39975n, Layout.Alignment.ALIGN_NORMAL, 3, this.f39971b);
        } else {
            i11 = dp3;
            c10 = 1;
            f10 = 6.0f;
        }
        e3 e3Var = this.f39972c;
        int i14 = this.f39977s;
        int i15 = this.v;
        if (e3Var != null) {
            int lineCount = e3Var.d.getLineCount();
            int i16 = 4 - lineCount;
            this.f39978w = org.telegram.messenger.l0.C(f10, this.f39972c.d.getHeight(), dp2);
            dp6 = this.f39972c.d.getHeight() + dp6;
            int i17 = 0;
            while (true) {
                if (i17 < lineCount) {
                    if (this.f39972c.d.getLineLeft(i17) != 0.0f) {
                        z11 = true;
                        break;
                    }
                    i17++;
                } else {
                    z11 = false;
                    break;
                }
            }
            e3 e3Var2 = this.f39972c;
            e3Var2.f37805s = i14;
            e3Var2.v = i15;
            i12 = i16;
        } else {
            this.f39978w = 0;
            z11 = false;
            i12 = 4;
        }
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            int i18 = R.string.ArticleDateByAuthor;
            String format = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[c10] = str3;
            str = LocaleController.formatString(i18, objArr);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
            str = LocaleController.formatString(R.string.ArticleByAuthor, pagerelatedarticle.author);
        } else if (pagerelatedarticle.published_date != 0) {
            str = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
            str = pagerelatedarticle.description;
        } else {
            str = pagerelatedarticle.url;
        }
        int i19 = this.f39978w + i15;
        String str4 = str;
        f4 f4Var3 = this.f39975n;
        if ((j4Var != null && j4Var.C) || z11) {
            alignment = org.telegram.ui.Components.rv0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        e3 p6 = l4.p(this.f39970a, this, str4, null, i13, i19, f4Var3, alignment, i12, this.f39971b);
        this.d = p6;
        if (p6 != null) {
            int height = p6.d.getHeight() + dp6;
            if (this.f39972c != null) {
                height = org.telegram.messenger.l0.C(f10, dp2, height);
            }
            dp6 = height;
            e3 e3Var3 = this.d;
            e3Var3.f37805s = i14;
            e3Var3.v = i15 + this.f39978w;
        }
        setMeasuredDimension(size, Math.max(i11, dp6) + (this.f39973e ? 1 : 0));
    }
}
