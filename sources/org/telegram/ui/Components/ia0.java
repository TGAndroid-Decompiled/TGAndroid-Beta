package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class ia0 extends v7.x6 {
    public int f27155a;
    public final TL_iv.PageBlock f27156b;
    public TL_iv.textConcat f27157c = new TL_iv.textConcat();

    public ia0(TL_iv.PageBlock pageBlock) {
        this.f27156b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        if (textconcat.texts.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (textconcat.texts.size() == 1) {
            return textconcat.texts.get(0);
        }
        return textconcat;
    }

    @Override
    public final void a(df.b bVar) {
        int i10 = this.f27155a;
        if (i10 >= 64) {
            return;
        }
        this.f27155a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.f27155a--;
        }
    }

    @Override
    public final void b(df.c cVar) {
        int i10 = this.f27155a;
        if (i10 >= 64) {
            return;
        }
        this.f27155a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.f27155a--;
        }
    }

    @Override
    public final void c(df.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = la0.j(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(df.e eVar) {
        if (eVar instanceof we.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof bd.d) {
            w(la0.c(((bd.d) eVar).f4259g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(df.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(df.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(df.n nVar) {
        if (nVar instanceof bd.a) {
            if (!this.f27157c.texts.isEmpty()) {
                w(la0.j("\n"));
            }
            w(la0.c(((bd.a) nVar).f4255g));
            w(la0.j("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(df.o oVar) {
        int i10 = this.f27155a;
        if (i10 >= 64) {
            return;
        }
        this.f27155a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.f27155a--;
        }
    }

    @Override
    public final void m(df.q qVar) {
        int i10 = this.f27155a;
        if (i10 >= 64) {
            return;
        }
        this.f27155a = i10 + 1;
        try {
            v(qVar);
        } finally {
            this.f27155a--;
        }
    }

    @Override
    public final void n(df.r rVar) {
        if (!this.f27157c.texts.isEmpty()) {
            w(la0.j("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(df.s sVar) {
        w(la0.j(sVar.f7990g));
    }

    @Override
    public final void q(df.d dVar) {
        w(la0.j(dVar.h));
    }

    @Override
    public final void r(df.g gVar) {
        w(la0.j("\n"));
    }

    @Override
    public final void s(df.k kVar) {
        String str = kVar.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(kVar);
            textemail.email = trim.substring(7);
            w(textemail);
        } else if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(kVar);
            textphone.phone = trim.substring(4);
            w(textphone);
        } else {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = y(kVar);
            texturl.url = trim;
            w(texturl);
        }
    }

    @Override
    public final void t(df.g gVar) {
        String str;
        if (this.f27156b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(la0.j(str));
    }

    @Override
    public final void u(df.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f27157c.texts.add(richText);
    }

    public final TL_iv.RichText y(df.p pVar) {
        TL_iv.textConcat textconcat = this.f27157c;
        this.f27157c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.f27157c);
        this.f27157c = textconcat;
        return x10;
    }
}
