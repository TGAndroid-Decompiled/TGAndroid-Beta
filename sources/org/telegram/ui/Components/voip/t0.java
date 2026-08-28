package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import g7.e6;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jb0;
public final class t0 extends m2.a {
    public final u0 f33857c;

    public t0(u0 u0Var) {
        this.f33857c = u0Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f33857c.f33867f.length;
    }

    @Override
    public final Object e(m2.g gVar, int i9) {
        Bitmap bitmap;
        ImageView imageView;
        u0 u0Var = this.f33857c;
        boolean z10 = u0Var.f33873y;
        int i10 = 1;
        if (z10 && i9 == 0) {
            ?? frameLayout = new FrameLayout(u0Var.getContext());
            frameLayout.setBackground(new jb0(true, -14602694, -13935795, -14395293, -14203560));
            ImageView imageView2 = new ImageView(u0Var.getContext());
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            imageView2.setImageResource(R.drawable.screencast_big);
            frameLayout.addView(imageView2, e6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
            TextView textView = new TextView(u0Var.getContext());
            textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.l0.q(textView, -1, 1, 15.0f);
            frameLayout.addView(textView, e6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
            imageView = frameLayout;
        } else {
            ImageView imageView3 = new ImageView(u0Var.getContext());
            imageView3.setTag(Integer.valueOf(i9));
            try {
                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                StringBuilder sb2 = new StringBuilder("cthumb");
                if (i9 != 0 && (i9 != 1 || !z10)) {
                    i10 = 2;
                }
                sb2.append(i10);
                sb2.append(".jpg");
                bitmap = BitmapFactory.decodeFile(new File(filesDirFixed, sb2.toString()).getAbsolutePath());
            } catch (Throwable unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                imageView3.setImageBitmap(bitmap);
            } else {
                imageView3.setImageResource(R.drawable.icplaceholder);
            }
            imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView = imageView3;
        }
        if (imageView.getParent() != null) {
            ((ViewGroup) imageView.getParent()).removeView(imageView);
        }
        gVar.addView(imageView, 0);
        return imageView;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i9) {
    }
}
