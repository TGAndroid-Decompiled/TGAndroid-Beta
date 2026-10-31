package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
public final class o implements View.OnClickListener {
    public final int f28925a;
    public final r f28926b;

    public o(r rVar, int i10) {
        this.f28925a = i10;
        this.f28926b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28925a) {
            case 0:
                this.f28926b.dismiss();
                return;
            default:
                r rVar = this.f28926b;
                TL_aicompose.AiComposeTone aiComposeTone = rVar.P1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i10 = rVar.Z1 + 1;
                    rVar.Z1 = i10;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = rVar.a2;
                    if (i10 >= aicomposetoneexampleArr.length) {
                        rVar.Z1 = 0;
                    }
                    int i11 = rVar.Z1;
                    if (aicomposetoneexampleArr[i11] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i11;
                        ConnectionsManager.getInstance(rVar.f21583a).sendRequestTyped(gettoneexample, new a3.b(1), new p(rVar, i11, 0));
                    }
                    rVar.Y1.O(true);
                    return;
                }
                return;
        }
    }
}
