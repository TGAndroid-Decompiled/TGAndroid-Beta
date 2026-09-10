package org.telegram.ui;

import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class js0 implements org.telegram.ui.ActionBar.c2, Utilities.Callback2Return, org.telegram.ui.Components.dw0, OnFailureListener, q3.g, q9.e, pa.a, q9.d, androidx.car.app.utils.d {
    public final int f34158a;

    public js0(int i10) {
        this.f34158a = i10;
    }

    public static AudioRecordingConfiguration c(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Object P1(bi.u6 u6Var) {
        qa.d lambda$getComponents$0;
        switch (this.f34158a) {
            case 16:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(u6Var);
                return lambda$getComponents$0;
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6034a.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6036c.get();
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6035b.get();
            default:
                q9.n nVar = ExecutorsRegistrar.f6034a;
                return r9.j.f41389a;
        }
    }

    @Override
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f34158a) {
            case 0:
                d2Var.dismiss();
                return;
            case 2:
                d2Var.dismiss();
                return;
            case 3:
                d2Var.dismiss();
                return;
            case 5:
                d2Var.dismiss();
                return;
            case 6:
                d2Var.dismiss();
                return;
            case 7:
                d2Var.dismiss();
                return;
            case 8:
                d2Var.dismiss();
                return;
            case 17:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = pg.n2.f40174r0;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return xh.z7.X0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void j(pa.b bVar) {
    }

    @Override
    public void l() {
    }
}
