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
    public int f23963a;
    public final View f23964b;
    public final ArrayList f23965c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f23966f;
    public EGLContext f23967g;
    public final Object h;
    public int f23968i;
    public bi.kd f23969j;
    public Object f23970k;
    public Object f23971l;
    public oa f23972m;
    public final na f23973n;
    public Bitmap f23974o;
    public int f23975p;

    public ia(View view) {
        ArrayList arrayList = new ArrayList();
        this.f23965c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f23966f = new Object();
        this.h = new Object();
        this.f23973n = new na(0, new rg(this, 14));
        this.f23975p = 0;
        this.f23964b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new l.d(this, 3));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f23966f) {
            try {
                if (this.f23967g == null) {
                    this.f23967g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        oa oaVar = this.f23972m;
        if (oaVar == null) {
            return this.f23974o;
        }
        synchronized (oaVar.f25746n) {
            try {
                if (!oaVar.f25749q) {
                    bitmap = null;
                } else {
                    bitmap = oaVar.f25748p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f23974o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f23971l != null) {
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
            ((ma) obj).f25198b.invalidate();
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
        oa oaVar = this.f23972m;
        if (oaVar != null) {
            synchronized (oaVar.f25746n) {
                oaVar.f25749q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f23975p;
        this.f23975p = i10 + 1;
        sb2.append(i10);
        this.f23974o = this.f23973n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(bi.kd kdVar, Object obj) {
        this.f23969j = kdVar;
        this.f23970k = obj;
        this.f23968i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f23971l = renderNode2;
            return;
        }
        this.f23971l = null;
    }
}
