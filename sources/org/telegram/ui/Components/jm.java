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
public final class jm extends s4.n0 implements ah.a {
    public Drawable f24438a;
    public final Path f24439b = new Path();
    public final Drawable f24440c;
    public final yl d;
    public final ChatAttachAlertPhotoLayout e;

    public jm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, yl ylVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = ylVar;
        this.f24440c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        d(canvas, recyclerView, null, null);
    }

    public final void d(Canvas canvas, RecyclerView recyclerView, g.z zVar, RectF rectF) {
        int top;
        im imVar;
        boolean z10;
        boolean z11;
        boolean z12;
        im imVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (!chatAttachAlertPhotoLayout.f20994d0 && !chatAttachAlertPhotoLayout.f20990b0 && chatAttachAlertPhotoLayout.G.e && !chatAttachAlertPhotoLayout.O0 && !chatAttachAlertPhotoLayout.P0) {
            s4.c1 K = recyclerView.K(0);
            if (K != null) {
                top = K.f41610a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.M0);
                if (K != null) {
                    top = (K.f41610a.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.K0;
                } else if (zVar != null) {
                    zVar.f8456b = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.f41610a.getLeft();
            int i10 = chatAttachAlertPhotoLayout.K0;
            int i11 = left + i10;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2) + top;
            if (zVar != null) {
                zVar.a(left);
                zVar.a(top);
                zVar.a(i11);
                zVar.a(dp);
            }
            if (rectF == null || rectF.intersects(left, top, i11, dp)) {
                Drawable drawable = this.f24440c;
                if (zVar != null) {
                    if (this.f24438a != null && ((imVar2 = chatAttachAlertPhotoLayout.P) == null || !imVar2.isInited() || chatAttachAlertPhotoLayout.N)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zVar.b(z10);
                    if (chatAttachAlertPhotoLayout.P != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zVar.b(z11);
                    if (drawable != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zVar.b(z12);
                }
                if (canvas != null) {
                    float dp2 = AndroidUtilities.dp(16.0f);
                    Path path = this.f24439b;
                    path.rewind();
                    float f7 = left;
                    float f10 = top;
                    path.addRoundRect(f7, f10, i11 + dp2, dp + dp2, dp2, dp2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.f24438a != null && ((imVar = chatAttachAlertPhotoLayout.P) == null || !imVar.isInited() || chatAttachAlertPhotoLayout.N)) {
                        this.f24438a.setBounds(left, top, i11, dp);
                        this.f24438a.draw(canvas);
                    }
                    im imVar3 = chatAttachAlertPhotoLayout.P;
                    if (imVar3 != null) {
                        imVar3.f24044b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i11, dp);
                        canvas.translate(f7, f10);
                        chatAttachAlertPhotoLayout.P.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.P.f24044b = false;
                    }
                    if (drawable != null) {
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int B = org.telegram.messenger.a2.B(7.0f, i11, dp3);
                        int dp4 = AndroidUtilities.dp(7.0f) + top;
                        drawable.setBounds(B, dp4, B + dp3, dp3 + dp4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.E.invalidate();
                }
            }
        } else if (zVar != null) {
            zVar.f8456b = true;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (bitmap != null) {
            this.f24438a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.f24438a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
        }
        yl ylVar = chatAttachAlertPhotoLayout.E;
        if (ylVar != null) {
            ylVar.invalidate();
        }
    }

    @Override
    public final void g(g.z zVar, RectF rectF) {
        d(null, this.d, zVar, rectF);
    }
}
