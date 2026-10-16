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
public final class k2 extends View implements org.telegram.ui.Cells.n9 {
    public final z70 f37210a;
    public final i4 f37211b;
    public d3 f37212c;
    public d3 d;
    public boolean e;
    public boolean f37213f;
    public final ImageReceiver h;
    public e4 f37214n;
    public TLObject f37215r;
    public final int f37216s;
    public final int v;
    public int f37217w;

    public k2(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.f37216s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f37210a = z70Var;
        this.f37211b = i4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f37212c;
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
        d3 d3Var = this.f37212c;
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
        d3 d3Var = this.f37212c;
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
        if (this.f37214n != null) {
            if (this.f37213f) {
                this.h.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f37216s, AndroidUtilities.dp(10.0f));
            d3 d3Var = this.f37212c;
            z70 z70Var = this.f37210a;
            int i11 = 0;
            if (d3Var != null) {
                k4.v(z70Var, canvas, this, 0);
                this.f37212c.draw(canvas, this);
                i10 = 1;
            } else {
                i10 = 0;
            }
            float f7 = 0.0f;
            if (this.d != null) {
                canvas.translate(0.0f, this.f37217w);
                k4.v(z70Var, canvas, this, i10);
                this.d.draw(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                i4 i4Var = this.f37211b;
                if (i4Var == null || !i4Var.G) {
                    f7 = AndroidUtilities.dp(17.0f);
                }
                float f10 = f7;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (i4Var != null && i4Var.G) {
                    i11 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(f10, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, k4.f37249r1);
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
        d3 d3Var = this.f37212c;
        i4 i4Var = this.f37211b;
        z70 z70Var = this.f37210a;
        if (d3Var != null && (j11 = k4.j(z70Var, i4Var, d3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null && (j10 = k4.j(z70Var, i4Var, d3Var2)) != null) {
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
        e4 e4Var = this.f37214n;
        if (e4Var.f35199b != e4Var.f35198a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        e4 e4Var2 = this.f37214n;
        TL_iv.pageRelatedArticle pagerelatedarticle = e4Var2.f35198a.articles.get(e4Var2.f35199b);
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        int i16 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.PhotoSize photoSize = null;
        i4 i4Var = this.f37211b;
        if (i16 != 0) {
            if (i4Var != null) {
                photo = h4.e(i4Var.E, j10);
            } else {
                photo = h4.d(j10, this.f37215r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f37213f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(photoSize, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.f37215r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f37213f = false;
        }
        int dp3 = AndroidUtilities.dp(60.0f);
        int dp4 = size - AndroidUtilities.dp(36.0f);
        if (this.f37213f) {
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
            this.f37212c = k4.p(this.f37210a, this, str2, null, i17, this.v, this.f37214n, Layout.Alignment.ALIGN_NORMAL, 3, this.f37211b);
        } else {
            i12 = dp3;
            i13 = 1;
            f7 = 6.0f;
        }
        d3 d3Var = this.f37212c;
        int i18 = this.f37216s;
        int i19 = this.v;
        if (d3Var != null) {
            int lineCount = d3Var.d.getLineCount();
            i14 = 4 - lineCount;
            this.f37217w = org.telegram.messenger.g0.C(f7, this.f37212c.d.getHeight(), dp2);
            dp6 = this.f37212c.d.getHeight() + dp6;
            int i20 = 0;
            while (true) {
                if (i20 < lineCount) {
                    if (this.f37212c.d.getLineLeft(i20) != 0.0f) {
                        i15 = i13;
                        break;
                    }
                    i20++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            d3 d3Var2 = this.f37212c;
            d3Var2.f34861s = i18;
            d3Var2.v = i19;
        } else {
            this.f37217w = 0;
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
        int i24 = this.f37217w + i19;
        String str4 = str;
        e4 e4Var3 = this.f37214n;
        if ((i4Var != null && i4Var.G) || i15 != 0) {
            alignment = org.telegram.ui.Components.ix0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        d3 p5 = k4.p(this.f37210a, this, str4, null, i17, i24, e4Var3, alignment, i21, this.f37211b);
        this.d = p5;
        if (p5 != null) {
            int height = p5.d.getHeight() + dp6;
            if (this.f37212c != null) {
                height = org.telegram.messenger.g0.C(f7, dp2, height);
            }
            dp6 = height;
            d3 d3Var3 = this.d;
            d3Var3.f34861s = i18;
            d3Var3.v = i19 + this.f37217w;
        }
        setMeasuredDimension(size, Math.max(i12, dp6) + (this.e ? 1 : 0));
    }
}
