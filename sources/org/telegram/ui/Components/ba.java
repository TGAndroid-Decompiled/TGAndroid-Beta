package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.telegram.messenger.AndroidUtilities;
public final class ba {
    public int f25551a;
    public final View f25552b;
    public final ArrayList f25553c;
    public final ArrayList d;
    public final ArrayList f25554e;
    public final Object f25555f;
    public EGLContext f25556g;
    public final Object h;
    public int f25557i;
    public qh.m9 f25558j;
    public Object f25559k;
    public Object f25560l;
    public ha f25561m;
    public final ga f25562n;
    public Bitmap f25563o;
    public int f25564p;

    public ba(View view) {
        ArrayList arrayList = new ArrayList();
        this.f25553c = arrayList;
        this.d = new ArrayList();
        this.f25554e = new ArrayList();
        this.f25555f = new Object();
        this.h = new Object();
        this.f25562n = new ga(0, new fg(this, 14));
        this.f25564p = 0;
        this.f25552b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ff.b(this, 9));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f25555f) {
            try {
                if (this.f25556g == null) {
                    this.f25556g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ha haVar = this.f25561m;
        if (haVar == null) {
            return this.f25563o;
        }
        synchronized (haVar.f27455n) {
            try {
                if (!haVar.f27458q) {
                    bitmap = null;
                } else {
                    bitmap = haVar.f27457p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f25563o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f25560l != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((fa) obj).f26831b.invalidate();
        }
        ArrayList arrayList2 = this.f25554e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ha haVar = this.f25561m;
        if (haVar != null) {
            synchronized (haVar.f27455n) {
                haVar.f27458q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z4) {
        StringBuilder sb = new StringBuilder("");
        int i10 = this.f25564p;
        this.f25564p = i10 + 1;
        sb.append(i10);
        this.f25563o = this.f25562n.b(bitmap, sb.toString(), 0, 0, z4);
    }

    public final void g(qh.m9 m9Var, Object obj) {
        this.f25558j = m9Var;
        this.f25559k = obj;
        this.f25557i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f25560l = renderNode2;
            return;
        }
        this.f25560l = null;
    }
}
