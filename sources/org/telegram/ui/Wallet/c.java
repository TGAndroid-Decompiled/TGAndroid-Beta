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
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.m20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class c extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f42191a;
    public final org.telegram.ui.Components.k9 f42192b;
    public final TextView f42193c;
    public final TextView d;
    public boolean f42194e;
    public boolean f42195f;
    public Drawable h;
    public ShapeDrawable f42196n;
    public int f42197r;

    public c(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f42191a = h6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f42192b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        addView(k9Var, c8.ha.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, c8.ha.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42193c = textView;
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        linearLayout.addView(textView, c8.ha.o(-1, 20));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, c8.ha.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 18));
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

    public static hc c(TL_wallet.nftItem nftitem, boolean z9) {
        TLRPC.WebDocument webDocument;
        if ((!z9 || (webDocument = nftitem.image_small) == null) && (webDocument = nftitem.image) == null) {
            webDocument = nftitem.image_small;
        }
        if (webDocument == null) {
            return null;
        }
        return hc.p(m20.c(webDocument));
    }

    public void setGrid(boolean z9) {
        FrameLayout.LayoutParams d;
        float f10;
        int i7;
        if (this.f42195f == z9) {
            return;
        }
        this.f42195f = z9;
        if (z9) {
            d = c8.ha.d(-1, -1.0f, 119, 3.33f, 4.0f, 3.33f, 4.0f);
        } else {
            d = c8.ha.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f);
        }
        org.telegram.ui.Components.k9 k9Var = this.f42192b;
        k9Var.setLayoutParams(d);
        if (z9) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        View view = (View) this.f42193c.getParent();
        if (z9) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        view.setVisibility(i7);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        int w02;
        super.onDraw(canvas);
        if (this.h != null && this.f42196n != null && (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28282y6, this.f42191a)) != this.f42197r) {
            this.f42197r = w02;
            this.h.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.r1(0.1f, w02), this.f42196n);
            org.telegram.ui.Components.k9 k9Var = this.f42192b;
            if (k9Var != null) {
                k9Var.invalidate();
            }
        }
        if (this.f42194e) {
            if (id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f10, height, width - i7, getHeight(), org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f42195f) {
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
        org.telegram.ui.ActionBar.h6 h6Var = this.f42191a;
        this.f42193c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28300z6, h6Var));
    }
}
