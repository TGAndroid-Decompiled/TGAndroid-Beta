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
public final class cm extends f2.v0 implements pg.a {
    public Drawable f26004a;
    public final Path f26005b = new Path();
    public final Drawable f26006c;
    public final ql d;
    public final ChatAttachAlertPhotoLayout f26007e;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, ql qlVar) {
        this.f26007e = chatAttachAlertPhotoLayout;
        this.d = qlVar;
        this.f26006c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        d(canvas, recyclerView, null, null);
    }

    public final void d(Canvas canvas, RecyclerView recyclerView, g.x xVar, RectF rectF) {
        int top;
        bm bmVar;
        boolean z4;
        boolean z10;
        boolean z11;
        bm bmVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26007e;
        if (!chatAttachAlertPhotoLayout.f24743a0 && !chatAttachAlertPhotoLayout.V && chatAttachAlertPhotoLayout.D.f26942e && !chatAttachAlertPhotoLayout.L0 && !chatAttachAlertPhotoLayout.M0) {
            f2.m1 K = recyclerView.K(0);
            if (K != null) {
                top = K.f5875a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.J0);
                if (K != null) {
                    top = (K.f5875a.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.H0;
                } else if (xVar != null) {
                    xVar.f6800b = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.f5875a.getLeft();
            int i10 = chatAttachAlertPhotoLayout.H0;
            int i11 = left + i10;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2) + top;
            if (xVar != null) {
                xVar.a(left);
                xVar.a(top);
                xVar.a(i11);
                xVar.a(dp);
            }
            if (rectF == null || rectF.intersects(left, top, i11, dp)) {
                Drawable drawable = this.f26006c;
                if (xVar != null) {
                    if (this.f26004a != null && ((bmVar2 = chatAttachAlertPhotoLayout.M) == null || !bmVar2.isInited() || chatAttachAlertPhotoLayout.K)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xVar.b(z4);
                    if (chatAttachAlertPhotoLayout.M != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xVar.b(z10);
                    if (drawable != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    xVar.b(z11);
                }
                if (canvas != null) {
                    float dp2 = AndroidUtilities.dp(16.0f);
                    Path path = this.f26005b;
                    path.rewind();
                    float f10 = left;
                    float f11 = top;
                    path.addRoundRect(f10, f11, i11 + dp2, dp + dp2, dp2, dp2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.f26004a != null && ((bmVar = chatAttachAlertPhotoLayout.M) == null || !bmVar.isInited() || chatAttachAlertPhotoLayout.K)) {
                        this.f26004a.setBounds(left, top, i11, dp);
                        this.f26004a.draw(canvas);
                    }
                    bm bmVar3 = chatAttachAlertPhotoLayout.M;
                    if (bmVar3 != null) {
                        bmVar3.f25660b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i11, dp);
                        canvas.translate(f10, f11);
                        chatAttachAlertPhotoLayout.M.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.M.f25660b = false;
                    }
                    if (drawable != null) {
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int B = org.telegram.messenger.y3.B(7.0f, i11, dp3);
                        int dp4 = AndroidUtilities.dp(7.0f) + top;
                        drawable.setBounds(B, dp4, B + dp3, dp3 + dp4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.B.invalidate();
                }
            }
        } else if (xVar != null) {
            xVar.f6800b = true;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26007e;
        if (bitmap != null) {
            this.f26004a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.f26004a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
        }
        ql qlVar = chatAttachAlertPhotoLayout.B;
        if (qlVar != null) {
            qlVar.invalidate();
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        d(null, this.d, xVar, rectF);
    }
}
