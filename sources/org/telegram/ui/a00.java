package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class a00 extends FrameLayout {
    public final b00 f37607a;

    public a00(b00 b00Var, Context context) {
        super(context);
        String string;
        this.f37607a = b00Var;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(22.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        int i11 = 0;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        imageView.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(imageView, c02, N, null, null);
        addView(imageView, org.telegram.ui.Components.gb1.h(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        xh.n nVar = new xh.n(context);
        nVar.setTypeface(AndroidUtilities.bold());
        nVar.setTextSize(1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.y6.f23462j5;
        org.telegram.ui.ActionBar.f7.V(nVar, i12, null);
        nVar.setGravity(1);
        nVar.setText(b00Var.R(nVar));
        MessagesController.DialogFilter dialogFilter = b00Var.Y;
        if (dialogFilter != null && dialogFilter.title_noanimate) {
            i11 = 26;
        }
        nVar.f51911s = i11;
        addView(nVar, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (b00Var.Z.isEmpty()) {
            string = LocaleController.getString(R.string.FolderLinkShareSubtitleEmpty);
        } else {
            string = LocaleController.getString(R.string.FolderLinkShareSubtitle);
        }
        textView.setText(string);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i12, null);
        addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.C6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new a(this, 23));
        addView(imageView2, org.telegram.ui.Components.gb1.h(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(171.0f), 1073741824));
    }
}
