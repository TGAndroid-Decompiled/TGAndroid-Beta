package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
public final class t implements View.OnClickListener {
    public final int f39694a;
    public final w f39695b;

    public t(w wVar, int i7) {
        this.f39694a = i7;
        this.f39695b = wVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39694a) {
            case 0:
                this.f39695b.dismiss();
                return;
            default:
                w wVar = this.f39695b;
                TL_aicompose.AiComposeTone aiComposeTone = wVar.T1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i7 = wVar.d2 + 1;
                    wVar.d2 = i7;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = wVar.f41580e2;
                    if (i7 >= aicomposetoneexampleArr.length) {
                        wVar.d2 = 0;
                    }
                    int i10 = wVar.d2;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(wVar.f30139a).sendRequestTyped(gettoneexample, new d3.b(1), new u(wVar, i10, 0));
                    }
                    wVar.f41579c2.O(true);
                    return;
                }
                return;
        }
    }
}
