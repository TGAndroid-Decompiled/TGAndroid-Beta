package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import i7.f6;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.ui.Components.yb0;
public final class u0 extends m2.a {
    public final v0 f34050c;

    public u0(v0 v0Var) {
        this.f34050c = v0Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f34050c.f34071f.length;
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        Bitmap bitmap;
        ImageView imageView;
        v0 v0Var = this.f34050c;
        boolean z10 = v0Var.f34077y;
        int i11 = 1;
        if (z10 && i10 == 0) {
            ?? frameLayout = new FrameLayout(v0Var.getContext());
            frameLayout.setBackground(new yb0(true, -14602694, -13935795, -14395293, -14203560));
            ImageView imageView2 = new ImageView(v0Var.getContext());
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            imageView2.setImageResource(R.drawable.screencast_big);
            frameLayout.addView(imageView2, f6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
            TextView textView = new TextView(v0Var.getContext());
            textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            x3.t(textView, -1, 1, 15.0f);
            frameLayout.addView(textView, f6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
            imageView = frameLayout;
        } else {
            ImageView imageView3 = new ImageView(v0Var.getContext());
            imageView3.setTag(Integer.valueOf(i10));
            try {
                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                StringBuilder sb2 = new StringBuilder("cthumb");
                if (i10 != 0 && (i10 != 1 || !z10)) {
                    i11 = 2;
                }
                sb2.append(i11);
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
    public final void h(int i10) {
    }
}
