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
    public int f25059a;
    public final View f25060b;
    public final ArrayList f25061c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f25062f;
    public EGLContext f25063g;
    public final Object h;
    public int f25064i;
    public ci.ac f25065j;
    public Object f25066k;
    public Object f25067l;
    public oa f25068m;
    public final na f25069n;
    public Bitmap f25070o;
    public int f25071p;

    public ia(View view) {
        ArrayList arrayList = new ArrayList();
        this.f25061c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f25062f = new Object();
        this.h = new Object();
        this.f25069n = new na(0, new og(this, 14));
        this.f25071p = 0;
        this.f25060b = view;
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
        synchronized (this.f25062f) {
            try {
                if (this.f25063g == null) {
                    this.f25063g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        oa oaVar = this.f25068m;
        if (oaVar == null) {
            return this.f25070o;
        }
        synchronized (oaVar.f27042n) {
            try {
                if (!oaVar.f27045q) {
                    bitmap = null;
                } else {
                    bitmap = oaVar.f27044p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f25070o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f25067l != null) {
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
            ((ma) obj).f26388b.invalidate();
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
        oa oaVar = this.f25068m;
        if (oaVar != null) {
            synchronized (oaVar.f27042n) {
                oaVar.f27045q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f25071p;
        this.f25071p = i10 + 1;
        sb2.append(i10);
        this.f25070o = this.f25069n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.ac acVar, Object obj) {
        this.f25065j = acVar;
        this.f25066k = obj;
        this.f25064i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f25067l = renderNode2;
            return;
        }
        this.f25067l = null;
    }
}
