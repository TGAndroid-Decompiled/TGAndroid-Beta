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
public final class j2 extends View implements org.telegram.ui.Cells.r9 {
    public final t70 f33854a;
    public final h4 f33855b;
    public c3 f33856c;
    public c3 d;
    public boolean e;
    public boolean f33857f;
    public final ImageReceiver h;
    public d4 f33858n;
    public TLObject f33859r;
    public final int f33860s;
    public final int v;
    public int f33861w;

    public j2(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.f33860s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f33854a = t70Var;
        this.f33855b = h4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f33856c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f33856c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f33856c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float dp;
        if (this.f33858n != null) {
            if (this.f33857f) {
                this.h.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f33860s, AndroidUtilities.dp(10.0f));
            c3 c3Var = this.f33856c;
            t70 t70Var = this.f33854a;
            int i11 = 0;
            if (c3Var != null) {
                j4.v(t70Var, canvas, this, 0);
                this.f33856c.draw(canvas, this);
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.d != null) {
                canvas.translate(0.0f, this.f33861w);
                j4.v(t70Var, canvas, this, i10);
                this.d.draw(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                h4 h4Var = this.f33855b;
                if (h4Var != null && h4Var.G) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(17.0f);
                }
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (h4Var != null && h4Var.G) {
                    i11 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, j4.f33891r1);
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
        c3 c3Var = this.f33856c;
        h4 h4Var = this.f33855b;
        t70 t70Var = this.f33854a;
        if (c3Var != null && (j10 = j4.j(t70Var, h4Var, c3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null && (j3 = j4.j(t70Var, h4Var, c3Var2)) != null) {
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
        d4 d4Var = this.f33858n;
        if (d4Var.f31823b != d4Var.f31822a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        d4 d4Var2 = this.f33858n;
        TL_iv.pageRelatedArticle pagerelatedarticle = d4Var2.f31822a.articles.get(d4Var2.f31823b);
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j3 = pagerelatedarticle.photo_id;
        TLRPC.PhotoSize photoSize = null;
        h4 h4Var = this.f33855b;
        if (j3 != 0) {
            if (h4Var != null) {
                photo = g4.e(h4Var.E, j3);
            } else {
                photo = g4.d(j3, this.f33859r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f33857f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(photoSize, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.f33859r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f33857f = false;
        }
        int dp3 = AndroidUtilities.dp(60.0f);
        int dp4 = size - AndroidUtilities.dp(36.0f);
        if (this.f33857f) {
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
            this.f33856c = j4.p(this.f33854a, this, str2, null, i14, this.v, this.f33858n, Layout.Alignment.ALIGN_NORMAL, 3, this.f33855b);
        } else {
            i12 = dp3;
            c10 = 1;
            f7 = 6.0f;
        }
        c3 c3Var = this.f33856c;
        int i15 = this.f33860s;
        int i16 = this.v;
        if (c3Var != null) {
            int lineCount = c3Var.d.getLineCount();
            int i17 = 4 - lineCount;
            this.f33861w = org.telegram.messenger.a2.C(f7, this.f33856c.d.getHeight(), dp2);
            dp6 = this.f33856c.d.getHeight() + dp6;
            int i18 = 0;
            while (true) {
                if (i18 < lineCount) {
                    if (this.f33856c.d.getLineLeft(i18) != 0.0f) {
                        z11 = true;
                        break;
                    }
                    i18++;
                } else {
                    z11 = false;
                    break;
                }
            }
            c3 c3Var2 = this.f33856c;
            c3Var2.f31515s = i15;
            c3Var2.v = i16;
            i13 = i17;
        } else {
            this.f33861w = 0;
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
        int i20 = this.f33861w + i16;
        String str4 = str;
        d4 d4Var3 = this.f33858n;
        if ((h4Var != null && h4Var.G) || z11) {
            alignment = org.telegram.ui.Components.uw0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        c3 p5 = j4.p(this.f33854a, this, str4, null, i14, i20, d4Var3, alignment, i13, this.f33855b);
        this.d = p5;
        if (p5 != null) {
            int height = p5.d.getHeight() + dp6;
            if (this.f33856c != null) {
                height = org.telegram.messenger.a2.C(f7, dp2, height);
            }
            dp6 = height;
            c3 c3Var3 = this.d;
            c3Var3.f31515s = i15;
            c3Var3.v = i16 + this.f33861w;
        }
        setMeasuredDimension(size, Math.max(i12, dp6) + (this.e ? 1 : 0));
    }
}
