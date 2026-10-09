package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cd0;
import w7.x5;
public final class w0 extends z4.a {
    public final x0 f32339c;

    public w0(x0 x0Var) {
        this.f32339c = x0Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f32339c.f32362f.length;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        Bitmap bitmap;
        ImageView imageView;
        x0 x0Var = this.f32339c;
        boolean z10 = x0Var.f32368y;
        int i11 = 1;
        if (z10 && i10 == 0) {
            ?? frameLayout = new FrameLayout(x0Var.getContext());
            frameLayout.setBackground(new cd0(true, -14602694, -13935795, -14395293, -14203560));
            ImageView imageView2 = new ImageView(x0Var.getContext());
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            imageView2.setImageResource(R.drawable.screencast_big);
            frameLayout.addView(imageView2, x5.a(82.0f, 0.0f, 0.0f, 0.0f, 60.0f, 82, 17));
            TextView textView = new TextView(x0Var.getContext());
            textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.q.m(15.0f, -1, 1, textView);
            frameLayout.addView(textView, x5.a(-2.0f, 21.0f, 28.0f, 21.0f, 0.0f, -1, 17));
            imageView = frameLayout;
        } else {
            ImageView imageView3 = new ImageView(x0Var.getContext());
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
