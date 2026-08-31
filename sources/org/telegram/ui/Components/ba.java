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
    public int f25540a;
    public final View f25541b;
    public final ArrayList f25542c;
    public final ArrayList d;
    public final ArrayList f25543e;
    public final Object f25544f;
    public EGLContext f25545g;
    public final Object h;
    public int f25546i;
    public qh.n9 f25547j;
    public Object f25548k;
    public Object f25549l;
    public ha f25550m;
    public final ga f25551n;
    public Bitmap f25552o;
    public int f25553p;

    public ba(View view) {
        ArrayList arrayList = new ArrayList();
        this.f25542c = arrayList;
        this.d = new ArrayList();
        this.f25543e = new ArrayList();
        this.f25544f = new Object();
        this.h = new Object();
        this.f25551n = new ga(0, new fg(this, 14));
        this.f25553p = 0;
        this.f25541b = view;
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
        synchronized (this.f25544f) {
            try {
                if (this.f25545g == null) {
                    this.f25545g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ha haVar = this.f25550m;
        if (haVar == null) {
            return this.f25552o;
        }
        synchronized (haVar.f27438n) {
            try {
                if (!haVar.f27441q) {
                    bitmap = null;
                } else {
                    bitmap = haVar.f27440p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f25552o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f25549l != null) {
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
            ((fa) obj).f26832b.invalidate();
        }
        ArrayList arrayList2 = this.f25543e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ha haVar = this.f25550m;
        if (haVar != null) {
            synchronized (haVar.f27438n) {
                haVar.f27441q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z4) {
        StringBuilder sb = new StringBuilder("");
        int i10 = this.f25553p;
        this.f25553p = i10 + 1;
        sb.append(i10);
        this.f25552o = this.f25551n.b(bitmap, sb.toString(), 0, 0, z4);
    }

    public final void g(qh.n9 n9Var, Object obj) {
        this.f25547j = n9Var;
        this.f25548k = obj;
        this.f25546i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f25549l = renderNode2;
            return;
        }
        this.f25549l = null;
    }
}
