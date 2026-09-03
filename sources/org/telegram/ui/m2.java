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
public final class m2 extends View implements org.telegram.ui.Cells.k9 {
    public final p70 f35958a;
    public final l4 f35959b;
    public f3 f35960c;
    public f3 d;
    public boolean e;
    public boolean f35961f;
    public final ImageReceiver h;
    public h4 f35962n;
    public TLObject f35963r;
    public final int f35964s;
    public final int v;
    public int f35965w;

    public m2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f35964s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f35958a = p70Var;
        this.f35959b = l4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f35960c;
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
        f3 f3Var = this.f35960c;
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
        f3 f3Var = this.f35960c;
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
        if (this.f35962n != null) {
            if (this.f35961f) {
                this.h.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f35964s, AndroidUtilities.dp(10.0f));
            f3 f3Var = this.f35960c;
            p70 p70Var = this.f35958a;
            int i11 = 0;
            if (f3Var != null) {
                n4.v(p70Var, canvas, this, 0);
                this.f35960c.draw(canvas, this);
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.d != null) {
                canvas.translate(0.0f, this.f35965w);
                n4.v(p70Var, canvas, this, i10);
                this.d.draw(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                l4 l4Var = this.f35959b;
                if (l4Var != null && l4Var.D) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(17.0f);
                }
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (l4Var != null && l4Var.D) {
                    i11 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, n4.f36348o1);
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
        f3 f3Var = this.f35960c;
        l4 l4Var = this.f35959b;
        p70 p70Var = this.f35958a;
        if (f3Var != null && (j11 = n4.j(p70Var, l4Var, f3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null && (j10 = n4.j(p70Var, l4Var, f3Var2)) != null) {
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
        h4 h4Var = this.f35962n;
        if (h4Var.f34567b != h4Var.f34566a.articles.size() - 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.e = z4;
        h4 h4Var2 = this.f35962n;
        TL_iv.pageRelatedArticle pagerelatedarticle = h4Var2.f34566a.articles.get(h4Var2.f34567b);
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        TLRPC.PhotoSize photoSize = null;
        l4 l4Var = this.f35959b;
        if (j10 != 0) {
            if (l4Var != null) {
                photo = k4.e(l4Var.B, j10);
            } else {
                photo = k4.d(j10, this.f35963r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f35961f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(photoSize, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.f35963r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f35961f = false;
        }
        int dp3 = AndroidUtilities.dp(60.0f);
        int dp4 = size - AndroidUtilities.dp(36.0f);
        if (this.f35961f) {
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
            this.f35960c = n4.p(this.f35958a, this, str2, null, i14, this.v, this.f35962n, Layout.Alignment.ALIGN_NORMAL, 3, this.f35959b);
        } else {
            i12 = dp3;
            c3 = 1;
            f10 = 6.0f;
        }
        f3 f3Var = this.f35960c;
        int i15 = this.f35964s;
        int i16 = this.v;
        if (f3Var != null) {
            int lineCount = f3Var.d.getLineCount();
            int i17 = 4 - lineCount;
            this.f35965w = org.telegram.messenger.y3.C(f10, this.f35960c.d.getHeight(), dp2);
            dp6 = this.f35960c.d.getHeight() + dp6;
            int i18 = 0;
            while (true) {
                if (i18 < lineCount) {
                    if (this.f35960c.d.getLineLeft(i18) != 0.0f) {
                        z10 = true;
                        break;
                    }
                    i18++;
                } else {
                    z10 = false;
                    break;
                }
            }
            f3 f3Var2 = this.f35960c;
            f3Var2.f33933s = i15;
            f3Var2.v = i16;
            i13 = i17;
        } else {
            this.f35965w = 0;
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
        int i20 = this.f35965w + i16;
        String str4 = str;
        h4 h4Var3 = this.f35962n;
        if ((l4Var != null && l4Var.D) || z10) {
            alignment = org.telegram.ui.Components.kw0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        f3 p10 = n4.p(this.f35958a, this, str4, null, i14, i20, h4Var3, alignment, i13, this.f35959b);
        this.d = p10;
        if (p10 != null) {
            int height = p10.d.getHeight() + dp6;
            if (this.f35960c != null) {
                height = org.telegram.messenger.y3.C(f10, dp2, height);
            }
            dp6 = height;
            f3 f3Var3 = this.d;
            f3Var3.f33933s = i15;
            f3Var3.v = i16 + this.f35965w;
        }
        setMeasuredDimension(size, Math.max(i12, dp6) + (this.e ? 1 : 0));
    }
}
