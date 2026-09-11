package org.telegram.ui.Components;

import android.content.Context;
public final class ye extends vg {
    public final int f32889l0;
    public final ChatActivityEnterView m0;

    public ye(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, true);
        this.f32889l0 = i11;
        this.m0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f32889l0) {
            case 0:
                return this.m0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f32889l0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.m0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.m0.f23753p3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f32889l0) {
            case 0:
                nf nfVar = this.m0.L0;
                if ((nfVar != null && !nfVar.f35148q0) || this.f31239r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f32889l0) {
            case 0:
                return this.m0.f23798x4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f32889l0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.f23661m5;
                this.m0.z1();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }
}
