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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c30;
import org.telegram.messenger.dd;
import org.telegram.messenger.jc;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class c extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f34292a;
    public final org.telegram.ui.Components.g9 f34293b;
    public final TextView f34294c;
    public final TextView d;
    public boolean e;
    public boolean f34295f;
    public Drawable h;
    public ShapeDrawable f34296n;
    public int f34297r;

    public c(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f34292a = p6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f34293b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(8.0f));
        addView(g9Var, w7.b6.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, w7.b6.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f34294c = textView;
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        linearLayout.addView(textView, w7.b6.o(-1, 20));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, w7.b6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 18));
        updateColors();
    }

    public static String b(TL_wallet.nftItem nftitem, String str) {
        ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_wallet.nftAttribute nftattribute = arrayList.get(i10);
            i10++;
            TL_wallet.nftAttribute nftattribute2 = nftattribute;
            if (TextUtils.equals(nftattribute2.trait_type, str)) {
                return nftattribute2.value;
            }
        }
        return null;
    }

    public static jc c(TL_wallet.nftItem nftitem, boolean z10) {
        TLRPC.WebDocument webDocument;
        if ((!z10 || (webDocument = nftitem.image_small) == null) && (webDocument = nftitem.image) == null) {
            webDocument = nftitem.image_small;
        }
        if (webDocument == null) {
            return null;
        }
        return jc.p(c30.c(webDocument));
    }

    public void setGrid(boolean z10) {
        FrameLayout.LayoutParams d;
        float f7;
        int i10;
        if (this.f34295f == z10) {
            return;
        }
        this.f34295f = z10;
        if (z10) {
            d = w7.b6.d(-1, -1.0f, 119, 3.33f, 4.0f, 3.33f, 4.0f);
        } else {
            d = w7.b6.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f);
        }
        org.telegram.ui.Components.g9 g9Var = this.f34293b;
        g9Var.setLayoutParams(d);
        if (z10) {
            f7 = 11.0f;
        } else {
            f7 = 8.0f;
        }
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(f7));
        View view = (View) this.f34294c.getParent();
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        int w02;
        super.onDraw(canvas);
        if (this.h != null && this.f34296n != null && (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, this.f34292a)) != this.f34297r) {
            this.f34297r = w02;
            this.h.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.r1(0.1f, w02), this.f34296n);
            org.telegram.ui.Components.g9 g9Var = this.f34293b;
            if (g9Var != null) {
                g9Var.invalidate();
            }
        }
        if (this.e) {
            if (dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(71.0f);
            }
            float f7 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(71.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(f7, height, width - i10, getHeight(), org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f34295f) {
            f7 = 112.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), 1073741824));
    }

    @Override
    public final void updateColors() {
        setBackgroundColor(0);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f34292a;
        this.f34294c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, p6Var));
    }
}
