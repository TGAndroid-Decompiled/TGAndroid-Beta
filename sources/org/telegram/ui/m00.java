package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class m00 extends FrameLayout {
    public final n00 f35438a;

    public m00(n00 n00Var, Context context) {
        super(context);
        int i10;
        String string;
        this.f35438a = n00Var;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false)));
        addView(imageView, w7.y5.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        vh.n nVar = new vh.n(context);
        nVar.setTypeface(AndroidUtilities.bold());
        nVar.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.h6.f19165j5;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        nVar.setGravity(1);
        nVar.setText(n00Var.R(nVar));
        MessagesController.DialogFilter dialogFilter = n00Var.X;
        if (dialogFilter != null && dialogFilter.title_noanimate) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        nVar.h = i10;
        addView(nVar, w7.y5.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (n00Var.Y.isEmpty()) {
            string = LocaleController.getString(R.string.FolderLinkShareSubtitleEmpty);
        } else {
            string = LocaleController.getString(R.string.FolderLinkShareSubtitle);
        }
        textView.setText(string);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        addView(textView, w7.y5.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.C6, false), PorterDuff.Mode.MULTIPLY));
        imageView2.setOnClickListener(new a(this, 23));
        addView(imageView2, w7.y5.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(171.0f), 1073741824));
    }
}
