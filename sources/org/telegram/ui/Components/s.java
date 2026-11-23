package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
public final class s implements View.OnClickListener {
    public final int f39442a;
    public final v f39443b;

    public s(v vVar, int i7) {
        this.f39442a = i7;
        this.f39443b = vVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39442a) {
            case 0:
                this.f39443b.dismiss();
                return;
            default:
                v vVar = this.f39443b;
                TL_aicompose.AiComposeTone aiComposeTone = vVar.T1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i7 = vVar.d2 + 1;
                    vVar.d2 = i7;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = vVar.f40519e2;
                    if (i7 >= aicomposetoneexampleArr.length) {
                        vVar.d2 = 0;
                    }
                    int i10 = vVar.d2;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(vVar.f30223a).sendRequestTyped(gettoneexample, new d3.b(1), new t(vVar, i10, 0));
                    }
                    vVar.f40518c2.O(true);
                    return;
                }
                return;
        }
    }
}
