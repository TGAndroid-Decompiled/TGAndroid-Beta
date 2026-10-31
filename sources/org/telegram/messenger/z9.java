package org.telegram.messenger;

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class z9 implements OnCompleteListener {
    public final int f19491a;
    public final q0.a f19492b;

    public z9(q0.a aVar, int i10) {
        this.f19491a = i10;
        this.f19492b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f19491a) {
            case 0:
                if (task.getException() == null) {
                    this.f19492b.accept((Location) task.getResult());
                    return;
                }
                return;
            default:
                q0.a aVar = this.f19492b;
                try {
                    task.getResult(com.google.android.gms.common.api.f.class);
                    aVar.accept(0);
                    return;
                } catch (com.google.android.gms.common.api.f e) {
                    int statusCode = e.getStatusCode();
                    if (statusCode != 6) {
                        if (statusCode == 8502) {
                            aVar.accept(2);
                            return;
                        }
                        return;
                    }
                    aVar.accept(1);
                    return;
                }
        }
    }
}
