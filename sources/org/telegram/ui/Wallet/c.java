package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.z9;
public final class c extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f32713a;
    public final z9 f32714b;
    public final TextView f32715c;
    public final TextView d;
    public boolean e;

    public c(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f32713a = c6Var;
        setWillNotDraw(false);
        z9 z9Var = new z9(context);
        this.f32714b = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        addView(z9Var, w7.z5.a(46.0f, 15.0f, 0.0f, 0.0f, 0.0f, 46, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, w7.z5.a(-1.0f, 71.0f, 0.0f, 20.0f, 0.0f, -1, 119));
        TextView textView = new TextView(context);
        this.f32715c = textView;
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        linearLayout.addView(textView, w7.z5.n(-1, 20));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, w7.z5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 18));
        d();
    }

    public static String a(TL_wallet.nftItem nftitem, String str) {
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

    public static ImageLocation b(TL_wallet.nftItem nftitem, boolean z10) {
        TLRPC.WebDocument webDocument;
        if ((!z10 || (webDocument = nftitem.image_small) == null) && (webDocument = nftitem.image) == null) {
            webDocument = nftitem.image_small;
        }
        if (webDocument == null) {
            return null;
        }
        return ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument));
    }

    @Override
    public final void d() {
        setBackgroundColor(0);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f32713a;
        this.f32715c.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
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
            canvas.drawRect(f7, height, width - i10, getHeight(), org.telegram.ui.ActionBar.g6.f19722k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
