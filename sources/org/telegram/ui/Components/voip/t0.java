package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import h7.z5;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nb0;

public final class t0 extends m2.a {

    public final u0 f33907c;

    public t0(u0 u0Var) {
        this.f33907c = u0Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f33907c.f33917f.length;
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        Bitmap bitmapDecodeFile;
        View view;
        u0 u0Var = this.f33907c;
        boolean z10 = u0Var.f33923y;
        int i11 = 1;
        if (z10 && i10 == 0) {
            FrameLayout frameLayout = new FrameLayout(u0Var.getContext());
            frameLayout.setBackground(new nb0(true, -14602694, -13935795, -14395293, -14203560));
            ImageView imageView = new ImageView(u0Var.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.screencast_big);
            frameLayout.addView(imageView, z5.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
            TextView textView = new TextView(u0Var.getContext());
            textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.y1.s(textView, -1, 1, 15.0f);
            frameLayout.addView(textView, z5.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
            view = frameLayout;
        } else {
            ImageView imageView2 = new ImageView(u0Var.getContext());
            imageView2.setTag(Integer.valueOf(i10));
            try {
                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                StringBuilder sb2 = new StringBuilder("cthumb");
                if (i10 != 0 && (i10 != 1 || !z10)) {
                    i11 = 2;
                }
                sb2.append(i11);
                sb2.append(".jpg");
                bitmapDecodeFile = BitmapFactory.decodeFile(new File(filesDirFixed, sb2.toString()).getAbsolutePath());
            } catch (Throwable unused) {
                bitmapDecodeFile = null;
            }
            if (bitmapDecodeFile != null) {
                imageView2.setImageBitmap(bitmapDecodeFile);
            } else {
                imageView2.setImageResource(R.drawable.icplaceholder);
            }
            imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            view = imageView2;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        gVar.addView(view, 0);
        return view;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
