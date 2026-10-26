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
public final class h2 extends View implements org.telegram.ui.Cells.r9 {
    public final h70 f39865a;
    public final h4 f39866b;
    public a3 f39867c;
    public a3 d;
    public boolean e;
    public boolean f39868f;
    public final ImageReceiver h;
    public c4 f39869n;
    public TLObject f39870r;
    public final int f39871s;
    public final int v;
    public int f39872w;

    public h2(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f39871s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.f39865a = h70Var;
        this.f39866b = h4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f39867c;
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
        a3 a3Var = this.f39867c;
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
        a3 a3Var = this.f39867c;
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
        if (this.f39869n != null) {
            if (this.f39868f) {
                this.h.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f39871s, AndroidUtilities.dp(10.0f));
            a3 a3Var = this.f39867c;
            h70 h70Var = this.f39865a;
            int i11 = 0;
            if (a3Var != null) {
                j4.v(h70Var, canvas, this, 0);
                this.f39867c.draw(canvas, this);
                i10 = 1;
            } else {
                i10 = 0;
            }
            float f7 = 0.0f;
            if (this.d != null) {
                canvas.translate(0.0f, this.f39872w);
                j4.v(h70Var, canvas, this, i10);
                this.d.draw(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                h4 h4Var = this.f39866b;
                if (h4Var == null || !h4Var.G) {
                    f7 = AndroidUtilities.dp(17.0f);
                }
                float f10 = f7;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (h4Var != null && h4Var.G) {
                    i11 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(f10, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, j4.f40420s1);
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
        a3 a3Var = this.f39867c;
        h4 h4Var = this.f39866b;
        h70 h70Var = this.f39865a;
        if (a3Var != null && (j11 = j4.j(h70Var, h4Var, a3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (j10 = j4.j(h70Var, h4Var, a3Var2)) != null) {
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
        c4 c4Var = this.f39869n;
        if (c4Var.f38247b != c4Var.f38246a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        c4 c4Var2 = this.f39869n;
        TL_iv.pageRelatedArticle pagerelatedarticle = c4Var2.f38246a.articles.get(c4Var2.f38247b);
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        int i16 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.PhotoSize photoSize = null;
        h4 h4Var = this.f39866b;
        if (i16 != 0) {
            if (h4Var != null) {
                photo = f4.e(h4Var.E, j10);
            } else {
                photo = f4.d(j10, this.f39870r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f39868f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(photoSize, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.f39870r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f39868f = false;
        }
        int dp3 = AndroidUtilities.dp(60.0f);
        int dp4 = size - AndroidUtilities.dp(36.0f);
        if (this.f39868f) {
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
            this.f39867c = j4.p(this.f39865a, this, str2, null, i17, this.v, this.f39869n, Layout.Alignment.ALIGN_NORMAL, 3, this.f39866b);
        } else {
            i12 = dp3;
            i13 = 1;
            f7 = 6.0f;
        }
        a3 a3Var = this.f39867c;
        int i18 = this.f39871s;
        int i19 = this.v;
        if (a3Var != null) {
            int lineCount = a3Var.d.getLineCount();
            i14 = 4 - lineCount;
            this.f39872w = org.telegram.messenger.t.D(f7, this.f39867c.d.getHeight(), dp2);
            dp6 = this.f39867c.d.getHeight() + dp6;
            int i20 = 0;
            while (true) {
                if (i20 < lineCount) {
                    if (this.f39867c.d.getLineLeft(i20) != 0.0f) {
                        i15 = i13;
                        break;
                    }
                    i20++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            a3 a3Var2 = this.f39867c;
            a3Var2.f37634s = i18;
            a3Var2.v = i19;
        } else {
            this.f39872w = 0;
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
        int i24 = this.f39872w + i19;
        String str4 = str;
        c4 c4Var3 = this.f39869n;
        if ((h4Var != null && h4Var.G) || i15 != 0) {
            alignment = org.telegram.ui.Components.px0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        a3 p10 = j4.p(this.f39865a, this, str4, null, i17, i24, c4Var3, alignment, i21, this.f39866b);
        this.d = p10;
        if (p10 != null) {
            int height = p10.d.getHeight() + dp6;
            if (this.f39867c != null) {
                height = org.telegram.messenger.t.D(f7, dp2, height);
            }
            dp6 = height;
            a3 a3Var3 = this.d;
            a3Var3.f37634s = i18;
            a3Var3.v = i19 + this.f39872w;
        }
        setMeasuredDimension(size, Math.max(i12, dp6) + (this.e ? 1 : 0));
    }
}
