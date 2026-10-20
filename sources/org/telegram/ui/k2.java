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
public final class k2 extends View implements org.telegram.ui.Cells.m9 {
    public final b70 f38394a;
    public final j4 f38395b;
    public d3 f38396c;
    public d3 d;
    public boolean e;
    public boolean f38397f;
    public final ImageReceiver h;
    public e4 f38398n;
    public TLObject f38399r;
    public final int f38400s;
    public final int v;
    public int f38401w;

    public k2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f38400s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f38394a = b70Var;
        this.f38395b = j4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f38396c;
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
        d3 d3Var = this.f38396c;
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
        d3 d3Var = this.f38396c;
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
        if (this.f38398n != null) {
            if (this.f38397f) {
                this.h.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f38400s, AndroidUtilities.dp(10.0f));
            d3 d3Var = this.f38396c;
            b70 b70Var = this.f38394a;
            int i11 = 0;
            if (d3Var != null) {
                l4.v(b70Var, canvas, this, 0);
                this.f38396c.draw(canvas, this);
                i10 = 1;
            } else {
                i10 = 0;
            }
            float f7 = 0.0f;
            if (this.d != null) {
                canvas.translate(0.0f, this.f38401w);
                l4.v(b70Var, canvas, this, i10);
                this.d.draw(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                j4 j4Var = this.f38395b;
                if (j4Var == null || !j4Var.G) {
                    f7 = AndroidUtilities.dp(17.0f);
                }
                float f10 = f7;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (j4Var != null && j4Var.G) {
                    i11 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(f10, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, l4.f38749r1);
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
        d3 d3Var = this.f38396c;
        j4 j4Var = this.f38395b;
        b70 b70Var = this.f38394a;
        if (d3Var != null && (j11 = l4.j(b70Var, j4Var, d3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null && (j10 = l4.j(b70Var, j4Var, d3Var2)) != null) {
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
        int i13;
        float f7;
        int i14;
        int i15;
        String str;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        e4 e4Var = this.f38398n;
        if (e4Var.f36540b != e4Var.f36539a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        e4 e4Var2 = this.f38398n;
        TL_iv.pageRelatedArticle pagerelatedarticle = e4Var2.f36539a.articles.get(e4Var2.f36540b);
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        int i16 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.PhotoSize photoSize = null;
        j4 j4Var = this.f38395b;
        if (i16 != 0) {
            if (j4Var != null) {
                photo = h4.e(j4Var.E, j10);
            } else {
                photo = h4.d(j10, this.f38399r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f38397f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(photoSize, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.f38399r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f38397f = false;
        }
        int dp3 = AndroidUtilities.dp(60.0f);
        int dp4 = size - AndroidUtilities.dp(36.0f);
        if (this.f38397f) {
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
            this.f38396c = l4.p(this.f38394a, this, str2, null, i17, this.v, this.f38398n, Layout.Alignment.ALIGN_NORMAL, 3, this.f38395b);
        } else {
            i12 = dp3;
            i13 = 1;
            f7 = 6.0f;
        }
        d3 d3Var = this.f38396c;
        int i18 = this.f38400s;
        int i19 = this.v;
        if (d3Var != null) {
            int lineCount = d3Var.d.getLineCount();
            i14 = 4 - lineCount;
            this.f38401w = org.telegram.messenger.g0.C(f7, this.f38396c.d.getHeight(), dp2);
            dp6 = this.f38396c.d.getHeight() + dp6;
            int i20 = 0;
            while (true) {
                if (i20 < lineCount) {
                    if (this.f38396c.d.getLineLeft(i20) != 0.0f) {
                        i15 = i13;
                        break;
                    }
                    i20++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            d3 d3Var2 = this.f38396c;
            d3Var2.f36241s = i18;
            d3Var2.v = i19;
        } else {
            this.f38401w = 0;
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
        int i24 = this.f38401w + i19;
        String str4 = str;
        e4 e4Var3 = this.f38398n;
        if ((j4Var != null && j4Var.G) || i15 != 0) {
            alignment = org.telegram.ui.Components.fx0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        d3 p5 = l4.p(this.f38394a, this, str4, null, i17, i24, e4Var3, alignment, i21, this.f38395b);
        this.d = p5;
        if (p5 != null) {
            int height = p5.d.getHeight() + dp6;
            if (this.f38396c != null) {
                height = org.telegram.messenger.g0.C(f7, dp2, height);
            }
            dp6 = height;
            d3 d3Var3 = this.d;
            d3Var3.f36241s = i18;
            d3Var3.v = i19 + this.f38401w;
        }
        setMeasuredDimension(size, Math.max(i12, dp6) + (this.e ? 1 : 0));
    }
}
