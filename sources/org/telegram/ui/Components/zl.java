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
public final class zl extends f2.v0 implements mg.a {
    public Drawable f35363a;
    public final Path f35364b = new Path();
    public final Drawable f35365c;
    public final ol d;
    public final ChatAttachAlertPhotoLayout f35366e;

    public zl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, ol olVar) {
        this.f35366e = chatAttachAlertPhotoLayout;
        this.d = olVar;
        this.f35365c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        d(canvas, recyclerView, null, null);
    }

    public final void d(Canvas canvas, RecyclerView recyclerView, g.x xVar, RectF rectF) {
        int top;
        yl ylVar;
        boolean z10;
        boolean z11;
        boolean z12;
        yl ylVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35366e;
        if (!chatAttachAlertPhotoLayout.W && !chatAttachAlertPhotoLayout.U && chatAttachAlertPhotoLayout.C.f27504e && !chatAttachAlertPhotoLayout.K0 && !chatAttachAlertPhotoLayout.L0) {
            f2.n1 K = recyclerView.K(0);
            if (K != null) {
                top = K.f6432a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.I0);
                if (K != null) {
                    top = (K.f6432a.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.G0;
                } else if (xVar != null) {
                    xVar.f6956b = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.f6432a.getLeft();
            int i10 = chatAttachAlertPhotoLayout.G0;
            int i11 = left + i10;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2) + top;
            if (xVar != null) {
                xVar.a(left);
                xVar.a(top);
                xVar.a(i11);
                xVar.a(dp);
            }
            if (rectF == null || rectF.intersects(left, top, i11, dp)) {
                Drawable drawable = this.f35365c;
                if (xVar != null) {
                    if (this.f35363a != null && ((ylVar2 = chatAttachAlertPhotoLayout.L) == null || !ylVar2.isInited() || chatAttachAlertPhotoLayout.J)) {
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
                    Path path = this.f35364b;
                    path.rewind();
                    float f9 = left;
                    float f10 = top;
                    path.addRoundRect(f9, f10, i11 + dp2, dp + dp2, dp2, dp2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.f35363a != null && ((ylVar = chatAttachAlertPhotoLayout.L) == null || !ylVar.isInited() || chatAttachAlertPhotoLayout.J)) {
                        this.f35363a.setBounds(left, top, i11, dp);
                        this.f35363a.draw(canvas);
                    }
                    yl ylVar3 = chatAttachAlertPhotoLayout.L;
                    if (ylVar3 != null) {
                        ylVar3.f35088b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i11, dp);
                        canvas.translate(f9, f10);
                        chatAttachAlertPhotoLayout.L.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.L.f35088b = false;
                    }
                    if (drawable != null) {
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int B = org.telegram.messenger.x3.B(7.0f, i11, dp3);
                        int dp4 = AndroidUtilities.dp(7.0f) + top;
                        drawable.setBounds(B, dp4, B + dp3, dp3 + dp4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.A.invalidate();
                }
            }
        } else if (xVar != null) {
            xVar.f6956b = true;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35366e;
        if (bitmap != null) {
            this.f35363a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.f35363a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
        }
        ol olVar = chatAttachAlertPhotoLayout.A;
        if (olVar != null) {
            olVar.invalidate();
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        d(null, this.d, xVar, rectF);
    }
}
