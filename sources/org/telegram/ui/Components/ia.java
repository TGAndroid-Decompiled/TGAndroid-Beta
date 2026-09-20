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
public final class ia {
    public int f24970a;
    public final View f24971b;
    public final ArrayList f24972c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f24973f;
    public EGLContext f24974g;
    public final Object h;
    public int f24975i;
    public ci.ac f24976j;
    public Object f24977k;
    public Object f24978l;
    public oa f24979m;
    public final na f24980n;
    public Bitmap f24981o;
    public int f24982p;

    public ia(View view) {
        ArrayList arrayList = new ArrayList();
        this.f24972c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f24973f = new Object();
        this.h = new Object();
        this.f24980n = new na(0, new og(this, 14));
        this.f24982p = 0;
        this.f24971b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ai.u2(this, 5));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f24973f) {
            try {
                if (this.f24974g == null) {
                    this.f24974g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        oa oaVar = this.f24979m;
        if (oaVar == null) {
            return this.f24981o;
        }
        synchronized (oaVar.f26877n) {
            try {
                if (!oaVar.f26880q) {
                    bitmap = null;
                } else {
                    bitmap = oaVar.f26879p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f24981o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f24978l != null) {
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
            ((ma) obj).f26357b.invalidate();
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
        oa oaVar = this.f24979m;
        if (oaVar != null) {
            synchronized (oaVar.f26877n) {
                oaVar.f26880q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f24982p;
        this.f24982p = i10 + 1;
        sb2.append(i10);
        this.f24981o = this.f24980n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.ac acVar, Object obj) {
        this.f24976j = acVar;
        this.f24977k = obj;
        this.f24975i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f24978l = renderNode2;
            return;
        }
        this.f24978l = null;
    }
}
