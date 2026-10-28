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
public final class lu0 extends org.telegram.ui.Components.mm0 {
    public final Context f41266c;
    public final PhotoViewer d;

    public lu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f41266c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        qu0 qu0Var = photoViewer.d;
        if (qu0Var != null && qu0Var.c() != null) {
            return photoViewer.d.c().size();
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) e1Var.f47773a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        d6Var.f24014f = dp;
        org.telegram.ui.Components.aq aqVar = d6Var.f24013c;
        org.telegram.ui.Components.y9 y9Var = d6Var.f24011a;
        bi.j5 j5Var = d6Var.e;
        d6Var.h = i11;
        ((FrameLayout.LayoutParams) d6Var.f24012b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) y9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) j5Var.getLayoutParams()).rightMargin = i11;
        y9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            d6Var.setTag(photoEntry);
            j5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f41266c;
            if (str != null) {
                y9Var.g(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                y9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    j5Var.setVisibility(0);
                    d6Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    y9Var.g("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    y9Var.g("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                y9Var.setImageResource(R.drawable.nophotos);
            }
            aqVar.f26634a.f(-1, true, false);
            aqVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            d6Var.setTag(searchImage);
            d6Var.setImage(searchImage);
            j5Var.setVisibility(4);
            aqVar.f26634a.f(-1, true, false);
            aqVar.setVisibility(0);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f41266c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        frameLayout.f24011a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(y9Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f24012b = frameLayout2;
        frameLayout.addView(frameLayout2, org.telegram.ui.Components.kb1.i(42, 42, 53));
        bi.j5 j5Var = new bi.j5(context);
        j5Var.d = new Path();
        j5Var.e = new float[8];
        j5Var.f4871b = new RectF();
        j5Var.f4872c = new Paint(1);
        frameLayout.e = j5Var;
        j5Var.setWillNotDraw(false);
        j5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(j5Var, org.telegram.ui.Components.kb1.i(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        j5Var.addView(imageView, org.telegram.ui.Components.kb1.i(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        j5Var.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 24, null);
        frameLayout.f24013c = aqVar;
        aqVar.setDrawBackgroundAsArc(11);
        aqVar.b(org.telegram.ui.ActionBar.y6.W9, org.telegram.ui.ActionBar.y6.X9, org.telegram.ui.ActionBar.y6.V9);
        frameLayout.addView(aqVar, org.telegram.ui.Components.kb1.h(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        aqVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new z50(this, 22));
        return new s4.e1(frameLayout);
    }
}
