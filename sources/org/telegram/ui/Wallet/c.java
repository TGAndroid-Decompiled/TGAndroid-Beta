package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.e20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class c extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f42353a;
    public final org.telegram.ui.Components.k9 f42354b;
    public final TextView f42355c;
    public final TextView d;
    public boolean f42356e;
    public boolean f42357f;
    public Drawable h;
    public ShapeDrawable f42358n;
    public int f42359r;

    public c(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f42353a = e6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f42354b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        addView(k9Var, mf.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, mf.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42355c = textView;
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        linearLayout.addView(textView, mf.o(-1, 20));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, mf.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 18));
        updateColors();
    }

    public static String b(TL_wallet.nftItem nftitem, String str) {
        ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TL_wallet.nftAttribute nftattribute = arrayList.get(i3);
            i3++;
            TL_wallet.nftAttribute nftattribute2 = nftattribute;
            if (TextUtils.equals(nftattribute2.trait_type, str)) {
                return nftattribute2.value;
            }
        }
        return null;
    }

    public static ac c(TL_wallet.nftItem nftitem, boolean z10) {
        TLRPC.WebDocument webDocument;
        if ((!z10 || (webDocument = nftitem.image_small) == null) && (webDocument = nftitem.image) == null) {
            webDocument = nftitem.image_small;
        }
        if (webDocument == null) {
            return null;
        }
        return ac.p(e20.c(webDocument));
    }

    public void setGrid(boolean z10) {
        FrameLayout.LayoutParams d;
        float f10;
        int i3;
        if (this.f42357f == z10) {
            return;
        }
        this.f42357f = z10;
        if (z10) {
            d = mf.d(-1, -1.0f, 119, 3.33f, 4.0f, 3.33f, 4.0f);
        } else {
            d = mf.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f);
        }
        org.telegram.ui.Components.k9 k9Var = this.f42354b;
        k9Var.setLayoutParams(d);
        if (z10) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        View view = (View) this.f42355c.getParent();
        if (z10) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        int w02;
        super.onDraw(canvas);
        if (this.h != null && this.f42358n != null && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, this.f42353a)) != this.f42359r) {
            this.f42359r = w02;
            this.h.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.r1(0.1f, w02), this.f42358n);
            org.telegram.ui.Components.k9 k9Var = this.f42354b;
            if (k9Var != null) {
                k9Var.invalidate();
            }
        }
        if (this.f42356e) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i3 = 0;
            }
            canvas.drawRect(f10, height, width - i3, getHeight(), org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (this.f42357f) {
            f10 = 112.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }

    @Override
    public final void updateColors() {
        setBackgroundColor(0);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f42353a;
        this.f42355c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var));
    }
}
