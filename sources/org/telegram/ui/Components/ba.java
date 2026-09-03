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
    public int f23593a;
    public final View f23594b;
    public final ArrayList f23595c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f23596f;
    public EGLContext f23597g;
    public final Object h;
    public int f23598i;
    public ph.p9 f23599j;
    public Object f23600k;
    public Object f23601l;
    public ha f23602m;
    public final ga f23603n;
    public Bitmap f23604o;
    public int f23605p;

    public ba(View view) {
        ArrayList arrayList = new ArrayList();
        this.f23595c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f23596f = new Object();
        this.h = new Object();
        this.f23603n = new ga(0, new fg(this, 14));
        this.f23605p = 0;
        this.f23594b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ef.b(this, 9));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f23596f) {
            try {
                if (this.f23597g == null) {
                    this.f23597g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ha haVar = this.f23602m;
        if (haVar == null) {
            return this.f23604o;
        }
        synchronized (haVar.f25362n) {
            try {
                if (!haVar.f25365q) {
                    bitmap = null;
                } else {
                    bitmap = haVar.f25364p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f23604o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f23601l != null) {
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
            ((fa) obj).f24840b.invalidate();
        }
        ArrayList arrayList2 = this.e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ha haVar = this.f23602m;
        if (haVar != null) {
            synchronized (haVar.f25362n) {
                haVar.f25365q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z4) {
        StringBuilder sb = new StringBuilder("");
        int i10 = this.f23605p;
        this.f23605p = i10 + 1;
        sb.append(i10);
        this.f23604o = this.f23603n.b(bitmap, sb.toString(), 0, 0, z4);
    }

    public final void g(ph.p9 p9Var, Object obj) {
        this.f23599j = p9Var;
        this.f23600k = obj;
        this.f23598i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f23601l = renderNode2;
            return;
        }
        this.f23601l = null;
    }
}
