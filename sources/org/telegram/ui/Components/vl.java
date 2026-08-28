package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class vl extends f2.y0 implements jg.a {
    public Drawable f33403a;
    public final Path f33404b = new Path();
    public final Drawable f33405c;
    public final kl d;
    public final ChatAttachAlertPhotoLayout f33406e;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, kl klVar) {
        this.f33406e = chatAttachAlertPhotoLayout;
        this.d = klVar;
        this.f33405c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        d(canvas, recyclerView, null, null);
    }

    public final void d(Canvas canvas, RecyclerView recyclerView, g.x xVar, RectF rectF) {
        int top;
        ul ulVar;
        boolean z10;
        boolean z11;
        boolean z12;
        ul ulVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33406e;
        if (!chatAttachAlertPhotoLayout.W && !chatAttachAlertPhotoLayout.U && chatAttachAlertPhotoLayout.C.f34999e && !chatAttachAlertPhotoLayout.K0 && !chatAttachAlertPhotoLayout.L0) {
            f2.q1 K = recyclerView.K(0);
            if (K != null) {
                top = K.f5501a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.I0);
                if (K != null) {
                    top = (K.f5501a.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.G0;
                } else if (xVar != null) {
                    xVar.f7046b = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.f5501a.getLeft();
            int i9 = chatAttachAlertPhotoLayout.G0;
            int i10 = left + i9;
            int dp = AndroidUtilities.dp(2.0f) + (i9 * 2) + top;
            if (xVar != null) {
                xVar.a(left);
                xVar.a(top);
                xVar.a(i10);
                xVar.a(dp);
            }
            if (rectF == null || rectF.intersects(left, top, i10, dp)) {
                Drawable drawable = this.f33405c;
                if (xVar != null) {
                    if (this.f33403a != null && ((ulVar2 = chatAttachAlertPhotoLayout.L) == null || !ulVar2.isInited() || chatAttachAlertPhotoLayout.J)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xVar.b(z10);
                    if (chatAttachAlertPhotoLayout.L != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    xVar.b(z11);
                    if (drawable != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    xVar.b(z12);
                }
                if (canvas != null) {
                    float dp2 = AndroidUtilities.dp(16.0f);
                    Path path = this.f33404b;
                    path.rewind();
                    float f10 = left;
                    float f11 = top;
                    path.addRoundRect(f10, f11, i10 + dp2, dp + dp2, dp2, dp2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.f33403a != null && ((ulVar = chatAttachAlertPhotoLayout.L) == null || !ulVar.isInited() || chatAttachAlertPhotoLayout.J)) {
                        this.f33403a.setBounds(left, top, i10, dp);
                        this.f33403a.draw(canvas);
                    }
                    ul ulVar3 = chatAttachAlertPhotoLayout.L;
                    if (ulVar3 != null) {
                        ulVar3.f33088b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i10, dp);
                        canvas.translate(f10, f11);
                        chatAttachAlertPhotoLayout.L.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.L.f33088b = false;
                    }
                    if (drawable != null) {
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int B = org.telegram.messenger.l0.B(7.0f, i10, dp3);
                        int dp4 = AndroidUtilities.dp(7.0f) + top;
                        drawable.setBounds(B, dp4, B + dp3, dp3 + dp4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.A.invalidate();
                }
            }
        } else if (xVar != null) {
            xVar.f7046b = true;
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        d(canvas, this.d, null, rectF);
    }

    public final void f() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33406e;
        if (bitmap != null) {
            this.f33403a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.f33403a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
        }
        kl klVar = chatAttachAlertPhotoLayout.A;
        if (klVar != null) {
            klVar.invalidate();
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        d(null, this.d, xVar, rectF);
    }
}
