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
public final class h2 extends View implements org.telegram.ui.Cells.q9 {
    public final u70 f34068a;
    public final f4 f34069b;
    public a3 f34070c;
    public a3 d;
    public boolean e;
    public boolean f34071f;
    public final ImageReceiver h;
    public b4 f34072n;
    public TLObject f34073r;
    public final int f34074s;
    public final int v;
    public int f34075w;

    public h2(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.f34074s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f34068a = u70Var;
        this.f34069b = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f34070c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f34070c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f34070c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float dp;
        if (this.f34072n != null) {
            if (this.f34071f) {
                this.h.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f34074s, AndroidUtilities.dp(10.0f));
            a3 a3Var = this.f34070c;
            u70 u70Var = this.f34068a;
            int i11 = 0;
            if (a3Var != null) {
                h4.v(u70Var, canvas, this, 0);
                this.f34070c.draw(canvas, this);
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.d != null) {
                canvas.translate(0.0f, this.f34075w);
                h4.v(u70Var, canvas, this, i10);
                this.d.draw(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                f4 f4Var = this.f34069b;
                if (f4Var != null && f4Var.G) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(17.0f);
                }
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (f4Var != null && f4Var.G) {
                    i11 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, h4.f34101r1);
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
        a3 a3Var = this.f34070c;
        f4 f4Var = this.f34069b;
        u70 u70Var = this.f34068a;
        if (a3Var != null && (j10 = h4.j(u70Var, f4Var, a3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (j3 = h4.j(u70Var, f4Var, a3Var2)) != null) {
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
        b4 b4Var = this.f34072n;
        if (b4Var.f32268b != b4Var.f32267a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        b4 b4Var2 = this.f34072n;
        TL_iv.pageRelatedArticle pagerelatedarticle = b4Var2.f32267a.articles.get(b4Var2.f32268b);
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j3 = pagerelatedarticle.photo_id;
        TLRPC.PhotoSize photoSize = null;
        f4 f4Var = this.f34069b;
        if (j3 != 0) {
            if (f4Var != null) {
                photo = e4.e(f4Var.E, j3);
            } else {
                photo = e4.d(j3, this.f34073r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f34071f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(photoSize, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.f34073r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f34071f = false;
        }
        int dp3 = AndroidUtilities.dp(60.0f);
        int dp4 = size - AndroidUtilities.dp(36.0f);
        if (this.f34071f) {
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
            this.f34070c = h4.p(this.f34068a, this, str2, null, i14, this.v, this.f34072n, Layout.Alignment.ALIGN_NORMAL, 3, this.f34069b);
        } else {
            i12 = dp3;
            c10 = 1;
            f7 = 6.0f;
        }
        a3 a3Var = this.f34070c;
        int i15 = this.f34074s;
        int i16 = this.v;
        if (a3Var != null) {
            int lineCount = a3Var.d.getLineCount();
            int i17 = 4 - lineCount;
            this.f34075w = org.telegram.messenger.l0.C(f7, this.f34070c.d.getHeight(), dp2);
            dp6 = this.f34070c.d.getHeight() + dp6;
            int i18 = 0;
            while (true) {
                if (i18 < lineCount) {
                    if (this.f34070c.d.getLineLeft(i18) != 0.0f) {
                        z11 = true;
                        break;
                    }
                    i18++;
                } else {
                    z11 = false;
                    break;
                }
            }
            a3 a3Var2 = this.f34070c;
            a3Var2.f31996s = i15;
            a3Var2.v = i16;
            i13 = i17;
        } else {
            this.f34075w = 0;
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
        int i20 = this.f34075w + i16;
        String str4 = str;
        b4 b4Var3 = this.f34072n;
        if ((f4Var != null && f4Var.G) || z11) {
            alignment = org.telegram.ui.Components.ww0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        a3 p5 = h4.p(this.f34068a, this, str4, null, i14, i20, b4Var3, alignment, i13, this.f34069b);
        this.d = p5;
        if (p5 != null) {
            int height = p5.d.getHeight() + dp6;
            if (this.f34070c != null) {
                height = org.telegram.messenger.l0.C(f7, dp2, height);
            }
            dp6 = height;
            a3 a3Var3 = this.d;
            a3Var3.f31996s = i15;
            a3Var3.v = i16 + this.f34075w;
        }
        setMeasuredDimension(size, Math.max(i12, dp6) + (this.e ? 1 : 0));
    }
}
