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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gb1;
public final class c extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f36407a;
    public final org.telegram.ui.Components.y9 f36408b;
    public final TextView f36409c;
    public final TextView d;
    public boolean e;
    public boolean f36410f;
    public Drawable h;
    public ShapeDrawable f36411n;
    public int f36412r;

    public c(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f36407a = u6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f36408b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        addView(y9Var, gb1.h(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, gb1.h(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f36409c = textView;
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        linearLayout.addView(textView, gb1.r(-1, 20));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, gb1.o(0.0f, 2.0f, 0.0f, 0.0f, -1, 18));
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

    public static ImageLocation c(TL_wallet.nftItem nftitem, boolean z10) {
        TLRPC.WebDocument webDocument;
        if ((!z10 || (webDocument = nftitem.image_small) == null) && (webDocument = nftitem.image) == null) {
            webDocument = nftitem.image_small;
        }
        if (webDocument == null) {
            return null;
        }
        return ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument));
    }

    public void setGrid(boolean z10) {
        FrameLayout.LayoutParams h;
        float f7;
        int i10;
        if (this.f36410f == z10) {
            return;
        }
        this.f36410f = z10;
        if (z10) {
            h = gb1.h(-1, -1.0f, 119, 3.33f, 4.0f, 3.33f, 4.0f);
        } else {
            h = gb1.h(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f);
        }
        org.telegram.ui.Components.y9 y9Var = this.f36408b;
        y9Var.setLayoutParams(h);
        if (z10) {
            f7 = 11.0f;
        } else {
            f7 = 8.0f;
        }
        y9Var.setRoundRadius(AndroidUtilities.dp(f7));
        View view = (View) this.f36409c.getParent();
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        int w02;
        super.onDraw(canvas);
        if (this.h != null && this.f36411n != null && (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23748y6, this.f36407a)) != this.f36412r) {
            this.f36412r = w02;
            this.h.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.o1(0.1f, w02), this.f36411n);
            org.telegram.ui.Components.y9 y9Var = this.f36408b;
            if (y9Var != null) {
                y9Var.invalidate();
            }
        }
        if (this.e) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(71.0f);
            }
            float f7 = dp;
            float height = getHeight() - 1;
            int width = getWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(71.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(f7, height, width - i10, getHeight(), org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f36410f) {
            f7 = 112.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }

    @Override
    public final void updateColors() {
        setBackgroundColor(0);
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f36407a;
        this.f36409c.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23767z6, u6Var));
    }
}
