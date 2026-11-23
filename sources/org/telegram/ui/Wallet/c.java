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
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class c extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f44012a;
    public final org.telegram.ui.Components.q9 f44013b;
    public final TextView f44014c;
    public final TextView d;
    public boolean f44015e;
    public boolean f44016f;
    public Drawable h;
    public ShapeDrawable f44017n;
    public int f44018r;

    public c(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f44012a = h6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f44013b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        addView(q9Var, c8.ma.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, c8.ma.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44014c = textView;
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        linearLayout.addView(textView, c8.ma.o(-1, 20));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, c8.ma.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 18));
        updateColors();
    }

    public static String b(TL_wallet.nftItem nftitem, String str) {
        ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_wallet.nftAttribute nftattribute = arrayList.get(i7);
            i7++;
            TL_wallet.nftAttribute nftattribute2 = nftattribute;
            if (TextUtils.equals(nftattribute2.trait_type, str)) {
                return nftattribute2.value;
            }
        }
        return null;
    }

    public static gc c(TL_wallet.nftItem nftitem, boolean z10) {
        TLRPC.WebDocument webDocument;
        if ((!z10 || (webDocument = nftitem.image_small) == null) && (webDocument = nftitem.image) == null) {
            webDocument = nftitem.image_small;
        }
        if (webDocument == null) {
            return null;
        }
        return gc.p(i20.c(webDocument));
    }

    public void setGrid(boolean z10) {
        FrameLayout.LayoutParams d;
        float f10;
        int i7;
        if (this.f44016f == z10) {
            return;
        }
        this.f44016f = z10;
        if (z10) {
            d = c8.ma.d(-1, -1.0f, 119, 3.33f, 4.0f, 3.33f, 4.0f);
        } else {
            d = c8.ma.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f);
        }
        org.telegram.ui.Components.q9 q9Var = this.f44013b;
        q9Var.setLayoutParams(d);
        if (z10) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        View view = (View) this.f44014c.getParent();
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        view.setVisibility(i7);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        int w02;
        super.onDraw(canvas);
        if (this.h != null && this.f44017n != null && (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29773y6, this.f44012a)) != this.f44018r) {
            this.f44018r = w02;
            this.h.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.r1(0.1f, w02), this.f44017n);
            org.telegram.ui.Components.q9 q9Var = this.f44013b;
            if (q9Var != null) {
                q9Var.invalidate();
            }
        }
        if (this.f44015e) {
            if (hd.f24444a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (hd.f24444a0) {
                i7 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f10, height, width - i7, getHeight(), org.telegram.ui.ActionBar.m6.f29504k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f44016f) {
            f10 = 112.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }

    @Override
    public final void updateColors() {
        setBackgroundColor(0);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f44012a;
        this.f44014c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29792z6, h6Var));
    }
}
