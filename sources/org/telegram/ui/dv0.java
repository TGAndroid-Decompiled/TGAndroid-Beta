package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class dv0 extends org.telegram.ui.Components.lm0 {
    public final Context f35394c;
    public final PhotoViewer d;

    public dv0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f35394c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        iv0 iv0Var = photoViewer.d;
        if (iv0Var != null && iv0Var.c() != null) {
            return photoViewer.d.c().size();
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) b1Var.f44838a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        z5Var.f22808f = dp;
        org.telegram.ui.Components.aq aqVar = z5Var.f22807c;
        org.telegram.ui.Components.z9 z9Var = z5Var.f22805a;
        x5 x5Var = z5Var.e;
        z5Var.h = i11;
        ((FrameLayout.LayoutParams) z5Var.f22806b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) z9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) x5Var.getLayoutParams()).rightMargin = i11;
        z9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            z5Var.setTag(photoEntry);
            x5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f35394c;
            if (str != null) {
                z9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                z9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    x5Var.setVisibility(0);
                    z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    z9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    z9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                z9Var.setImageResource(R.drawable.nophotos);
            }
            aqVar.f23604a.f(-1, true, false);
            aqVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            z5Var.setTag(searchImage);
            z5Var.setImage(searchImage);
            x5Var.setVisibility(4);
            aqVar.f23604a.f(-1, true, false);
            aqVar.setVisibility(0);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f35394c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        frameLayout.f22805a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(z9Var, w7.a6.d(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f22806b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.a6.e(42, 42, 53));
        x5 x5Var = new x5(context);
        x5Var.f41749c = new Path();
        x5Var.d = new float[8];
        x5Var.f41748b = new RectF();
        x5Var.e = new Paint(1);
        frameLayout.e = x5Var;
        x5Var.setWillNotDraw(false);
        x5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(x5Var, w7.a6.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        x5Var.addView(imageView, w7.a6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        x5Var.addView(textView, w7.a6.a(-2.0f, 18.0f, -0.7f, 0.0f, 0.0f, -2, 19));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 24, null);
        frameLayout.f22807c = aqVar;
        aqVar.setDrawBackgroundAsArc(11);
        aqVar.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
        frameLayout.addView(aqVar, w7.a6.a(26.0f, 55.0f, 4.0f, 0.0f, 0.0f, 26, 51));
        aqVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new t60(this, 19));
        return new s4.b1(frameLayout);
    }
}
