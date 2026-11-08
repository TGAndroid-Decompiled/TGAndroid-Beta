package org.telegram.messenger;

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class y9 implements OnCompleteListener {
    public final int f26622a;
    public final q0.a f26623b;

    public y9(q0.a aVar, int i7) {
        this.f26622a = i7;
        this.f26623b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f26622a) {
            case 0:
                if (task.getException() == null) {
                    this.f26623b.accept((Location) task.getResult());
                    return;
                }
                return;
            default:
                q0.a aVar = this.f26623b;
                try {
                    task.getResult(com.google.android.gms.common.api.f.class);
                    aVar.accept(0);
                    return;
                } catch (com.google.android.gms.common.api.f e10) {
                    int statusCode = e10.getStatusCode();
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
