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

public final class rl extends f2.w0 implements kg.a {

    public Drawable f32199a;

    public final Path f32200b = new Path();

    public final Drawable f32201c;
    public final gl d;

    public final ChatAttachAlertPhotoLayout f32202e;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, gl glVar) {
        this.f32202e = chatAttachAlertPhotoLayout;
        this.d = glVar;
        this.f32201c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        d(canvas, recyclerView, null, null);
    }

    public final void d(Canvas canvas, RecyclerView recyclerView, g.y yVar, RectF rectF) {
        int top;
        ql qlVar;
        ql qlVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32202e;
        if (chatAttachAlertPhotoLayout.W || chatAttachAlertPhotoLayout.U || !chatAttachAlertPhotoLayout.C.f33115e || chatAttachAlertPhotoLayout.K0 || chatAttachAlertPhotoLayout.L0) {
            if (yVar != null) {
                yVar.f6327b = true;
                return;
            }
            return;
        }
        f2.o1 o1VarK = recyclerView.K(0);
        if (o1VarK != null) {
            top = o1VarK.f5789a.getTop();
        } else {
            o1VarK = recyclerView.K(chatAttachAlertPhotoLayout.I0);
            if (o1VarK == null) {
                if (yVar != null) {
                    yVar.f6327b = true;
                    return;
                }
                return;
            }
            top = (o1VarK.f5789a.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.G0;
        }
        int left = o1VarK.f5789a.getLeft();
        int i10 = chatAttachAlertPhotoLayout.G0;
        int i11 = left + i10;
        int iDp = AndroidUtilities.dp(2.0f) + (i10 * 2) + top;
        if (yVar != null) {
            yVar.a(left);
            yVar.a(top);
            yVar.a(i11);
            yVar.a(iDp);
        }
        if (rectF == null || rectF.intersects(left, top, i11, iDp)) {
            Drawable drawable = this.f32201c;
            if (yVar != null) {
                yVar.b(this.f32199a != null && ((qlVar2 = chatAttachAlertPhotoLayout.L) == null || !qlVar2.isInited() || chatAttachAlertPhotoLayout.J));
                yVar.b(chatAttachAlertPhotoLayout.L != null);
                yVar.b(drawable != null);
            }
            if (canvas == null) {
                return;
            }
            float fDp = AndroidUtilities.dp(16.0f);
            Path path = this.f32200b;
            path.rewind();
            float f10 = left;
            float f11 = top;
            path.addRoundRect(f10, f11, i11 + fDp, iDp + fDp, fDp, fDp, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (this.f32199a != null && ((qlVar = chatAttachAlertPhotoLayout.L) == null || !qlVar.isInited() || chatAttachAlertPhotoLayout.J)) {
                this.f32199a.setBounds(left, top, i11, iDp);
                this.f32199a.draw(canvas);
            }
            ql qlVar3 = chatAttachAlertPhotoLayout.L;
            if (qlVar3 != null) {
                qlVar3.f31922b = true;
                canvas.save();
                canvas.clipRect(left, top, i11, iDp);
                canvas.translate(f10, f11);
                chatAttachAlertPhotoLayout.L.draw(canvas);
                canvas.restore();
                chatAttachAlertPhotoLayout.L.f31922b = false;
            }
            if (drawable != null) {
                int iDp2 = AndroidUtilities.dp(24.0f);
                int iB = org.telegram.messenger.y1.B(7.0f, i11, iDp2);
                int iDp3 = AndroidUtilities.dp(7.0f) + top;
                drawable.setBounds(iB, iDp3, iB + iDp2, iDp2 + iDp3);
                drawable.draw(canvas);
            }
            canvas.restore();
            chatAttachAlertPhotoLayout.A.invalidate();
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        d(canvas, this.d, null, rectF);
    }

    public final void f() {
        Bitmap bitmapDecodeFile;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmapDecodeFile = null;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32202e;
        if (bitmapDecodeFile != null) {
            this.f32199a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmapDecodeFile);
        } else {
            this.f32199a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
        }
        gl glVar = chatAttachAlertPhotoLayout.A;
        if (glVar != null) {
            glVar.invalidate();
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        d(null, this.d, yVar, rectF);
    }
}
